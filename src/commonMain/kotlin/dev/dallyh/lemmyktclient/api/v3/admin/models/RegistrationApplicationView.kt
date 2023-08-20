package dev.dallyh.lemmyktclient.api.v3.admin.models

import dev.dallyh.lemmyktclient.api.v3.user.model.LocalUser
import dev.dallyh.lemmyktclient.api.v3.user.model.Person
import kotlinx.serialization.Serializable

@Serializable
data class RegistrationApplicationView internal constructor(
    val registrationApplication: RegistrationApplication,
    val creatorLocalUser: LocalUser,
    val creator: Person,
    val admin: Person? = null,
)
