package dev.dallyh.lemmyktclient.api.v3.customemoji.model

import dev.dallyh.lemmyktclient.api.v3.aliases.CustomEmojiId
import dev.dallyh.lemmyktclient.api.v3.aliases.LocalSiteId
import dev.dallyh.lemmyktclient.internal.LemmyDateSerializer
import kotlinx.datetime.Instant
import kotlinx.serialization.Serializable

@Serializable
data class CustomEmoji internal constructor(
    val id: CustomEmojiId,
    val localSiteId: LocalSiteId,
    val shortcode: String,
    val imageUrl: String,
    val altText: String,
    val category: String,
    @Serializable(with = LemmyDateSerializer::class)
    val published: Instant,
    @Serializable(with = LemmyDateSerializer::class)
    val updated: Instant? = null,
)
