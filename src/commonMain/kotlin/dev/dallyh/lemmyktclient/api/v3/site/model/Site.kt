package dev.dallyh.lemmyktclient.api.v3.site.model

import dev.dallyh.lemmyktclient.api.v3.aliases.InstanceId
import dev.dallyh.lemmyktclient.api.v3.aliases.SiteId
import dev.dallyh.lemmyktclient.internal.LemmyDateSerializer
import kotlinx.datetime.Instant
import kotlinx.serialization.Serializable

@Serializable
data class Site internal constructor(
    val id: SiteId,
    val name: String,
    val sidebar: String? = null,
    @Serializable(with = LemmyDateSerializer::class)
    val published: Instant,
    val updated: String? = null,
    val icon: String? = null,
    val banner: String? = null,
    val description: String? = null,
    val actorId: String,
    val lastRefreshedAt: String,
    val inboxUrl: String,
    val privateKey: String? = null,
    val publicKey: String,
    val instanceId: InstanceId,
)
