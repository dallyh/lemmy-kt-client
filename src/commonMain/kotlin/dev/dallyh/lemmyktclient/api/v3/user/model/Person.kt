package dev.dallyh.lemmyktclient.api.v3.user.model

import dev.dallyh.lemmyktclient.api.v3.aliases.InstanceId
import dev.dallyh.lemmyktclient.api.v3.aliases.PersonId
import dev.dallyh.lemmyktclient.internal.LemmyDateSerializer
import kotlinx.datetime.Instant
import kotlinx.serialization.Serializable

@Serializable
data class Person internal constructor(
    val id: PersonId,
    val name: String,
    val displayName: String? = null,
    val avatar: String? = null,
    val banned: Boolean,
    @Serializable(with = LemmyDateSerializer::class)
    val published: Instant,
    @Serializable(with = LemmyDateSerializer::class)
    val updated: Instant? = null,
    val actorId: String,
    val bio: String? = null,
    val local: Boolean,
    val banner: String? = null,
    val deleted: Boolean,
    val matrixUserId: String? = null,
    val admin: Boolean,
    val botAccount: Boolean,
    @Serializable(with = LemmyDateSerializer::class)
    val banExpires: Instant? = null,
    val instanceId: InstanceId,
)
