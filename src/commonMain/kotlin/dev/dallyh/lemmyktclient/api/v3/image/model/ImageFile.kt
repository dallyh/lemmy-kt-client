package dev.dallyh.lemmyktclient.api.v3.image.model

import kotlinx.serialization.Serializable

@Serializable
data class ImageFile internal constructor(
    var file: String,
    var deleteToken: String
)
