package dev.dallyh.lemmyktclient.api.v3.post.form

import dev.dallyh.lemmyktclient.api.v3.aliases.PostId
import dev.dallyh.lemmyktclient.api.v3.auth.RequireAuthentication
import dev.dallyh.lemmyktclient.api.v3.types.PostFeatureType
import kotlinx.serialization.Serializable

@Serializable
data class FeaturePost(
    val postId: PostId,
    val featured: Boolean,
    val featureType: PostFeatureType, /* "Local" | "Community" */
    override val auth: String,
) : RequireAuthentication
