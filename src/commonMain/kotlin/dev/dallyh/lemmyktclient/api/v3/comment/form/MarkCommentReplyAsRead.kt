package dev.dallyh.lemmyktclient.api.v3.comment.form

import dev.dallyh.lemmyktclient.api.v3.aliases.CommentReplyId
import dev.dallyh.lemmyktclient.api.v3.auth.RequireAuthentication
import kotlinx.serialization.Serializable

@Serializable
data class MarkCommentReplyAsRead(
    val commentReplyId: CommentReplyId,
    val read: Boolean,
    override val auth: String,
) : RequireAuthentication
