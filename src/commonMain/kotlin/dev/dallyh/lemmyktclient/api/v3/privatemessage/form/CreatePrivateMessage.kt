package dev.dallyh.lemmyktclient.api.v3.privatemessage.form

import dev.dallyh.lemmyktclient.api.v3.aliases.PersonId
import dev.dallyh.lemmyktclient.api.v3.auth.RequireAuthentication
import kotlinx.serialization.Serializable

@Serializable
data class CreatePrivateMessage(
    val content: String,
    val recipientId: PersonId,
    override val auth: String,
) : RequireAuthentication
