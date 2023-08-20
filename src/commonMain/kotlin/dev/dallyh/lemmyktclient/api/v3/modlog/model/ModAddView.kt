package dev.dallyh.lemmyktclient.api.v3.modlog.model

import dev.dallyh.lemmyktclient.api.v3.user.model.Person
import kotlinx.serialization.Serializable

@Serializable
data class ModAddView internal constructor(
    val modAdd: ModAdd,
    val moderator: Person? = null,
    val moddedPerson: Person,
)
