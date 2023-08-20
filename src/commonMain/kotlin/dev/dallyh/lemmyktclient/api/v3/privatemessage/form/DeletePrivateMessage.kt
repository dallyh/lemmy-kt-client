package dev.dallyh.lemmyktclient.api.v3.privatemessage.form

import dev.dallyh.lemmyktclient.api.v3.aliases.PrivateMessageId
import dev.dallyh.lemmyktclient.api.v3.auth.RequireAuthentication
import kotlinx.serialization.Serializable

@Serializable
data class DeletePrivateMessage(
    val privateMessageId: PrivateMessageId,
    val deleted: Boolean,
    override val auth: String,
) : RequireAuthentication
