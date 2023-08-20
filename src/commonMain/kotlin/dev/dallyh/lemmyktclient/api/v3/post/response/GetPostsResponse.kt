package dev.dallyh.lemmyktclient.api.v3.post.response

import dev.dallyh.lemmyktclient.api.v3.post.model.PostView
import kotlinx.serialization.Serializable

@Serializable
data class GetPostsResponse internal constructor(
    val posts: List<PostView>,
)
