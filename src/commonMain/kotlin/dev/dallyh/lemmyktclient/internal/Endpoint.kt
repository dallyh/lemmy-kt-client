package dev.dallyh.lemmyktclient.internal

import dev.dallyh.lemmyktclient.client.HttpApi
import io.ktor.http.*
import kotlin.jvm.JvmInline

@JvmInline
internal value class Endpoint(
    val location: String
)

internal fun Endpoint.getUrlApiPath(): Url {
    val segments: List<String> = listOf(V3_API_PATH, this.location)
    val url = URLBuilder(Url(HttpApi.host)).appendPathSegments(segments).build()
    println("API endpoint URL: $url")
    return url
}

internal fun Endpoint.getUrlPath(): Url {
    val url = URLBuilder(Url(HttpApi.host)).appendPathSegments(this.location).build()
    println("Endpoint URL: $url")
    return url
}
