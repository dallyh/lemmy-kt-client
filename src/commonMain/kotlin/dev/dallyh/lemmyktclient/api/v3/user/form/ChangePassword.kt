package dev.dallyh.lemmyktclient.api.v3.user.form

import dev.dallyh.lemmyktclient.api.v3.auth.RequireAuthentication
import kotlinx.serialization.Serializable

@Serializable
data class ChangePassword(
    val newPassword: String,
    val newPasswordVerify: String,
    val oldPassword: String,
    override val auth: String,
) : RequireAuthentication
