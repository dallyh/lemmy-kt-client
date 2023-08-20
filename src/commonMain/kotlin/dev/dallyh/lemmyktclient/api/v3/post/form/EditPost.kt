package dev.dallyh.lemmyktclient.api.v3.post.form

import dev.dallyh.lemmyktclient.api.v3.aliases.LanguageId
import dev.dallyh.lemmyktclient.api.v3.aliases.PostId
import dev.dallyh.lemmyktclient.api.v3.auth.RequireAuthentication
import kotlinx.serialization.Serializable

@Serializable
data class EditPost(
    val postId: PostId,
    val name: String? = null,
    val url: String? = null,
    val body: String? = null,
    val nsfw: Boolean? = null,
    val languageId: LanguageId? = null,
    override val auth: String,
) : RequireAuthentication
