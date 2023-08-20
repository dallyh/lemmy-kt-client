package dev.dallyh.lemmyktclient.api.v3.community.response

import dev.dallyh.lemmyktclient.api.v3.community.model.CommunityModeratorView
import kotlinx.serialization.Serializable

@Serializable
data class AddModToCommunityResponse internal constructor(
    val moderators: List<CommunityModeratorView>,
)
