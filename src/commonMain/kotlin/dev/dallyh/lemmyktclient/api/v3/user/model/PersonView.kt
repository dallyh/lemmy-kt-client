package dev.dallyh.lemmyktclient.api.v3.user.model

import kotlinx.serialization.Serializable

@Serializable
data class PersonView internal constructor(
    val person: Person,
    val counts: PersonAggregates,
)
