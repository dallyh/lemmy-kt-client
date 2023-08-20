package dev.dallyh.lemmyktclient.api.v3.user.model

import dev.dallyh.lemmyktclient.api.v3.aliases.PersonId
import kotlinx.serialization.Serializable

@Serializable
data class PersonAggregates internal constructor(
    val id: Int,
    val personId: PersonId,
    val postCount: Int,
    val postScore: Int,
    val commentCount: Int,
    val commentScore: Int,
)
