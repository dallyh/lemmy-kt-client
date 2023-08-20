package dev.dallyh.lemmyktclient.api.v3.comment.form

import dev.dallyh.lemmyktclient.api.v3.aliases.CommentId
import dev.dallyh.lemmyktclient.api.v3.auth.OptionalAuthentication
import kotlinx.serialization.Serializable

@Serializable
data class GetComment(
    val id: CommentId,
    override val auth: String? = null,
) : OptionalAuthentication

internal fun GetComment.toParams() = mapOf(
    Pair("id", id.toString()), Pair("auth", auth)
)
