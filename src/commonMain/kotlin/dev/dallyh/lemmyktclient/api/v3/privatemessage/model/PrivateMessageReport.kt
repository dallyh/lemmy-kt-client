package dev.dallyh.lemmyktclient.api.v3.privatemessage.model

import dev.dallyh.lemmyktclient.api.v3.aliases.PersonId
import dev.dallyh.lemmyktclient.api.v3.aliases.PrivateMessageId
import dev.dallyh.lemmyktclient.api.v3.aliases.PrivateMessageReportId
import dev.dallyh.lemmyktclient.internal.LemmyDateSerializer
import kotlinx.datetime.Instant
import kotlinx.serialization.Serializable

@Serializable
data class PrivateMessageReport internal constructor(
    val id: PrivateMessageReportId,
    val creatorId: PersonId,
    val privateMessageId: PrivateMessageId,
    val originalPmText: String,
    val reason: String,
    val resolved: Boolean,
    val resolverId: PersonId? = null,
    @Serializable(with = LemmyDateSerializer::class)
    val published: Instant,
    @Serializable(with = LemmyDateSerializer::class)
    val updated: Instant? = null,
)
