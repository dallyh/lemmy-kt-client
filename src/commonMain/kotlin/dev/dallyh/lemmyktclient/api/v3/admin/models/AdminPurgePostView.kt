package dev.dallyh.lemmyktclient.api.v3.admin.models

import dev.dallyh.lemmyktclient.api.v3.community.model.Community
import dev.dallyh.lemmyktclient.api.v3.user.model.Person
import kotlinx.serialization.Serializable

@Serializable
data class AdminPurgePostView internal constructor(
    val adminPurgePost: AdminPurgePost,
    val admin: Person? = null,
    val community: Community,
)
