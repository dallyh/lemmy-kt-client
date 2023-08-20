package dev.dallyh.lemmyktclient.api.v3.modlog.model

import dev.dallyh.lemmyktclient.api.v3.aliases.CommunityId
import dev.dallyh.lemmyktclient.api.v3.aliases.PersonId
import dev.dallyh.lemmyktclient.internal.LemmyDateSerializer
import kotlinx.datetime.Instant
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ModHideCommunity internal constructor(
    val id: Int,
    val communityId: CommunityId,
    val modPersonId: PersonId,
    @Serializable(with = LemmyDateSerializer::class)
    @SerialName("when_")
    val actionDate: Instant,
    val reason: String? = null,
    val hidden: Boolean,
)
