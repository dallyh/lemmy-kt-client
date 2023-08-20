package dev.dallyh.lemmyktclient.api.v3.post.response

import dev.dallyh.lemmyktclient.api.v3.post.model.PostView
import kotlinx.serialization.Serializable

@Serializable
data class PostResponse internal constructor(
    val postView: PostView,
)
