package dev.dallyh.lemmyktclient.api.v3.community.model

import dev.dallyh.lemmyktclient.internal.LemmyDateSerializer
import kotlinx.datetime.Instant
import kotlinx.serialization.Serializable

@Serializable
data class CommunityAggregates internal constructor(
    val id: Int,
    val communityId: Int,
    val subscribers: Int,
    val posts: Int,
    val comments: Int,
    @Serializable(with = LemmyDateSerializer::class)
    val published: Instant,
    val usersActiveDay: Int,
    val usersActiveWeek: Int,
    val usersActiveMonth: Int,
    val usersActiveHalfYear: Int,
    val hotRank: Int
)
