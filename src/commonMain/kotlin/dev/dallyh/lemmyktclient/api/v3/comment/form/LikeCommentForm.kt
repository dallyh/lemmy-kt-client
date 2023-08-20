package dev.dallyh.lemmyktclient.api.v3.comment.form

import dev.dallyh.lemmyktclient.api.v3.auth.RequireAuthentication
import kotlinx.serialization.Serializable

@Serializable
data class LikeCommentForm(
    val commentId: Int,
    val score: Int,
    override val auth: String,
) : RequireAuthentication
