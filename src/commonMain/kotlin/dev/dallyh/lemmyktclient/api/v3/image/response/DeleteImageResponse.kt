package dev.dallyh.lemmyktclient.api.v3.image.response

import kotlinx.serialization.Serializable

@Serializable
data class DeleteImageResponse internal constructor(
    val status: Int,
    val message: String?
)
