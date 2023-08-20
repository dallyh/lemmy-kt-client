package dev.dallyh.lemmyktclient.api.v3.user.model

import dev.dallyh.lemmyktclient.api.v3.comment.model.Comment
import dev.dallyh.lemmyktclient.api.v3.comment.model.CommentAggregates
import dev.dallyh.lemmyktclient.api.v3.community.model.Community
import dev.dallyh.lemmyktclient.api.v3.post.model.Post
import dev.dallyh.lemmyktclient.api.v3.types.SubscribedType
import kotlinx.serialization.Serializable

@Serializable
data class PersonMentionView internal constructor(
    val personMention: PersonMention,
    val comment: Comment,
    val creator: Person,
    val post: Post,
    val community: Community,
    val recipient: Person,
    val counts: CommentAggregates,
    val creatorBannedFromCommunity: Boolean,
    val subscribed: SubscribedType, /* "Subscribed" | "NotSubscribed" | "Pending" */
    val saved: Boolean,
    val creatorBlocked: Boolean,
    val myVote: Int? = null,
)
