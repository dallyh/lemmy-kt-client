package dev.dallyh.lemmyktclient.api.v3.modlog.model

import dev.dallyh.lemmyktclient.api.v3.community.model.Community
import dev.dallyh.lemmyktclient.api.v3.user.model.Person
import kotlinx.serialization.Serializable

@Serializable
data class ModTransferCommunityView internal constructor(
    val modTransferCommunity: ModTransferCommunity,
    val moderator: Person? = null,
    val community: Community,
    val moddedPerson: Person,
)
