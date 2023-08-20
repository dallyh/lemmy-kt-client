package dev.dallyh.lemmyktclient.api.v3.post.form

import dev.dallyh.lemmyktclient.api.v3.aliases.CommunityId
import dev.dallyh.lemmyktclient.api.v3.aliases.LanguageId
import dev.dallyh.lemmyktclient.api.v3.auth.RequireAuthentication
import kotlinx.serialization.Serializable

@Serializable
data class CreatePost(
    val name: String,
    val communityId: CommunityId,
    val url: String? = null,
    val body: String? = null,
    val honeypot: String? = null,
    val nsfw: Boolean? = null,
    val languageId: LanguageId? = null,
    override val auth: String,
) : RequireAuthentication
