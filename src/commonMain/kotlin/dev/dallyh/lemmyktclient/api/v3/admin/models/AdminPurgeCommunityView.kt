package dev.dallyh.lemmyktclient.api.v3.admin.models

import dev.dallyh.lemmyktclient.api.v3.user.model.Person
import kotlinx.serialization.Serializable

@Serializable
data class AdminPurgeCommunityView internal constructor(
    val adminPurgeCommunity: AdminPurgeCommunity,
    val admin: Person? = null,
)
