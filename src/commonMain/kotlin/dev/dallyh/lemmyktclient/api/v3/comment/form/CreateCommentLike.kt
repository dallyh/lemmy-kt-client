package dev.dallyh.lemmyktclient.api.v3.comment.form

import dev.dallyh.lemmyktclient.api.v3.aliases.CommentId
import dev.dallyh.lemmyktclient.api.v3.auth.RequireAuthentication
import kotlinx.serialization.Serializable

@Serializable
data class CreateCommentLike(
    val commentId: CommentId,
    val score: Int,
    override val auth: String,
) : RequireAuthentication
