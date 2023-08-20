package dev.dallyh.lemmyktclient.api.v3.modlog.response


import dev.dallyh.lemmyktclient.api.v3.admin.models.AdminPurgeCommentView
import dev.dallyh.lemmyktclient.api.v3.admin.models.AdminPurgeCommunityView
import dev.dallyh.lemmyktclient.api.v3.admin.models.AdminPurgePersonView
import dev.dallyh.lemmyktclient.api.v3.admin.models.AdminPurgePostView
import dev.dallyh.lemmyktclient.api.v3.modlog.model.*
import kotlinx.serialization.Serializable

@Serializable
data class GetModlogResponse internal constructor(
    val removedPosts: List<ModRemovePostView>,
    val lockedPosts: List<ModLockPostView>,
    val featuredPosts: List<ModFeaturePostView>,
    val removedComments: List<ModRemoveCommentView>,
    val removedCommunities: List<ModRemoveCommunityView>,
    val bannedFromCommunity: List<ModBanFromCommunityView>,val banned: List<ModBanView>,
    val addedToCommunity: List<ModAddCommunityView>,
    val transferredToCommunity: List<ModTransferCommunityView>,val added: List<ModAddView>,
    val adminPurgedPersons: List<AdminPurgePersonView>,
    val adminPurgedCommunities: List<AdminPurgeCommunityView>,
    val adminPurgedPosts: List<AdminPurgePostView>,
    val adminPurgedComments: List<AdminPurgeCommentView>,
    val hiddenCommunities: List<ModHideCommunityView>,
)
