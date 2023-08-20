package dev.dallyh.lemmyktclient.api.v3.modlog.model

import dev.dallyh.lemmyktclient.api.v3.community.model.Community
import dev.dallyh.lemmyktclient.api.v3.user.model.Person
import kotlinx.serialization.Serializable

@Serializable
data class ModBanFromCommunityView internal constructor(
    val modBanFromCommunity: ModBanFromCommunity,
    val moderator: Person? = null,
    val community: Community,
    val bannedPerson: Person,
)
