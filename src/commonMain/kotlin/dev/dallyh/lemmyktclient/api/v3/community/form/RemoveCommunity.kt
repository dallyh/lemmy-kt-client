package dev.dallyh.lemmyktclient.api.v3.community.form

import dev.dallyh.lemmyktclient.api.v3.aliases.CommunityId
import dev.dallyh.lemmyktclient.api.v3.auth.RequireAuthentication
import kotlinx.serialization.Serializable

@Serializable
data class RemoveCommunity(
    val communityId: CommunityId,
    val removed: Boolean,
    val reason: String? = null,
    val expires: Int? = null,
    override val auth: String,
) : RequireAuthentication
