package dev.dallyh.lemmyktclient.api.v3.community.response

import dev.dallyh.lemmyktclient.api.v3.user.model.PersonView
import kotlinx.serialization.Serializable

@Serializable
data class BanFromCommunityResponse internal constructor(
    val personView: PersonView,
    val banned: Boolean,
)
