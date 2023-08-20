package dev.dallyh.lemmyktclient.api.v3.post.form

import dev.dallyh.lemmyktclient.api.v3.aliases.CommunityId
import dev.dallyh.lemmyktclient.api.v3.types.ListingType
import dev.dallyh.lemmyktclient.api.v3.types.SortType
import kotlinx.serialization.Serializable

@Serializable
data class GetPosts(
    val type: ListingType? /* "All" | "Local" | "Subscribed" */ = null,
    val sort: SortType? /* "Active" | "Hot" | "New" | "Old" | "TopDay" | "TopWeek" | "TopMonth" | "TopYear" | "TopAll" | "MostComments" | "NewComments" */ = null,
    val page: Int? = null,
    val limit: Int? = null,
    val communityId: CommunityId? = null,
    val communityName: String? = null,
    val savedOnly: Boolean? = null,
    val auth: String? = null,
)

internal fun GetPosts.toParams() = mapOf(
    Pair("type_", type?.type),
    Pair("sort", sort?.type),
    Pair("page", page?.toString()),
    Pair("limit", limit?.toString()),
    Pair("community_id", communityId?.toString()),
    Pair("community_name", communityName),
    Pair("saved_only", savedOnly?.toString()),
    Pair("auth", auth)
)

