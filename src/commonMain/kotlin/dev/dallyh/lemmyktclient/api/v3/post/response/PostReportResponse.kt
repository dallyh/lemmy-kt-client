package dev.dallyh.lemmyktclient.api.v3.post.response

import dev.dallyh.lemmyktclient.api.v3.post.model.PostReportView
import kotlinx.serialization.Serializable

@Serializable
data class PostReportResponse internal constructor(
    val postReportView: PostReportView,
)
