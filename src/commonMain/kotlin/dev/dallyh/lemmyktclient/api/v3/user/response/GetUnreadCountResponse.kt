package dev.dallyh.lemmyktclient.api.v3.user.response

import kotlinx.serialization.Serializable

@Serializable
data class GetUnreadCountResponse internal constructor(
    val replies: Int,
    val mentions: Int,
    val privateMessages: Int,
)
