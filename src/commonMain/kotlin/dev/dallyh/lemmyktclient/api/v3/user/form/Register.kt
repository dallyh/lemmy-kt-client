package dev.dallyh.lemmyktclient.api.v3.user.form

import kotlinx.serialization.Serializable

@Serializable
data class Register(
    val username: String,
    val password: String,
    val passwordVerify: String,
    val showNsfw: Boolean,
    val email: String? = null,
    val captchaUuid: String? = null,
    val captchaAnswer: String? = null,
    val honeypot: String? = null,
    val answer: String? = null,
)
