package dev.dallyh.lemmyktclient.api.v3.privatemessage.form

import dev.dallyh.lemmyktclient.api.v3.aliases.PrivateMessageId
import dev.dallyh.lemmyktclient.api.v3.auth.RequireAuthentication
import kotlinx.serialization.Serializable

@Serializable
data class MarkPrivateMessageAsRead(
    val privateMessageId: PrivateMessageId,
    val read: Boolean,
    override val auth: String,
) : RequireAuthentication
