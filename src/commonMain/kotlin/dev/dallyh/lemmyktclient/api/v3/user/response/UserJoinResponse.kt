package dev.dallyh.lemmyktclient.api.v3.user.response

import kotlinx.serialization.Serializable

@Serializable
data class UserJoinResponse internal constructor(val joined: Boolean)
