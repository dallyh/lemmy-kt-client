package dev.dallyh.lemmyktclient.api.v3.community.model

import dev.dallyh.lemmyktclient.api.v3.user.model.Person
import kotlinx.serialization.Serializable

@Serializable
data class CommunityModeratorView internal constructor(
    val community: Community,
    val moderator: Person,
)
