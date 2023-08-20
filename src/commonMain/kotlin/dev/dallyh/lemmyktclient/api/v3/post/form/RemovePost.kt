package dev.dallyh.lemmyktclient.api.v3.post.form

import dev.dallyh.lemmyktclient.api.v3.aliases.PostId
import dev.dallyh.lemmyktclient.api.v3.auth.RequireAuthentication
import kotlinx.serialization.Serializable

@Serializable
data class RemovePost(
    val postId: PostId,
    val removed: Boolean,
    val reason: String? = null,
    override val auth: String,
) : RequireAuthentication
