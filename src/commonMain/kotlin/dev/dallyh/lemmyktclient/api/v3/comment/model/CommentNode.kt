package dev.dallyh.lemmyktclient.api.v3.comment.model

import kotlinx.serialization.Serializable

@Serializable
data class CommentNode internal constructor(
    val comment: Comment, val children: List<CommentNode>?
)
