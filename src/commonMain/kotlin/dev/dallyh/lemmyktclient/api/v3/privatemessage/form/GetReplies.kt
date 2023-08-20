package dev.dallyh.lemmyktclient.api.v3.privatemessage.form

import dev.dallyh.lemmyktclient.api.v3.types.CommentSortType
import kotlinx.serialization.Serializable

@Serializable
data class GetReplies(
    val sort: CommentSortType? /* "Hot" | "Top" | "New" | "Old" */ = null,
    val page: Int? = null,
    val limit: Int? = null,
    val unreadOnly: Boolean? = null,
    val auth: String,
)

internal fun GetReplies.toParams() = mapOf(
    Pair("sort", sort?.type),
    Pair("page", page?.toString()),
    Pair("limit", limit?.toString()),
    Pair("unread_only", unreadOnly?.toString()),
    Pair("auth", auth)
)
