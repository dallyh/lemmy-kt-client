package dev.dallyh.lemmyktclient.api.v3.comment.form

import dev.dallyh.lemmyktclient.api.v3.aliases.CommentId
import dev.dallyh.lemmyktclient.api.v3.aliases.CommunityId
import dev.dallyh.lemmyktclient.api.v3.aliases.PostId
import dev.dallyh.lemmyktclient.api.v3.auth.OptionalAuthentication
import dev.dallyh.lemmyktclient.api.v3.types.CommentSortType
import dev.dallyh.lemmyktclient.api.v3.types.ListingType
import kotlinx.serialization.Serializable

@Serializable
data class GetComments(
    val type: ListingType? /* "All" | "Local" | "Subscribed" */ = null,
    val sort: CommentSortType? /* "Hot" | "Top" | "New" | "Old" */ = null,
    val maxDepth: Int? = null,
    val page: Int? = null,
    val limit: Int? = null,
    val communityId: CommunityId? = null,
    val communityName: String? = null,
    val postId: PostId? = null,
    val parentId: CommentId? = null,
    val savedOnly: Boolean? = null,
    override val auth: String? = null,
) : OptionalAuthentication

internal fun GetComments.toParams() = mapOf(
    Pair("type_", type?.type),
    Pair("sort", sort?.type),
    Pair("max_depth", page.toString()),
    Pair("page", page?.toString()),
    Pair("limit", limit?.toString()),
    Pair("community_id", communityId?.toString()),
    Pair("community_name", communityName),
    Pair("post_id", postId?.toString()),
    Pair("parent_id", parentId?.toString()),
    Pair("saved_only", savedOnly?.toString()),
    Pair("auth", auth)
)
