package dev.dallyh.lemmyktclient.api.v3.site.model

import kotlinx.serialization.Serializable

@Serializable
data class SiteView internal constructor(
    val site: Site,
    val localSite: LocalSite,
    val localSiteRateLimit: LocalSiteRateLimit,
    val counts: SiteAggregates,
)
