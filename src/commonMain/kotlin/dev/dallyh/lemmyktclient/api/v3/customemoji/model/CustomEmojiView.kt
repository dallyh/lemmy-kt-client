package dev.dallyh.lemmyktclient.api.v3.customemoji.model

import kotlinx.serialization.Serializable

@Serializable
data class CustomEmojiView internal constructor(
    val customEmoji: CustomEmoji,
    val keywords: List<CustomEmojiKeyword>,
)
