package dev.dallyh.lemmyktclient.api.v3.auth

import kotlinx.serialization.Serializable

@Serializable
data class Auth(override val auth: String) : RequireAuthentication

internal fun Auth.toParams() = mapOf(Pair("auth", auth))
