package dev.dallyh.lemmyktclient.api.v3.admin.form

import dev.dallyh.lemmyktclient.api.v3.aliases.CommentId
import dev.dallyh.lemmyktclient.api.v3.auth.RequireAuthentication
import kotlinx.serialization.Serializable

@Serializable
data class PurgeComment(
    val commentId: CommentId, val reason: String? = null, override val auth: String
) : RequireAuthentication
