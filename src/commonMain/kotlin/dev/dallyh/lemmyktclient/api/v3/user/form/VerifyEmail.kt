package dev.dallyh.lemmyktclient.api.v3.user.form

import kotlinx.serialization.Serializable

@Serializable
data class VerifyEmail(
    val token: String,
)
