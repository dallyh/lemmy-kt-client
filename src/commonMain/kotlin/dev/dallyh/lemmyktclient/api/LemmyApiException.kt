package dev.dallyh.lemmyktclient.api

import io.ktor.client.plugins.*
import io.ktor.client.statement.*

// Currently not in use
class LemmyApiException(
    response: HttpResponse, cachedResponseText: String
) : ResponseException(response, cachedResponseText) {

    override val message: String =
        "Client request(${response.call.request.method.value} ${response.call.request.url}) " + "invalid: ${response.status}. Text: \"$cachedResponseText\""
}