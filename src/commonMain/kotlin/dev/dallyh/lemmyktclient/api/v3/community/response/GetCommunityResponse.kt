package dev.dallyh.lemmyktclient.api.v3.community.response

import dev.dallyh.lemmyktclient.api.v3.aliases.LanguageId
import dev.dallyh.lemmyktclient.api.v3.community.model.CommunityModeratorView
import dev.dallyh.lemmyktclient.api.v3.community.model.CommunityView
import dev.dallyh.lemmyktclient.api.v3.site.model.Site
import kotlinx.serialization.Serializable

@Serializable
data class GetCommunityResponse internal constructor(
    val communityView: CommunityView,
    val site: Site? = null,
    val moderators: List<CommunityModeratorView>,
    val discussionLanguages: List<LanguageId>,
    val defaultPostLanguage: LanguageId? = null,
)
