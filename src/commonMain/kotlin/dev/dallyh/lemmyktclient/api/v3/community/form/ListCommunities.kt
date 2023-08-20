package dev.dallyh.lemmyktclient.api.v3.community.form

import dev.dallyh.lemmyktclient.api.v3.auth.OptionalAuthentication
import dev.dallyh.lemmyktclient.api.v3.types.ListingType
import dev.dallyh.lemmyktclient.api.v3.types.SortType
import kotlinx.serialization.Serializable

@Serializable
data class ListCommunities(
    val type: ListingType? /* "All" | "Local" | "Subscribed" */ = null,
    val sort: SortType? /* "Active" | "Hot" | "New" | "Old" | "TopDay" | "TopWeek" | "TopMonth" | "TopYear" | "TopAll" | "MostComments" | "NewComments" */ = null,
    val showNsfw: Boolean? = null,
    val page: Int? = null,
    val limit: Int? = null,
    override val auth: String? = null,
) : OptionalAuthentication

internal fun ListCommunities.asParams() = mapOf(
    Pair("type_", type?.type),
    Pair("sort", sort?.type),
    Pair("show_nsfw", showNsfw?.toString()),
    Pair("page", page?.toString()),
    Pair("limit", limit?.toString()),
    Pair("auth", auth)
)
