package dev.dallyh.lemmyktclient.api.v3.comment.response

import dev.dallyh.lemmyktclient.api.v3.comment.model.CommentReportView
import kotlinx.serialization.Serializable

@Serializable
data class CommentReportResponse internal constructor(
    val commentReportView: CommentReportView,
)
