package dev.dallyh.lemmyktclient.api.v3.community.form

import dev.dallyh.lemmyktclient.api.v3.aliases.CommunityId
import dev.dallyh.lemmyktclient.api.v3.aliases.LanguageId
import dev.dallyh.lemmyktclient.api.v3.auth.RequireAuthentication
import kotlinx.serialization.Serializable

@Serializable
data class EditCommunity(
    val communityId: CommunityId,
    val title: String? = null,
    val description: String? = null,
    val icon: String? = null,
    val banner: String? = null,
    val nsfw: Boolean? = null,
    val postingRestrictedToMods: Boolean? = null,
    val discussionLanguages: List<LanguageId>? = null,
    override val auth: String,
) : RequireAuthentication
