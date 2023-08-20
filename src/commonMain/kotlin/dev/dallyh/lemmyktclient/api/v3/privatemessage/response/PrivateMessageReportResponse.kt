package dev.dallyh.lemmyktclient.api.v3.privatemessage.response

import dev.dallyh.lemmyktclient.api.v3.privatemessage.model.PrivateMessageReportView
import kotlinx.serialization.Serializable

@Serializable
data class PrivateMessageReportResponse internal constructor(
    val privateMessageReportView: PrivateMessageReportView,
)
