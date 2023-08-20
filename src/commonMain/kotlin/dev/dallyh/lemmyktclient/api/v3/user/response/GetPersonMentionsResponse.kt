package dev.dallyh.lemmyktclient.api.v3.user.response

import dev.dallyh.lemmyktclient.api.v3.user.model.PersonMentionView
import kotlinx.serialization.Serializable

@Serializable
data class GetPersonMentionsResponse internal constructor(
    val mentions: List<PersonMentionView>,
)
