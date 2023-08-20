package dev.dallyh.lemmyktclient.api.v3.privatemessage.model

import dev.dallyh.lemmyktclient.api.v3.user.model.Person
import kotlinx.serialization.Serializable

@Serializable
data class PrivateMessageReportView internal constructor(
    val privateMessageReport: PrivateMessageReport,
    val privateMessage: PrivateMessage,
    val privateMessageCreator: Person,
    val creator: Person,
    val resolver: Person? = null,
)
