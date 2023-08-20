package dev.dallyh.lemmyktclient.api.v3.privatemessage.response

import dev.dallyh.lemmyktclient.api.v3.privatemessage.model.PrivateMessage
import kotlinx.serialization.Serializable

@Serializable
data class PrivateMessageResponse internal constructor(val message: PrivateMessage)
