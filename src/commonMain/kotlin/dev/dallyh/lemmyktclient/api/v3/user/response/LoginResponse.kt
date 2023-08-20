package dev.dallyh.lemmyktclient.api.v3.user.response

import kotlinx.serialization.Serializable

@Serializable
data class LoginResponse internal constructor(
    val jwt: String? = null,
    val registrationCreated: Boolean,
    val verifyEmailSent: Boolean,
)
