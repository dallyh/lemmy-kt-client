package dev.dallyh.lemmyktclient.api.v3.post.response

import dev.dallyh.lemmyktclient.api.v3.post.model.SiteMetadata
import kotlinx.serialization.Serializable

@Serializable
data class GetSiteMetadataResponse internal constructor(
    val metadata: SiteMetadata,
)
