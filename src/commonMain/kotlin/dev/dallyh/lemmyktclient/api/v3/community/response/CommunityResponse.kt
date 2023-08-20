package dev.dallyh.lemmyktclient.api.v3.community.response

import dev.dallyh.lemmyktclient.api.v3.aliases.LanguageId
import dev.dallyh.lemmyktclient.api.v3.community.model.CommunityView
import kotlinx.serialization.Serializable

@Serializable
data class CommunityResponse internal constructor(
    val communityView: CommunityView,
    val discussionLanguages: List<LanguageId>,
)
