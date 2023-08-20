package dev.dallyh.lemmyktclient.api.v3.site.response

import dev.dallyh.lemmyktclient.api.v3.site.model.SiteView
import dev.dallyh.lemmyktclient.api.v3.site.model.Tagline
import kotlinx.serialization.Serializable

@Serializable
data class SiteResponse internal constructor(
    val siteView: SiteView, val taglines: List<Tagline>
)
