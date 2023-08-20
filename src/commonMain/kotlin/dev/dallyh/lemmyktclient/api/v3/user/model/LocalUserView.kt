package dev.dallyh.lemmyktclient.api.v3.user.model

import kotlinx.serialization.Serializable

@Serializable
data class LocalUserView internal constructor(
    val localUser: LocalUser,
    val person: Person,
    val counts: PersonAggregates,
)
