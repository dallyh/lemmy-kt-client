package dev.dallyh.lemmyktclient.api.v3.admin.form

import dev.dallyh.lemmyktclient.api.v3.aliases.PersonId
import dev.dallyh.lemmyktclient.api.v3.auth.RequireAuthentication
import kotlinx.serialization.Serializable

@Serializable
data class AddAdmin(
    val personId: PersonId, val added: Boolean, override val auth: String
) : RequireAuthentication
