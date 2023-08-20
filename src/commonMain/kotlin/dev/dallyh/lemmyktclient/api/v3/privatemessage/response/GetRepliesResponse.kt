package dev.dallyh.lemmyktclient.api.v3.privatemessage.response

import dev.dallyh.lemmyktclient.api.v3.comment.model.CommentReplyView

data class GetRepliesResponse internal constructor(
    val replies: List<CommentReplyView>,
)
