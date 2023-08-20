package dev.dallyh.lemmyktclient.api.v3.admin.form

import dev.dallyh.lemmyktclient.api.v3.auth.RequireAuthentication
import kotlinx.serialization.Serializable

@Serializable
data class GetUnreadRegistrationApplicationCount(
    override val auth: String,
) : RequireAuthentication

internal fun GetUnreadRegistrationApplicationCount.toParams() = mapOf(
    Pair("auth", auth)
)
