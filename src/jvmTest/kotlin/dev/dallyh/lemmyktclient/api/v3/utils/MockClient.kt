package dev.dallyh.lemmyktclient.api.v3.utils


import dev.dallyh.lemmyktclient.TEST_HOST
import dev.dallyh.lemmyktclient.api.v3.admin.Admin
import dev.dallyh.lemmyktclient.api.v3.comment.Comment
import dev.dallyh.lemmyktclient.api.v3.community.Community
import dev.dallyh.lemmyktclient.api.v3.customemoji.CustomEmoji
import dev.dallyh.lemmyktclient.api.v3.modlog.Modlog
import dev.dallyh.lemmyktclient.api.v3.post.Post
import dev.dallyh.lemmyktclient.api.v3.privatemessage.PrivateMessage
import dev.dallyh.lemmyktclient.api.v3.search.Search
import dev.dallyh.lemmyktclient.api.v3.site.Site
import dev.dallyh.lemmyktclient.api.v3.user.User
import dev.dallyh.lemmyktclient.client.HttpApi
import dev.dallyh.lemmyktclient.client.LemmyClientBase.Companion.defaultConfig
import dev.dallyh.lemmyktclient.internal.V3_API_PATH
import io.ktor.client.*
import io.ktor.client.engine.mock.*
import io.ktor.client.plugins.*
import io.ktor.client.request.*
import io.ktor.http.*
import io.ktor.utils.io.errors.*
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import kotlin.test.asserter

/**
 * Mock client to assist in testing
 *
 * @param httpMethod the method the request should be using
 * @param responseJson the stringified mock response json to return
 * @param endpoint the api endpoint under test
 */

internal class MockClient(
    private val httpMethod: HttpMethod,
    private val endpoint: String,
    private var queryParams: String = "",
    private val responseJson: String = "",
    private val httpStatusCode: HttpStatusCode = HttpStatusCode.OK,
    private val simulateConnectionError: Boolean = false,
    private val simulateTimeout: Boolean = false,
) {
    private val client = HttpClient(MockEngine) {
        defaultConfig()
        engine {
            addHandler { request ->
                if (simulateConnectionError) {
                    throw IOException("Connection error")
                }

                if (simulateTimeout) {
                    throw ConnectTimeoutException(request)
                }
                validateRequest(request)
                when (request.url.fullUrl) {
                    fullUrl -> {
                        respond(
                            content = responseJson,
                            status = httpStatusCode,
                            headers = headersOf("Content-Type" to listOf("application/json"))
                        )
                    }

                    else -> asserter.fail("Unhandled ${request.url.fullUrl}")
                }
            }
        }
    }

    private val fullUrl = "$TEST_HOST/$V3_API_PATH/$endpoint$queryParams"

    private fun validateRequest(request: HttpRequestData) {
        assertEquals(fullUrl, request.url.fullUrl)
        assertEquals(httpMethod, request.method, "HttpMethod is set correctly")
        if (httpMethod != HttpMethod.Get) {
            assertTrue(
                request.headers.contains("Accept", "application/json"),
                "Request contains application/json accept header"
            )
            assertTrue(
                request.headers.contains("Accept-Charset", "UTF-8"),
                "Request contains UTF-8 accept-charset header"
            )
        }
    }

    init {
        HttpApi.client = this@MockClient.client
        HttpApi.host = TEST_HOST
    }

    val admin: Admin = Admin()
    val comment: Comment = Comment()
    val community: Community = Community()
    val customEmoji: CustomEmoji = CustomEmoji()
    val modLog: Modlog = Modlog()
    val post: Post = Post()
    val privateMessage: PrivateMessage = PrivateMessage()
    val search: Search = Search()
    val site: Site = Site()
    val user: User = User()

    private val Url.fullUrl: String get() = "$TEST_HOST$fullPath"
}
