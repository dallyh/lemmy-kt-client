package dev.dallyh.lemmyktclient.api.v3.privatemessage.form

import dev.dallyh.lemmyktclient.api.v3.auth.RequireAuthentication
import kotlinx.serialization.Serializable

@Serializable
data class GetPrivateMessages(
    val unreadOnly: Boolean? = null,
    val page: Int? = null,
    val limit: Int? = null,
    override val auth: String,
) : RequireAuthentication

internal fun GetPrivateMessages.toParams() = mapOf(
    Pair("unread_only", unreadOnly.toString()),
    Pair("page", page?.toString()),
    Pair("limit", limit?.toString()),
    Pair("auth", auth)
)
