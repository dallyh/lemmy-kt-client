package dev.dallyh.lemmyktclient.api.v3.admin.response

import kotlinx.serialization.Serializable

@Serializable
data class PurgeItemResponse internal constructor(
    val success: Boolean,
)
