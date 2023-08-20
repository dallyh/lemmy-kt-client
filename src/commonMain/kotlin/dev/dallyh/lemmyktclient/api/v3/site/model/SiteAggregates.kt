package dev.dallyh.lemmyktclient.api.v3.site.model

import dev.dallyh.lemmyktclient.api.v3.aliases.SiteId
import kotlinx.serialization.Serializable

@Serializable
data class SiteAggregates internal constructor(
    val id: Int,
    val siteId: SiteId,
    val users: Int,
    val posts: Int,
    val comments: Int,
    val communities: Int,
    val usersActiveDay: Int,
    val usersActiveWeek: Int,
    val usersActiveMonth: Int,
    val usersActiveHalfYear: Int,
    val hotRank: Int,
)
