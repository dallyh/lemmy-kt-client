package dev.dallyh.lemmyktclient.api.v3.comment.form

import dev.dallyh.lemmyktclient.api.v3.aliases.CommentId
import dev.dallyh.lemmyktclient.api.v3.auth.RequireAuthentication
import kotlinx.serialization.Serializable

@Serializable
data class SaveComment(
    val commentId: CommentId,
    val save: Boolean,
    override val auth: String,
) : RequireAuthentication
