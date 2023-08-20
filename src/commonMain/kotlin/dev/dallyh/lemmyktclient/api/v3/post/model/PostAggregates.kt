package dev.dallyh.lemmyktclient.api.v3.post.model

import dev.dallyh.lemmyktclient.api.v3.aliases.PostId
import dev.dallyh.lemmyktclient.internal.LemmyDateSerializer
import kotlinx.datetime.Instant
import kotlinx.serialization.Serializable

@Serializable
data class PostAggregates internal constructor(
    val id: Int,
    val postId: PostId,
    val comments: Int,
    val score: Int,
    val upvotes: Int,
    val downvotes: Int,
    @Serializable(with = LemmyDateSerializer::class)
    val published: Instant,
    val newestCommentTimeNecro: String,
    val newestCommentTime: String,
    val featuredCommunity: Boolean,
    val featuredLocal: Boolean,
    val hotRank: Int,
    val hotRankActive: Int,
)
