package dev.dallyh.lemmyktclient.api.v3.user.form

import dev.dallyh.lemmyktclient.api.v3.auth.RequireAuthentication
import kotlinx.serialization.Serializable

@Serializable
data class LeaveAdmin(
    override val auth: String,
) : RequireAuthentication
