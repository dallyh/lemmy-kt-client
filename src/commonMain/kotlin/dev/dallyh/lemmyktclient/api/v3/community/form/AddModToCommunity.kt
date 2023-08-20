package dev.dallyh.lemmyktclient.api.v3.community.form

import dev.dallyh.lemmyktclient.api.v3.aliases.CommunityId
import dev.dallyh.lemmyktclient.api.v3.aliases.PersonId
import dev.dallyh.lemmyktclient.api.v3.auth.RequireAuthentication
import kotlinx.serialization.Serializable

@Serializable
data class AddModToCommunity(
    val communityId: CommunityId,
    val personId: PersonId,
    val added: Boolean,
    override val auth: String,
) : RequireAuthentication
