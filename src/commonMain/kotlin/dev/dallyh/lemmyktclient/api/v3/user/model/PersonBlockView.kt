package dev.dallyh.lemmyktclient.api.v3.user.model

import kotlinx.serialization.Serializable

@Serializable
data class PersonBlockView internal constructor(
    val person: Person,
    val target: Person,
)
