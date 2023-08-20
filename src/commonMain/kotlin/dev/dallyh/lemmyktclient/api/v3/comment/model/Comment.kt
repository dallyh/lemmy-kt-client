package dev.dallyh.lemmyktclient.api.v3.comment.model

import dev.dallyh.lemmyktclient.api.v3.aliases.CommentId
import dev.dallyh.lemmyktclient.api.v3.aliases.LanguageId
import dev.dallyh.lemmyktclient.api.v3.aliases.PersonId
import dev.dallyh.lemmyktclient.api.v3.aliases.PostId
import dev.dallyh.lemmyktclient.internal.LemmyDateSerializer
import kotlinx.datetime.Instant
import kotlinx.serialization.Serializable

@Serializable
data class Comment internal constructor(
    val id: CommentId,
    val creatorId: PersonId,
    val postId: PostId,
    val content: String,
    val removed: Boolean,
    @Serializable(with = LemmyDateSerializer::class)
    val published: Instant,
    @Serializable(with = LemmyDateSerializer::class)
    val updated: Instant? = null,
    val deleted: Boolean,
    val apId: String,
    val local: Boolean,
    val path: String,
    val distinguished: Boolean,
    val languageId: LanguageId,
)
