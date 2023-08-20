package dev.dallyh.lemmyktclient.api.v3.admin.models

import dev.dallyh.lemmyktclient.api.v3.aliases.PersonId
import dev.dallyh.lemmyktclient.api.v3.aliases.PostId
import dev.dallyh.lemmyktclient.internal.LemmyDateSerializer
import kotlinx.datetime.Instant
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class AdminPurgeComment internal constructor(
    val id: Int,
    val adminPersonId: PersonId,
    val postId: PostId,
    val reason: String? = null,
    @Serializable(with = LemmyDateSerializer::class)
    @SerialName("when_")
    val actionDate: Instant,
)
