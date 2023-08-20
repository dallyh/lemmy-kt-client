package dev.dallyh.lemmyktclient.client

import dev.dallyh.lemmyktclient.internal.CLIENT_VERSION
import io.ktor.client.*
import io.ktor.client.plugins.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.serialization.kotlinx.json.*
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonNamingStrategy

abstract class LemmyClientBase internal constructor(
    private val baseUrl: String,
) {
    internal companion object {
        @OptIn(ExperimentalSerializationApi::class)
        fun HttpClientConfig<*>.defaultConfig() {
            expectSuccess = false

            install(ContentNegotiation) {
                json(Json {
                    prettyPrint = true
                    isLenient = true
                    ignoreUnknownKeys = true
                    explicitNulls = false
                    namingStrategy = JsonNamingStrategy.SnakeCase
                })
            }

            install(UserAgent) {
                agent = "lemmy-kt-client/${CLIENT_VERSION}"
            }
        }
    }

    internal val client by lazy {
        HttpClient {
            defaultConfig()
        }
    }

    init {
        HttpApi.apply {
            host = baseUrl
            client = this@LemmyClientBase.client
        }
    }
}
