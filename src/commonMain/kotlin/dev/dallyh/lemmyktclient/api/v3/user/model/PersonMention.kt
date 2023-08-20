package dev.dallyh.lemmyktclient.api.v3.user.model

import dev.dallyh.lemmyktclient.api.v3.aliases.CommentId
import dev.dallyh.lemmyktclient.api.v3.aliases.PersonId
import dev.dallyh.lemmyktclient.api.v3.aliases.PersonMentionId
import kotlinx.serialization.Serializable

@Serializable
data class PersonMention internal constructor(
    val id: PersonMentionId,
    val recipientId: PersonId,
    val commentId: CommentId,
    val read: Boolean,
    val published: String,
)
