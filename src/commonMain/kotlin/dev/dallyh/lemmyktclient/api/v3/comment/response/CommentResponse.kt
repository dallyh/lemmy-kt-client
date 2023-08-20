package dev.dallyh.lemmyktclient.api.v3.comment.response

import dev.dallyh.lemmyktclient.api.v3.aliases.LocalUserId
import dev.dallyh.lemmyktclient.api.v3.comment.model.CommentView
import kotlinx.serialization.Serializable

@Serializable
data class CommentResponse internal constructor(
    val commentView: CommentView,
    val recipientIds: List<LocalUserId>,
    val formId: String? = null,
)
