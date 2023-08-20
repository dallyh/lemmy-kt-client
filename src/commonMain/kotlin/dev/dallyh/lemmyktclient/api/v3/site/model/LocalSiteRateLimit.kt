package dev.dallyh.lemmyktclient.api.v3.site.model

import dev.dallyh.lemmyktclient.api.v3.aliases.LocalSiteId
import dev.dallyh.lemmyktclient.internal.LemmyDateSerializer
import kotlinx.datetime.Instant
import kotlinx.serialization.Serializable

@Serializable
data class LocalSiteRateLimit internal constructor(
    val id: Int,
    val localSiteId: LocalSiteId,
    val message: Int,
    val messagePerSecond: Int,
    val post: Int,
    val postPerSecond: Int,
    val register: Int,
    val registerPerSecond: Int,
    val image: Int,
    val imagePerSecond: Int,
    val comment: Int,
    val commentPerSecond: Int,
    val search: Int,
    val searchPerSecond: Int,
    @Serializable(with = LemmyDateSerializer::class)
    val published: Instant,
    @Serializable(with = LemmyDateSerializer::class)
    val updated: Instant? = null,
)
