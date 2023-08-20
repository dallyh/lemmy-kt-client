package dev.dallyh.lemmyktclient.api.v3.comment.response

import dev.dallyh.lemmyktclient.api.v3.comment.model.CommentView
import kotlinx.serialization.Serializable

@Serializable
data class GetCommentsResponse internal constructor(
    val comments: List<CommentView>,
)
