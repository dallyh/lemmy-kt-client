package dev.dallyh.lemmyktclient.api.v3.community.response

import dev.dallyh.lemmyktclient.api.v3.community.model.CommunityView
import kotlinx.serialization.Serializable

@Serializable
data class ListCommunitiesResponse internal constructor(
    val communities: List<CommunityView>,
)
