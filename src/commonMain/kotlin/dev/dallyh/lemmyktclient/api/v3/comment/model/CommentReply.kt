package dev.dallyh.lemmyktclient.api.v3.comment.model

import dev.dallyh.lemmyktclient.api.v3.aliases.CommentId
import dev.dallyh.lemmyktclient.api.v3.aliases.CommentReplyId
import dev.dallyh.lemmyktclient.api.v3.aliases.PersonId
import dev.dallyh.lemmyktclient.internal.LemmyDateSerializer
import kotlinx.datetime.Instant
import kotlinx.serialization.Serializable

@Serializable
data class CommentReply internal constructor(
    val id: CommentReplyId,
    val recipientId: PersonId,
    val commentId: CommentId,
    val read: Boolean,
    @Serializable(with = LemmyDateSerializer::class)
    val published: Instant,
)
