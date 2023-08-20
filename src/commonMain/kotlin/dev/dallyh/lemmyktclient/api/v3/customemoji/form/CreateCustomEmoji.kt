package dev.dallyh.lemmyktclient.api.v3.customemoji.form

import dev.dallyh.lemmyktclient.api.v3.auth.RequireAuthentication
import kotlinx.serialization.Serializable

@Serializable
data class CreateCustomEmoji(
    val category: String,
    val shortcode: String,
    val imageUrl: String,
    val altText: String,
    val keywords: List<String>,
    override val auth: String,
) : RequireAuthentication
