package dev.dallyh.lemmyktclient.api.v3.user.form

import dev.dallyh.lemmyktclient.api.v3.auth.OptionalAuthentication

data class GetCaptcha(
    override val auth: String? = null,
) : OptionalAuthentication

internal fun GetCaptcha.toParams() = mapOf(
    Pair("auth", auth),
)

