package dev.dallyh.lemmyktclient.api.v3.admin.models

import dev.dallyh.lemmyktclient.api.v3.aliases.LocalUserId
import dev.dallyh.lemmyktclient.api.v3.aliases.PersonId
import dev.dallyh.lemmyktclient.internal.LemmyDateSerializer
import kotlinx.datetime.Instant
import kotlinx.serialization.Serializable

@Serializable
data class RegistrationApplication internal constructor(
    val id: Int,
    val localUserId: LocalUserId,
    val answer: String,
    val adminId: PersonId? = null,
    val denyReason: String? = null,
    @Serializable(with = LemmyDateSerializer::class)
    val published: Instant,
)
