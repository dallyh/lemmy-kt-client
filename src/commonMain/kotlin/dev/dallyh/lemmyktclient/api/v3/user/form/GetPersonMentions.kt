package dev.dallyh.lemmyktclient.api.v3.user.form

import dev.dallyh.lemmyktclient.api.v3.auth.RequireAuthentication
import dev.dallyh.lemmyktclient.api.v3.types.CommentSortType

data class GetPersonMentions(
    val sort: CommentSortType? /* "Hot" | "Top" | "New" | "Old" */ = null,
    val page: Int? = null,
    val limit: Int? = null,
    val unreadOnly: Boolean? = null,
    override val auth: String,
) : RequireAuthentication

internal fun GetPersonMentions.toParams() = mapOf(
    Pair("sort", sort?.type),
    Pair("page", page?.toString()),
    Pair("limit", limit?.toString()),
    Pair("unread_only", unreadOnly?.toString()),
    Pair("auth", auth),
)
