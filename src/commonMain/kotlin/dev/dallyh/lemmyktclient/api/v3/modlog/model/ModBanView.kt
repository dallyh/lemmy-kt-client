package dev.dallyh.lemmyktclient.api.v3.modlog.model

import dev.dallyh.lemmyktclient.api.v3.user.model.Person
import kotlinx.serialization.Serializable

@Serializable
data class ModBanView internal constructor(
    val modBan: ModBan,
    val moderator: Person? = null,
    val bannedPerson: Person,
)
