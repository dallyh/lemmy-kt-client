package dev.dallyh.lemmyktclient.api.v3.user.form

import dev.dallyh.lemmyktclient.api.v3.auth.RequireAuthentication

data class GetBannedPersons(
    override val auth: String,
) : RequireAuthentication

internal fun GetBannedPersons.toParams() = mapOf(
    Pair("auth", auth),
)