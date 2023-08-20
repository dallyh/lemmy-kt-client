package dev.dallyh.lemmyktclient.api.v3.post.form

import dev.dallyh.lemmyktclient.api.v3.aliases.PostId
import dev.dallyh.lemmyktclient.api.v3.auth.RequireAuthentication
import kotlinx.serialization.Serializable

@Serializable
data class CreatePostLike(
    val postId: PostId,
    val score: Int,
    override val auth: String,
) : RequireAuthentication
