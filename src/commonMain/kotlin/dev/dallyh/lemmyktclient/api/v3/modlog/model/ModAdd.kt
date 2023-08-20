package dev.dallyh.lemmyktclient.api.v3.modlog.model

import dev.dallyh.lemmyktclient.api.v3.aliases.PersonId
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ModAdd internal constructor(
    val id: Int,
    val modPersonId: PersonId,
    val otherPersonId: PersonId,
    val removed: Boolean,
    @SerialName("when_")
    val actionDate: String,
)
