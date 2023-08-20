package dev.dallyh.lemmyktclient.api.v3.client

import dev.dallyh.lemmyktclient.api.ApiResponse
import dev.dallyh.lemmyktclient.api.v3.admin.Admin
import dev.dallyh.lemmyktclient.api.v3.admin.form.AddAdmin
import dev.dallyh.lemmyktclient.api.v3.admin.json.ADD_ADMIN_RESPONSE
import dev.dallyh.lemmyktclient.api.v3.client.json.ERROR_RESPONSE
import dev.dallyh.lemmyktclient.internal.V3_API_PATH
import dev.dallyh.lemmyktclient.api.v3.utils.MockClient
import dev.dallyh.lemmyktclient.utils.executeTest
import io.ktor.client.network.sockets.*
import io.ktor.http.*
import io.ktor.serialization.*
import io.ktor.utils.io.errors.*
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.asserter


class ClientTest {
    @Test
    fun `http 400 bad request`() {
        executeTest {
            var client = MockClient(
                endpoint = "admin/add",
                httpMethod = HttpMethod.Post,
                httpStatusCode = HttpStatusCode.BadRequest,
                responseJson = ERROR_RESPONSE,
            )

            val form = AddAdmin(
                personId = 3,
                added = true,
                auth = "testauth"
            )

            when (val res = client.admin.addAdmin(form)) {
                is ApiResponse.Success -> {
                    asserter.fail("should not have succeeded")
                }

                is ApiResponse.Error -> {
                    println("${res.statusCode} :: ${res.statusDescription} :: ${res.error} :: ${res.message}")
                    assertEquals(400, res.statusCode, "400 - Passed.")
                }
            }
        }
    }

    @Test
    fun `http 404 not found`() {
        executeTest {
            val client = MockClient(
                endpoint = "admin/add",
                httpMethod = HttpMethod.Post,
                httpStatusCode = HttpStatusCode.NotFound,
                responseJson = ADD_ADMIN_RESPONSE,
            )

            val form = AddAdmin(
                personId = 3,
                added = true,
                auth = "testauth"
            )

            when (val res = client.admin.addAdmin(form)) {
                is ApiResponse.Success -> {
                    asserter.fail("should not have succeeded")
                }

                is ApiResponse.Error -> {
                    println("${res.statusCode} :: ${res.statusDescription} :: ${res.error}")
                    assertEquals(404, res.statusCode, "404 - Passed.")
                }
            }
        }
    }

    @Test
    fun `http 500 server error`() {
        executeTest {
            val client = MockClient(
                endpoint = "admin/add",
                httpMethod = HttpMethod.Post,
                httpStatusCode = HttpStatusCode.InternalServerError,
                responseJson = ADD_ADMIN_RESPONSE,
            )

            val form = AddAdmin(
                personId = 3,
                added = true,
                auth = "testauth"
            )

            when (val res = client.admin.addAdmin(form)) {
                is ApiResponse.Success -> {
                    asserter.fail("should not have succeeded")
                }

                is ApiResponse.Error -> {
                    println("${res.statusCode} :: ${res.statusDescription} :: ${res.error}")
                    assertEquals(500, res.statusCode, "500 - Passed.")
                }
            }
        }
    }

    @Test
    fun `connection error`() {
        executeTest {
            val client = MockClient(
                endpoint = "post/list",
                httpMethod = HttpMethod.Get,
                simulateConnectionError = true,
            )

            assertFailsWith<IOException>("Connection error IO exception passed.") {
                client.post.getPosts()
            }
        }
    }

    @Test
    fun `timeout error`() {
        executeTest {
            val client = MockClient(
                endpoint = "post/list",
                httpMethod = HttpMethod.Get,
                simulateTimeout = true,
            )

            assertFailsWith<ConnectTimeoutException>("Should not have failed") {
                client.post.getPosts()
            }
        }
    }

    @Test
    fun `malformed json serialization error`() {
        executeTest {
            val client = MockClient(
                endpoint = "post/list",
                httpMethod = HttpMethod.Get,
                responseJson = """{<>"name": "value"}""",
            )

            assertFailsWith<JsonConvertException>("Should not have failed.") {
                when (client.post.getPosts()) {
                    is ApiResponse.Success -> {
                        asserter.fail("should not have succeeded")
                    }

                    is ApiResponse.Error -> {
                        asserter.fail("should not have succeeded")
                    }
                }
            }
        }
    }

    @Test
    fun `wrong json to deserialize to class`() {
        executeTest {
            val client = MockClient(
                endpoint = "post/list",
                httpMethod = HttpMethod.Get,
                responseJson = """{"posts": [{"saved": false, "read": false}]}""",
            )

            assertFailsWith<JsonConvertException>("Should not have failed.") {
                when (val res = client.post.getPosts()) {
                    is ApiResponse.Success -> {
                        asserter.fail("should not have succeeded ${res.data.posts}")
                    }

                    is ApiResponse.Error -> {
                        asserter.fail("should not have succeeded")
                    }
                }
            }
        }
    }
}


