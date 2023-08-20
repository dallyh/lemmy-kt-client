package dev.dallyh.lemmyktclient.api.v3.privatemessage.response

import dev.dallyh.lemmyktclient.api.v3.privatemessage.model.PrivateMessageReportView

data class ListPrivateMessageReportsResponse internal constructor(
    val privateMessageReports: List<PrivateMessageReportView>,
)
