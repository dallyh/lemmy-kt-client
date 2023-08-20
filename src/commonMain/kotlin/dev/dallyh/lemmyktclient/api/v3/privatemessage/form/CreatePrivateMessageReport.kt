package dev.dallyh.lemmyktclient.api.v3.privatemessage.form

import dev.dallyh.lemmyktclient.api.v3.aliases.PrivateMessageId
import dev.dallyh.lemmyktclient.api.v3.auth.RequireAuthentication
import kotlinx.serialization.Serializable

@Serializable
data class CreatePrivateMessageReport(
    val privateMessageId: PrivateMessageId,
    val reason: String,
    override val auth: String,
) : RequireAuthentication
