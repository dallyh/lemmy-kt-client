package dev.dallyh.lemmyktclient.api.v3.user.model

import dev.dallyh.lemmyktclient.api.v3.aliases.LanguageId
import dev.dallyh.lemmyktclient.api.v3.community.model.CommunityBlockView
import dev.dallyh.lemmyktclient.api.v3.community.model.CommunityFollowerView
import dev.dallyh.lemmyktclient.api.v3.community.model.CommunityModeratorView

data class MyUserInfo internal constructor(
    val localUserView: LocalUserView,
    val follows: List<CommunityFollowerView>,
    val moderates: List<CommunityModeratorView>,
    val communityBlocks: List<CommunityBlockView>,
    val personBlocks: List<PersonBlockView>,
    val discussionLanguages: List<LanguageId>,
)
