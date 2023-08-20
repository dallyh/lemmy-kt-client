package dev.dallyh.lemmyktclient.api.v3.comment.form

import dev.dallyh.lemmyktclient.api.v3.aliases.CommentId
import dev.dallyh.lemmyktclient.api.v3.aliases.LanguageId
import dev.dallyh.lemmyktclient.api.v3.aliases.PostId
import dev.dallyh.lemmyktclient.api.v3.auth.RequireAuthentication
import kotlinx.serialization.Serializable

@Serializable
data class CreateComment(
    val content: String,
    val postId: PostId,
    val parentId: CommentId? = null,
    val languageId: LanguageId? = null,
    val formId: String? = null,
    override val auth: String,
) : RequireAuthentication
