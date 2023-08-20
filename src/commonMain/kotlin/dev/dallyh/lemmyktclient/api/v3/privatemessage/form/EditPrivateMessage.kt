package dev.dallyh.lemmyktclient.api.v3.privatemessage.form

import dev.dallyh.lemmyktclient.api.v3.aliases.PrivateMessageId
import dev.dallyh.lemmyktclient.api.v3.auth.RequireAuthentication
import kotlinx.serialization.Serializable

@Serializable
data class EditPrivateMessage(
    val privateMessageId: PrivateMessageId,
    val content: String,
    override val auth: String,
) : RequireAuthentication
