package dev.dallyh.lemmyktclient.api.v3.comment.form

import dev.dallyh.lemmyktclient.api.v3.aliases.CommunityId
import dev.dallyh.lemmyktclient.api.v3.auth.RequireAuthentication
import kotlinx.serialization.Serializable

@Serializable
data class ListCommentReports(
    val page: Int? = null,
    val limit: Int? = null,
    val unresolvedOnly: Boolean? = null,
    val communityId: CommunityId? = null,
    override val auth: String,
) : RequireAuthentication

internal fun ListCommentReports.toParams() = mapOf(
    Pair("page", page?.toString()),
    Pair("limit", limit?.toString()),
    Pair("unresolved_only", unresolvedOnly?.toString()),
    Pair("community_id", communityId?.toString()),
    Pair("auth", auth)
)
