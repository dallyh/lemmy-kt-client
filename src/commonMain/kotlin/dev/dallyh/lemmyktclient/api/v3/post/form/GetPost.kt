package dev.dallyh.lemmyktclient.api.v3.post.form

import dev.dallyh.lemmyktclient.api.v3.aliases.CommentId
import dev.dallyh.lemmyktclient.api.v3.aliases.PostId
import dev.dallyh.lemmyktclient.api.v3.auth.OptionalAuthentication
import kotlinx.serialization.Serializable

@Serializable
data class GetPost(
    val id: PostId? = null,
    val commentId: CommentId? = null,
    override val auth: String? = null,
) : OptionalAuthentication

internal fun GetPost.toParams() = mapOf(
    Pair("id", id?.toString()),
    Pair("comment_id", commentId?.toString()),
    Pair("auth", auth),
)
