package dev.dallyh.lemmyktclient.api.v3.comment.model

import dev.dallyh.lemmyktclient.api.v3.community.model.Community
import dev.dallyh.lemmyktclient.api.v3.post.model.Post
import dev.dallyh.lemmyktclient.api.v3.user.model.Person
import kotlinx.serialization.Serializable

@Serializable
data class CommentReportView internal constructor(
    val commentReport: CommentReport,
    val comment: Comment,
    val post: Post,
    val community: Community,
    val creator: Person,
    val commentCreator: Person,
    val counts: CommentAggregates,
    val creatorBannedFromCommunity: Boolean,
    val myVote: Int? = null,
    val resolver: Person? = null,
)
