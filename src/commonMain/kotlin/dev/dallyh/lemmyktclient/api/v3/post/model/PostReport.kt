package dev.dallyh.lemmyktclient.api.v3.post.model

import dev.dallyh.lemmyktclient.api.v3.aliases.PersonId
import dev.dallyh.lemmyktclient.api.v3.aliases.PostId
import dev.dallyh.lemmyktclient.api.v3.aliases.PostReportId
import dev.dallyh.lemmyktclient.internal.LemmyDateSerializer
import kotlinx.datetime.Instant
import kotlinx.serialization.Serializable

@Serializable
data class PostReport internal constructor(
    val id: PostReportId,
    val creatorId: PersonId,
    val postId: PostId,
    val originalPostName: String,
    val originalPostUrl: String? = null,
    val originalPostBody: String? = null,
    val reason: String,
    val resolved: Boolean,
    val resolverId: PersonId? = null,
    @Serializable(with = LemmyDateSerializer::class)
    val published: Instant,
    @Serializable(with = LemmyDateSerializer::class)
    val updated: Instant? = null,
)
