package dev.dallyh.lemmyktclient.api.v3.user.form

import dev.dallyh.lemmyktclient.api.v3.auth.RequireAuthentication

data class GetUnreadCount(
    override val auth: String,
) : RequireAuthentication

internal fun GetUnreadCount.toParams() = mapOf(
    Pair("auth", auth),
)
