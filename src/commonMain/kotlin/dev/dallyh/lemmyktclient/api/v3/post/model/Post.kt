package dev.dallyh.lemmyktclient.api.v3.post.model

import dev.dallyh.lemmyktclient.api.v3.aliases.CommunityId
import dev.dallyh.lemmyktclient.api.v3.aliases.LanguageId
import dev.dallyh.lemmyktclient.api.v3.aliases.PersonId
import dev.dallyh.lemmyktclient.api.v3.aliases.PostId
import dev.dallyh.lemmyktclient.internal.LemmyDateSerializer
import kotlinx.datetime.Instant
import kotlinx.serialization.Serializable

@Serializable
data class Post internal constructor(
    val id: PostId,
    val name: String,
    val url: String? = null,
    val body: String? = null,
    val creatorId: PersonId,
    val communityId: CommunityId,
    val removed: Boolean,
    val locked: Boolean,
    @Serializable(with = LemmyDateSerializer::class)
    val published: Instant,
    @Serializable(with = LemmyDateSerializer::class)
    val updated: Instant? = null,
    val deleted: Boolean,
    val nsfw: Boolean,
    val embedTitle: String? = null,
    val embedDescription: String? = null,
    val thumbnailUrl: String? = null,
    val apId: String,
    val local: Boolean,
    val embedVideoUrl: String? = null,
    val languageId: LanguageId,
    val featuredCommunity: Boolean,
    val featuredLocal: Boolean,
)
