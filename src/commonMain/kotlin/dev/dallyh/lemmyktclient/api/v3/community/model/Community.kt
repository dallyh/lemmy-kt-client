package dev.dallyh.lemmyktclient.api.v3.community.model

import dev.dallyh.lemmyktclient.internal.LemmyDateSerializer
import kotlinx.datetime.Instant
import kotlinx.serialization.Serializable

@Serializable
data class Community internal constructor(
    val id: Int,
    val name: String,
    val title: String,
    val description: String? = null,
    val removed: Boolean,
    @Serializable(with = LemmyDateSerializer::class)
    val published: Instant,
    @Serializable(with = LemmyDateSerializer::class)
    val updated: Instant? = null,
    val deleted: Boolean,
    val nsfw: Boolean,
    val actorId: String,
    val local: Boolean,
    val icon: String? = null,
    val banner: String? = null,
    val hidden: Boolean,
    val postingRestrictedToMods: Boolean,
    val instanceId: Int,
)
