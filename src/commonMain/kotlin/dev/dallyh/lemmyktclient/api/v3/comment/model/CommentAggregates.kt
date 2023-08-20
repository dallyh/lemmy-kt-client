package dev.dallyh.lemmyktclient.api.v3.comment.model

import dev.dallyh.lemmyktclient.api.v3.aliases.CommentId
import dev.dallyh.lemmyktclient.internal.LemmyDateSerializer
import kotlinx.datetime.Instant
import kotlinx.serialization.Serializable

@Serializable
data class CommentAggregates internal constructor(
    val id: Int,
    val commentId: CommentId,
    val score: Int,
    val upvotes: Int,
    val downvotes: Int,
    @Serializable(with = LemmyDateSerializer::class)
    val published: Instant,
    val childCount: Int,
    val hotRank: Int,
)

