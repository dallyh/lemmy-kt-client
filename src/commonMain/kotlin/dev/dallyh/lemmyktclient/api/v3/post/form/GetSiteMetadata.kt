package dev.dallyh.lemmyktclient.api.v3.post.form

import kotlinx.serialization.Serializable

@Serializable
data class GetSiteMetadata(
    val url: String,
)

internal fun GetSiteMetadata.toParams() = mapOf(
    Pair("url", url)
)
