package dev.dallyh.lemmyktclient.api.v3.comment.response

import dev.dallyh.lemmyktclient.api.v3.comment.model.CommentReplyView
import kotlinx.serialization.Serializable

@Serializable
data class CommentReplyResponse internal constructor(
    val commentReplyView: CommentReplyView,
)
