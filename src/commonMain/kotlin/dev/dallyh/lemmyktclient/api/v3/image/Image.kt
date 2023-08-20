package dev.dallyh.lemmyktclient.api.v3.image

import dev.dallyh.lemmyktclient.api.ApiResponse
import dev.dallyh.lemmyktclient.api.v3.image.form.DeleteImage
import dev.dallyh.lemmyktclient.api.v3.image.form.GetImage
import dev.dallyh.lemmyktclient.api.v3.image.form.UploadImage
import dev.dallyh.lemmyktclient.api.v3.image.form.asParams
import dev.dallyh.lemmyktclient.api.v3.image.response.DeleteImageResponse
import dev.dallyh.lemmyktclient.api.v3.image.response.GetImageResponse
import dev.dallyh.lemmyktclient.api.v3.image.response.UploadImageResponse
import dev.dallyh.lemmyktclient.client.HttpApi
import dev.dallyh.lemmyktclient.client.HttpApi.buildParameters
import dev.dallyh.lemmyktclient.client.HttpApi.client
import dev.dallyh.lemmyktclient.internal.Endpoint
import dev.dallyh.lemmyktclient.internal.getUrlPath
import io.ktor.client.call.*
import io.ktor.client.request.*
import io.ktor.client.request.forms.*
import io.ktor.client.statement.*
import io.ktor.http.*
import kotlinx.coroutines.withContext
import kotlinx.serialization.json.Json

class Image internal constructor() {

    private val endpoint = Endpoint("pictrs/image")
    private val pictrsUrl = endpoint.getUrlPath()

    /**
     * Uploads image data to pictrs
     */
    suspend fun uploadImage(
        form: UploadImage
    ): ApiResponse<UploadImageResponse> {
        val image = form.image
        val url = pictrsUrl.toString()
        val auth = form.auth

        val formData = formData {
            append("images[]", image, Headers.build {
                // The filename doesn't affect the file type or file name that ends up in pictrs
                append(HttpHeaders.ContentDisposition, "filename=image.jpg")
            })
        }

        println("Posting form with binary data and URL: $url")
        return withContext(HttpApi.dispatcher) {
            client.submitFormWithBinaryData(
                url = url, formData = formData
            ) {
                headers.append(HttpHeaders.Cookie, "jwt=${auth}")
            }
        }.parseUploadResponse()
    }

    /**
     * Highly experimental! Get image from pictrs.
     */
    suspend fun getImage(
        form: GetImage
    ): ApiResponse<GetImageResponse> {
        val url = "$pictrsUrl/${form.file}"
        println("Getting image from URL: $url")
        return withContext(HttpApi.dispatcher) {
            client.get(url) {
                this.buildParameters(form.asParams())
                headers.append(HttpHeaders.Cookie, "jwt=${form.auth}")
            }.handleGetImage()
        }
    }


    /**
     * Highly experimental! Deletes image from pictrs.
     */
    @ExperimentalMultiplatform
    suspend fun deleteImage(
        form: DeleteImage
    ): ApiResponse<DeleteImageResponse> {
        val url = "$pictrsUrl/delete/${form.deleteToken}/${form.file}"
        println("Deleting image with URL: $url")
        return withContext(HttpApi.dispatcher) {
            client.get(url) {
                headers.append(HttpHeaders.Cookie, "jwt=${form.auth}")
            }.handleDeleteResponse(form)
        }
    }

    private suspend inline fun HttpResponse.handleGetImage(): ApiResponse<GetImageResponse> {
        if (status == HttpStatusCode.OK) {
            try {
                return ApiResponse.Success(
                    GetImageResponse(
                        readBytes(), contentType()?.contentType ?: "unknown", contentType()?.contentSubtype ?: "unknown"
                    )
                )
            } catch (t: Throwable) {
                throw t
            }
        }

        return ApiResponse.Error(
            statusCode = status.value, statusDescription = status.description
        )
    }

    private suspend fun tryGetDeletedImage(form: DeleteImage): HttpResponse {
        val url = "$pictrsUrl/${form.file}"
        println("Trying to get deleted image from pictrs: $url")
        return withContext(HttpApi.dispatcher) {
            client.get(url) {
                headers.append(HttpHeaders.Cookie, "jwt=${form.auth}")
            }
        }
    }

    private suspend inline fun HttpResponse.handleDeleteResponse(form: DeleteImage): ApiResponse<DeleteImageResponse> {
        // The endpoint currently always returns 204, so we have to check if the file got deleted
        if (status == HttpStatusCode.NoContent || status == HttpStatusCode.OK) {
            val res = tryGetDeletedImage(form)

            // If it was successfull (200), then the image still exists thus return error
            if (res.status == HttpStatusCode.OK) {
                return ApiResponse.Error(
                    statusCode = 400,
                    statusDescription = "Bad Request",
                    error = "could_not_delete_image",
                    message = "The image was not deleted, please check the parameters."
                )
            }

            // If it was unsuccessful and the response is 404, image got deleted and return success
            if (res.status == HttpStatusCode.NotFound) {
                return ApiResponse.Success(
                    DeleteImageResponse(status = status.value, message = "Image deleted successfully")
                )

            }

            return ApiResponse.Error(
                statusCode = status.value, statusDescription = status.description
            )

        }

        return ApiResponse.Error(
            statusCode = status.value, statusDescription = status.description
        )

    }

    private suspend inline fun HttpResponse.parseUploadResponse(): ApiResponse<UploadImageResponse> {
        if (status == HttpStatusCode.OK || status == HttpStatusCode.Created) {
            val response = ApiResponse.Success<UploadImageResponse>(body())

            if (response.data.msg == "ok") {
                val file = response.data.files?.get(0)
                val deleteUrl = "${pictrsUrl}/delete/${file?.deleteToken}/${file?.file}"
                val url = "${pictrsUrl}/${file?.file}"

                response.data.deleteUrl = deleteUrl
                response.data.url = url
                return ApiResponse.Success(response.data)
            }

            return response

        } else {
            if (status == HttpStatusCode.PayloadTooLarge) {
                return ApiResponse.Error(
                    statusCode = 413,
                    statusDescription = "Content too large",
                    error = "too_large",
                    message = "Image is too large"
                )
            }

            bodyAsText().let {
                try {
                    val uploadResponseError = Json.decodeFromString<UploadImageResponse>(it)
                    return ApiResponse.Error(
                        statusCode = status.value,
                        statusDescription = status.description,
                        error = uploadResponseError.msg,
                    )
                } catch (_: Exception) {
                    return ApiResponse.Error(
                        statusCode = status.value, statusDescription = status.description
                    )
                }
            }
        }
    }
}