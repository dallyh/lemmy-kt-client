package dev.dallyh.lemmyktclient.api.v3.community.form

import dev.dallyh.lemmyktclient.api.v3.aliases.CommunityId
import dev.dallyh.lemmyktclient.api.v3.auth.RequireAuthentication
import kotlinx.serialization.Serializable

@Serializable
data class DeleteCommunity(
    val communityId: CommunityId,
    val deleted: Boolean,
    override val auth: String,
) : RequireAuthentication
