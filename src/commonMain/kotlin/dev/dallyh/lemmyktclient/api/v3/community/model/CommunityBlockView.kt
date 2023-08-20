package dev.dallyh.lemmyktclient.api.v3.community.model

import dev.dallyh.lemmyktclient.api.v3.user.model.Person
import kotlinx.serialization.Serializable

@Serializable
data class CommunityBlockView internal constructor(
    val person: Person,
    val community: Community,
)
