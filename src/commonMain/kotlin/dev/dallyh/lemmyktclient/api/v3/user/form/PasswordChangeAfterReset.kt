package dev.dallyh.lemmyktclient.api.v3.user.form

import kotlinx.serialization.Serializable

@Serializable
data class PasswordChangeAfterReset(
    val token: String,
    val password: String,
    val passwordVerify: String,
)
