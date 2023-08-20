package dev.dallyh.lemmyktclient.api.v3.modlog.model

import dev.dallyh.lemmyktclient.api.v3.community.model.Community
import dev.dallyh.lemmyktclient.api.v3.user.model.Person
import kotlinx.serialization.Serializable

@Serializable
data class ModAddCommunityView internal constructor(
    val modAddCommunity: ModAddCommunity,
    val moderator: Person? = null,
    val community: Community,
    val moddedPerson: Person,
)
