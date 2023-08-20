package dev.dallyh.lemmyktclient.api.v3.user.form

import dev.dallyh.lemmyktclient.api.v3.aliases.PersonMentionId
import dev.dallyh.lemmyktclient.api.v3.auth.RequireAuthentication
import kotlinx.serialization.Serializable

@Serializable
data class MarkPersonMentionAsRead(
    val personMentionId: PersonMentionId,
    val read: Boolean,
    override val auth: String,
) : RequireAuthentication
