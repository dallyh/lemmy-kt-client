package dev.dallyh.lemmyktclient.api.v3.user.form

import dev.dallyh.lemmyktclient.api.v3.aliases.CommunityId
import dev.dallyh.lemmyktclient.api.v3.aliases.PersonId
import dev.dallyh.lemmyktclient.api.v3.auth.OptionalAuthentication
import dev.dallyh.lemmyktclient.api.v3.types.SortType

data class GetPersonDetails(
    val personId: PersonId? = null,
    val username: String? = null,
    val sort: SortType? /* "Active" | "Hot" | "New" | "Old" | "TopDay" | "TopWeek" | "TopMonth" | "TopYear" | "TopAll" | "MostComments" | "NewComments" */ = null,
    val page: Int? = null,
    val limit: Int? = null,
    val communityId: CommunityId? = null,
    val savedOnly: Boolean? = null,
    override val auth: String? = null,
) : OptionalAuthentication

internal fun GetPersonDetails.toParams() = mapOf(
    Pair("person_id", personId?.toString()),
    Pair("username", username),
    Pair("sort", sort?.type),
    Pair("page", page?.toString()),
    Pair("limit", limit?.toString()),
    Pair("community_id", communityId?.toString()),
    Pair("saved_only", savedOnly?.toString()),
    Pair("auth", auth),
)
