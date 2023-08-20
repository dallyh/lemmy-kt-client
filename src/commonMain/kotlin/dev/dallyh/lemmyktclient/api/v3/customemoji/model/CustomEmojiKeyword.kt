package dev.dallyh.lemmyktclient.api.v3.customemoji.model

import dev.dallyh.lemmyktclient.api.v3.aliases.CustomEmojiId
import kotlinx.serialization.Serializable

@Serializable
data class CustomEmojiKeyword internal constructor(
    val id: Int,
    val customEmojiId: CustomEmojiId,
    val keyword: String,
)
