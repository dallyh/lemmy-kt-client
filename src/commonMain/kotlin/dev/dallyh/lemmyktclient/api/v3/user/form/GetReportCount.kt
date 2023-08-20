package dev.dallyh.lemmyktclient.api.v3.user.form

import dev.dallyh.lemmyktclient.api.v3.aliases.CommunityId
import dev.dallyh.lemmyktclient.api.v3.auth.RequireAuthentication

data class GetReportCount(
    val communityId: CommunityId? = null,
    override val auth: String,
) : RequireAuthentication

internal fun GetReportCount.toParams() = mapOf(
    Pair("community_id", communityId?.toString()),
    Pair("auth", auth),
)
