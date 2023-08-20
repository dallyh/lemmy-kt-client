package dev.dallyh.lemmyktclient.api.v3.image

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.Serializer

@Serializable
enum class ImageFormat(val type: String) {
    JPG("jpg"),
    PNG("png"),
    WEBP("webp"),
    APNG("apng"),
    AVIF("avif"),
    GIF("gif"),
    JXL("jxl"),
}