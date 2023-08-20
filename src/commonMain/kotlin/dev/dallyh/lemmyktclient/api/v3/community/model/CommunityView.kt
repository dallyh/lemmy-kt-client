package dev.dallyh.lemmyktclient.api.v3.community.model

import dev.dallyh.lemmyktclient.api.v3.types.SubscribedType
import kotlinx.serialization.Serializable

@Serializable
data class CommunityView internal constructor(
    val community: Community,
    val subscribed: SubscribedType, /* "Subscribed" | "NotSubscribed" | "Pending" */
    val blocked: Boolean,
    val counts: CommunityAggregates,
)
