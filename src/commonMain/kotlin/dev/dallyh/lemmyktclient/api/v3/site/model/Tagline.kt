package dev.dallyh.lemmyktclient.api.v3.site.model

import dev.dallyh.lemmyktclient.api.v3.aliases.InstanceId
import dev.dallyh.lemmyktclient.api.v3.aliases.LocalSiteId
import dev.dallyh.lemmyktclient.internal.LemmyDateSerializer
import kotlinx.datetime.Instant
import kotlinx.serialization.Serializable

@Serializable
data class Tagline internal constructor(
    val id: Int,
    val localSiteId: LocalSiteId,
    val content: String,
    @Serializable(with = LemmyDateSerializer::class)
    val published: Instant,
    val updated: Instant? = null,
)
