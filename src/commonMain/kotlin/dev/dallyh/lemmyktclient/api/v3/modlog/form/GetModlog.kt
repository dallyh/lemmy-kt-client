package dev.dallyh.lemmyktclient.api.v3.modlog.form

import dev.dallyh.lemmyktclient.api.v3.aliases.CommunityId
import dev.dallyh.lemmyktclient.api.v3.aliases.PersonId
import dev.dallyh.lemmyktclient.api.v3.auth.OptionalAuthentication
import dev.dallyh.lemmyktclient.api.v3.types.ModlogActionType
import kotlinx.serialization.Serializable

@Serializable
data class GetModlog(

    val modPersonId: PersonId? = null,

    val communityId: CommunityId? = null,
    val page: Int? = null,
    val limit: Int? = null,

    val type: ModlogActionType? /* "All" | "ModRemovePost" | "ModLockPost" | "ModFeaturePost" | "ModRemoveComment" | "ModRemoveCommunity" | "ModBanFromCommunity" | "ModAddCommunity" | "ModTransferCommunity" | "ModAdd" | "ModBan" | "ModHideCommunity" | "AdminPurgePerson" | "AdminPurgeCommunity" | "AdminPurgePost" | "AdminPurgeComment" */ = null,

    val otherPersonId: PersonId? = null,
    override val auth: String? = null,
) : OptionalAuthentication

internal fun GetModlog.toParams() = mapOf(
    Pair("mod_person_id", modPersonId?.toString()),
    Pair("community_id", communityId?.toString()),
    Pair("page", page?.toString()),
    Pair("limit", limit?.toString()),
    Pair("type_", type?.type),
    Pair("other_person_id", otherPersonId?.toString()),
    Pair("auth", auth),
)
