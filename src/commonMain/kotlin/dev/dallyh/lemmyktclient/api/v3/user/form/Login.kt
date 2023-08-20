package dev.dallyh.lemmyktclient.api.v3.user.form

import kotlinx.serialization.Serializable

@Serializable
data class Login(
    val usernameOrEmail: String,
    val password: String,
    val totp2FaToken: String? = null,
)
