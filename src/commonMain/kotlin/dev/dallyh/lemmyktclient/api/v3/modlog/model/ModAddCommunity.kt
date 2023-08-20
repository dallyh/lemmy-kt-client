package dev.dallyh.lemmyktclient.api.v3.modlog.model

import dev.dallyh.lemmyktclient.api.v3.aliases.CommunityId
import dev.dallyh.lemmyktclient.api.v3.aliases.PersonId
import dev.dallyh.lemmyktclient.internal.LemmyDateSerializer
import kotlinx.datetime.Instant
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ModAddCommunity internal constructor(
    val id: Int,
    val modPersonId: PersonId,
    val otherPersonId: PersonId,
    val communityId: CommunityId,
    val removed: Boolean,
    @Serializable(with = LemmyDateSerializer::class)
    @SerialName("when_")
    val actionDate: Instant,
)
