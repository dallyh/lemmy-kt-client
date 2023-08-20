package dev.dallyh.lemmyktclient.api.v3.admin.models

import dev.dallyh.lemmyktclient.api.v3.post.model.Post
import dev.dallyh.lemmyktclient.api.v3.user.model.Person
import kotlinx.serialization.Serializable

@Serializable
data class AdminPurgeCommentView internal constructor(
    val adminPurgeComment: AdminPurgeComment,
    val admin: Person? = null,
    val post: Post,
)
