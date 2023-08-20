package dev.dallyh.lemmyktclient.api.v3.privatemessage.form

import dev.dallyh.lemmyktclient.api.v3.auth.RequireAuthentication
import kotlinx.serialization.Serializable

@Serializable
data class ListPrivateMessageReports(
    val page: Int? = null,
    val limit: Int? = null,
    val unresolvedOnly: Boolean? = null,
    override val auth: String,
) : RequireAuthentication

internal fun ListPrivateMessageReports.toParams() = mapOf(
    Pair("page", page?.toString()),
    Pair("limit", limit?.toString()),
    Pair("unresolved_only", unresolvedOnly?.toString()),
    Pair("auth", auth)
)
