package dev.dallyh.lemmyktclient.api.v3.user.response

import dev.dallyh.lemmyktclient.api.v3.comment.model.Comment
import kotlinx.serialization.Serializable

@Serializable
data class GetRepliesResponse internal constructor(val replies: List<Comment>)
