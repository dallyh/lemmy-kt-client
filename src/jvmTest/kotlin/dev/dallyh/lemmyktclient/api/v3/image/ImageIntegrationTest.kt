package dev.dallyh.lemmyktclient.api.v3.image

import dev.dallyh.lemmyktclient.api.ApiResponse
import dev.dallyh.lemmyktclient.api.v3.image.binary.LEMMY_ICON
import dev.dallyh.lemmyktclient.api.v3.image.form.DeleteImage
import dev.dallyh.lemmyktclient.api.v3.image.form.GetImage
import dev.dallyh.lemmyktclient.api.v3.image.form.UploadImage
import dev.dallyh.lemmyktclient.api.v3.utils.LoginCredentials
import dev.dallyh.lemmyktclient.utils.executeTest
import io.ktor.util.*
import kotlin.test.*


class ImageIntegrationTest: LoginCredentials() {

    var file: String? = null
    var deleteToken: String? = null

    @Test
    @BeforeTest
    @Ignore
    fun `upload image with the use of real API`() {
        executeTest {
            val image = LEMMY_ICON.decodeBase64Bytes();

            val form = UploadImage(
                image = image, auth = jwtToken ?: ""
            )

            when (val res = client.image.uploadImage(form)) {

                is ApiResponse.Error -> {
                    println("${res.statusCode} :: ${res.statusDescription} :: ${res.error} :: ${res.message}")
                    asserter.fail("API error")
                }

                is ApiResponse.Success -> {
                    file = res.data.files?.get(0)?.file.toString()
                    deleteToken = res.data.files?.get(0)?.deleteToken.toString()
                    println("msg: ${res.data.msg}, image URL ${res.data.url}, delete URL: ${res.data.deleteUrl}")
                    assertEquals("ok", res.data.msg)
                }
            }
        }
    }


    @Test
    @Ignore
    fun `get image from pictrs`() {
        executeTest {

            if (file == null || deleteToken == null) {
                asserter.fail("File or delete token is empty.")
            }

            val form = GetImage(
                file = file!!,
                thumbnail = 15,
                format = ImageFormat.WEBP,
                auth = jwtToken ?: ""
            )

            when (val res = client.image.getImage(form)) {

                is ApiResponse.Error -> {
                    println("${res.statusCode} :: ${res.statusDescription} :: ${res.error} :: ${res.message}")
                    asserter.fail("API error")
                }

                is ApiResponse.Success -> {
                    println("Image get success. byte length ${res.data.image.size}")
                    println(res.data.image.toString())
                    assertEquals(288, res.data.image.size)
                    assertEquals("image", res.data.contentType)
                    assertEquals("webp", res.data.format)
                }
            }
        }
    }

    @OptIn(ExperimentalMultiplatform::class)
    @Test
    @Ignore
    fun `delete image from pictrs`() {
        executeTest {

            if (file == null || deleteToken == null) {
                asserter.fail("File or delete token is empty.")
            }

            val form = DeleteImage(
                deleteToken = deleteToken!!,
                file = file!!,
                auth = jwtToken ?: ""
            )

            when (val res = client.image.deleteImage(form)) {

                is ApiResponse.Error -> {
                    println("${res.statusCode} :: ${res.statusDescription} :: ${res.error} :: ${res.message}")
                    asserter.fail("API error")
                }

                is ApiResponse.Success -> {
                    println("Image delete success")
                    assertEquals(204, res.data.status)
                }
            }
        }
    }

    @OptIn(ExperimentalMultiplatform::class)
    @Test
    @Ignore
    fun `fail to delete image from pictrs`() {
        executeTest {

            val form = DeleteImage(
                deleteToken = "delete-token-45879das",
                file = "23b00ab5-e59a-42e6-b346-eefd4942eab9.png", // This image does exist
                auth = jwtToken ?: ""
            )

            when (val res = client.image.deleteImage(form)) {

                is ApiResponse.Success -> {
                    asserter.fail("should not have passed")
                }

                is ApiResponse.Error -> {
                    println("${res.statusCode} :: ${res.statusDescription} :: ${res.error} :: ${res.message}")
                    assertEquals(400, res.statusCode)
                }

            }
        }
    }
}