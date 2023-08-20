package dev.dallyh.lemmyktclient.api.v3.modlog.model

import dev.dallyh.lemmyktclient.api.v3.community.model.Community
import dev.dallyh.lemmyktclient.api.v3.user.model.Person
import kotlinx.serialization.Serializable

@Serializable
data class ModHideCommunityView internal constructor(
    val modHideCommunity: ModHideCommunity,
    val admin: Person? = null,
    val community: Community,
)
