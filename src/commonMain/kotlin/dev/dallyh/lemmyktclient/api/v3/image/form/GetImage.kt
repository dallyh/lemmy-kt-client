package dev.dallyh.lemmyktclient.api.v3.image.form

import dev.dallyh.lemmyktclient.api.v3.auth.OptionalAuthentication
import dev.dallyh.lemmyktclient.api.v3.community.form.GetCommunity
import dev.dallyh.lemmyktclient.api.v3.image.ImageFormat
import kotlinx.serialization.Serializable

@Serializable
data class GetImage(
    val file: String,
    val thumbnail: Int? = null,
    val format: ImageFormat? = null,
    override val auth: String? = null
): OptionalAuthentication

internal fun GetImage.asParams() = mapOf(
    Pair("thumbnail", thumbnail?.toString()),
    Pair("format", format?.toString()),
)
