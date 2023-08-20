package dev.dallyh.lemmyktclient.api.v3.user.response

import dev.dallyh.lemmyktclient.api.v3.user.model.PersonView
import kotlinx.serialization.Serializable

@Serializable
data class BlockPersonResponse internal constructor(
    val personView: PersonView,
    val blocked: Boolean,
)
