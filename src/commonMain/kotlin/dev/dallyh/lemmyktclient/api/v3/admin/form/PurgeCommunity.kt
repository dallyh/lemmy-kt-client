package dev.dallyh.lemmyktclient.api.v3.admin.form

import dev.dallyh.lemmyktclient.api.v3.aliases.CommunityId
import dev.dallyh.lemmyktclient.api.v3.auth.RequireAuthentication
import kotlinx.serialization.Serializable

@Serializable
data class PurgeCommunity(
    val communityId: CommunityId,
    val reason: String? = null,
    override val auth: String,
) : RequireAuthentication
