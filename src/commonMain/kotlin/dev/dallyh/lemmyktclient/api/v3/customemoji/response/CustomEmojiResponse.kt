package dev.dallyh.lemmyktclient.api.v3.customemoji.response

import dev.dallyh.lemmyktclient.api.v3.customemoji.model.CustomEmojiView
import kotlinx.serialization.Serializable

@Serializable
data class CustomEmojiResponse internal constructor(
    val customEmoji: CustomEmojiView,
)
