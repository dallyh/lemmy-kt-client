package dev.dallyh.lemmyktclient.client

import dev.dallyh.lemmyktclient.api.ApiResponse
import dev.dallyh.lemmyktclient.api.LemmyApiError
import dev.dallyh.lemmyktclient.internal.Endpoint
import dev.dallyh.lemmyktclient.internal.getUrlApiPath
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.request.*
import io.ktor.client.request.forms.*
import io.ktor.client.statement.*
import io.ktor.http.*
import io.ktor.http.content.*
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.serialization.json.Json
import kotlin.native.concurrent.ThreadLocal

internal object HttpApi {

    lateinit var host: String
    lateinit var client: HttpClient
    internal var dispatcher: CoroutineDispatcher = Dispatchers.Default

    suspend inline fun <reified T> get(
        endpoint: Endpoint, parameters: Map<String, String?> = emptyMap()
    ): ApiResponse<T> {
        return send {
            withContext(dispatcher) {
                client.get(endpoint.getUrlApiPath()) {
                    this.buildParameters(parameters)
                }
            }
        }
    }

    suspend inline fun <reified T> put(
        endpoint: Endpoint, body: Any
    ): ApiResponse<T> {
        return send {
            withContext(dispatcher) {
                client.put(endpoint.getUrlApiPath()) {
                    this.commonProperties()
                    this.setBody(body)
                }
            }
        }
    }

    suspend inline fun <reified T> post(
        endpoint: Endpoint, body: Any
    ): ApiResponse<T> {
        return send {
            withContext(dispatcher) {
                client.post(endpoint.getUrlApiPath()) {
                    this.commonProperties()
                    this.setBody(body)
                }
            }
        }
    }

    internal suspend inline fun <reified T> send(res: () -> HttpResponse): ApiResponse<T> {
        println("Status code: " + res().status.value)
        return res().parseResponse()
    }

    internal fun HttpRequestBuilder.buildParameters(map: Map<String, String?>) {
        map.forEach {
            if (!it.value.isNullOrEmpty()) {
                this.parameter(it.key, it.value)
            }
        }
    }

    private fun HttpRequestBuilder.commonProperties() {
        this.contentType(ContentType.Application.Json)
    }

    private suspend inline fun <reified T> HttpResponse.parseResponse(): ApiResponse<T> {
        if (status == HttpStatusCode.OK) {
            return ApiResponse.Success(body())
        } else {
            bodyAsText().let {
                try {
                    val lemmyApiError = Json.decodeFromString<LemmyApiError>(it)
                    return ApiResponse.Error(
                        statusCode = status.value,
                        statusDescription = status.description,
                        error = lemmyApiError.formatError(),
                        message = lemmyApiError.message
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
