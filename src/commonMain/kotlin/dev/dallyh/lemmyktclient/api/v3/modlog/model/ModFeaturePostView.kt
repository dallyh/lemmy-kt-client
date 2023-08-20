package dev.dallyh.lemmyktclient.api.v3.modlog.model

import dev.dallyh.lemmyktclient.api.v3.community.model.Community
import dev.dallyh.lemmyktclient.api.v3.post.model.Post
import dev.dallyh.lemmyktclient.api.v3.user.model.Person
import kotlinx.serialization.Serializable

@Serializable
data class ModFeaturePostView internal constructor(
    val modFeaturePost: ModFeaturePost,
    val moderator: Person? = null,
    val post: Post,
    val community: Community,
)
