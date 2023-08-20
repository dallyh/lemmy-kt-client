package dev.dallyh.lemmyktclient.api.v3.admin.form

import dev.dallyh.lemmyktclient.api.v3.auth.RequireAuthentication
import kotlinx.serialization.Serializable

@Serializable
data class ApproveRegistrationApplication(
    val id: Int,
    val approve: Boolean,
    val denyReason: String? = null,
    override val auth: String,
) : RequireAuthentication
