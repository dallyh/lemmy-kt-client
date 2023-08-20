package dev.dallyh.lemmyktclient.api.v3.resolveobject.form

import dev.dallyh.lemmyktclient.api.v3.auth.OptionalAuthentication

data class ResolveObject (
    val q: String,
    override val auth: String? = null
): OptionalAuthentication

internal fun ResolveObject.toParams() = mapOf(
    Pair("q", q),
    Pair("auth", auth)
)
