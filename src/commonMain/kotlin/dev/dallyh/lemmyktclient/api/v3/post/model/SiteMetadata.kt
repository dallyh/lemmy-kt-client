package dev.dallyh.lemmyktclient.api.v3.post.model

import kotlinx.serialization.Serializable

@Serializable
data class SiteMetadata internal constructor(
    val title: String? = null,
    val description: String? = null,
    val image: String? = null,
    val embedVideoUrl: String? = null,
)
