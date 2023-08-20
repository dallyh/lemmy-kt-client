package dev.dallyh.lemmyktclient.api.v3.search.form

import dev.dallyh.lemmyktclient.api.v3.aliases.CommunityId
import dev.dallyh.lemmyktclient.api.v3.aliases.PersonId
import dev.dallyh.lemmyktclient.api.v3.auth.OptionalAuthentication
import dev.dallyh.lemmyktclient.api.v3.types.ListingType
import dev.dallyh.lemmyktclient.api.v3.types.SearchType
import dev.dallyh.lemmyktclient.api.v3.types.SortType
import kotlinx.serialization.Serializable

@Serializable
data class SearchForm(
    val q: String,
    val communityId: CommunityId? = null,
    val communityName: String? = null,
    val creatorId: PersonId? = null,
    val type: SearchType? /* "All" | "Comments" | "Posts" | "Communities" | "Users" | "Url" */ = null,
    val sort: SortType? /* "Active" | "Hot" | "New" | "Old" | "TopDay" | "TopWeek" | "TopMonth" | "TopYear" | "TopAll" | "MostComments" | "NewComments" */ = null,
    val listingType: ListingType? /* "All" | "Local" | "Subscribed" */ = null,
    val page: Int? = null,
    val limit: Int? = null,
    override val auth: String? = null,
) : OptionalAuthentication

internal fun SearchForm.toParams() = mapOf(
    Pair("q", q),
    Pair("community_id", communityId?.toString()),
    Pair("community_name", communityName),
    Pair("creator_id", creatorId?.toString()),
    Pair("type_", type?.type),
    Pair("sort", sort?.type),
    Pair("listing_type", listingType?.type),
    Pair("page", page?.toString()),
    Pair("limit", limit?.toString()),
    Pair("auth", auth)
)
