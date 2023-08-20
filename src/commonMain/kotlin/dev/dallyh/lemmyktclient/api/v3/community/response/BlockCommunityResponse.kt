package dev.dallyh.lemmyktclient.api.v3.community.response

import dev.dallyh.lemmyktclient.api.v3.community.model.CommunityView
import kotlinx.serialization.Serializable

@Serializable
data class BlockCommunityResponse internal constructor(
    val communityView: CommunityView,
    val blocked: Boolean,
)
