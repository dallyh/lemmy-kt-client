package dev.dallyh.lemmyktclient.api.v3.post.model

import dev.dallyh.lemmyktclient.api.v3.community.model.Community
import dev.dallyh.lemmyktclient.api.v3.types.SubscribedType
import dev.dallyh.lemmyktclient.api.v3.user.model.Person
import kotlinx.serialization.Serializable

@Serializable
data class PostView internal constructor(
    val post: Post,
    val creator: Person,
    val community: Community,
    val creatorBannedFromCommunity: Boolean,
    val counts: PostAggregates,
    val subscribed: SubscribedType, /* "Subscribed" | "NotSubscribed" | "Pending" */
    val saved: Boolean,
    val read: Boolean,
    val creatorBlocked: Boolean,
    val myVote: Int? = null,
    val unreadComments: Int,
)
