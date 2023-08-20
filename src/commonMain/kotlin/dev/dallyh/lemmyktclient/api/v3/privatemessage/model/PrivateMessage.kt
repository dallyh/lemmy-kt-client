package dev.dallyh.lemmyktclient.api.v3.privatemessage.model

import dev.dallyh.lemmyktclient.api.v3.aliases.PersonId
import dev.dallyh.lemmyktclient.api.v3.aliases.PrivateMessageId
import dev.dallyh.lemmyktclient.internal.LemmyDateSerializer
import kotlinx.datetime.Instant
import kotlinx.serialization.Serializable

@Serializable
data class PrivateMessage internal constructor(
    val id: PrivateMessageId,
    val creatorId: PersonId,
    val recipientId: PersonId,
    val content: String,
    val deleted: Boolean,
    val read: Boolean,
    @Serializable(with = LemmyDateSerializer::class)
    val published: Instant,
    @Serializable(with = LemmyDateSerializer::class)
    val updated: Instant? = null,
    val apId: String,
    val local: Boolean,
)
