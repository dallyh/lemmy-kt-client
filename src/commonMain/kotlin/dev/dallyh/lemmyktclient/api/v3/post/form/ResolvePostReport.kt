package dev.dallyh.lemmyktclient.api.v3.post.form

import dev.dallyh.lemmyktclient.api.v3.aliases.PostReportId
import dev.dallyh.lemmyktclient.api.v3.auth.RequireAuthentication
import kotlinx.serialization.Serializable

@Serializable
data class ResolvePostReport(
    val reportId: PostReportId,
    val resolved: Boolean,
    override val auth: String,
) : RequireAuthentication
