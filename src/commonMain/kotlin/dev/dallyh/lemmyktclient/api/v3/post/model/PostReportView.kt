package dev.dallyh.lemmyktclient.api.v3.post.model

import dev.dallyh.lemmyktclient.api.v3.community.model.Community
import dev.dallyh.lemmyktclient.api.v3.user.model.Person
import kotlinx.serialization.Serializable

@Serializable
data class PostReportView internal constructor(
    val postReport: PostReport,
    val post: Post,
    val community: Community,
    val creator: Person,
    val postCreator: Person,
    val creatorBannedFromCommunity: Boolean,
    val myVote: Int? = null,
    val counts: PostAggregates,
    val resolver: Person? = null,
)
