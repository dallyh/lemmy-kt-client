package dev.dallyh.lemmyktclient.api.v3.privatemessage.form

import dev.dallyh.lemmyktclient.api.v3.aliases.PrivateMessageReportId
import dev.dallyh.lemmyktclient.api.v3.auth.RequireAuthentication
import kotlinx.serialization.Serializable

@Serializable
data class ResolvePrivateMessageReport(
    val reportId: PrivateMessageReportId,
    val resolved: Boolean,
    override val auth: String,
) : RequireAuthentication
