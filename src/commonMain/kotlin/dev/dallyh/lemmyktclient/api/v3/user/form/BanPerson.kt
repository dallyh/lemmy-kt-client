package dev.dallyh.lemmyktclient.api.v3.user.form

import dev.dallyh.lemmyktclient.api.v3.aliases.PersonId
import dev.dallyh.lemmyktclient.api.v3.auth.RequireAuthentication

data class BanPerson(
    val personId: PersonId,
    val ban: Boolean,
    val removeData: Boolean? = null,
    val reason: String? = null,
    val expires: Int? = null,
    override val auth: String,
) : RequireAuthentication
