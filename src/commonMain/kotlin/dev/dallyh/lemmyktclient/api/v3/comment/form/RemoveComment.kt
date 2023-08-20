package dev.dallyh.lemmyktclient.api.v3.comment.form

import dev.dallyh.lemmyktclient.api.v3.aliases.CommentId
import dev.dallyh.lemmyktclient.api.v3.auth.RequireAuthentication
import kotlinx.serialization.Serializable

@Serializable
data class RemoveComment(
    val commentId: CommentId,
    val removed: Boolean,
    val reason: String? = null,
    override val auth: String,
) : RequireAuthentication
