package dev.dallyh.lemmyktclient.api.v3.customemoji.response

import dev.dallyh.lemmyktclient.api.v3.aliases.CustomEmojiId
import kotlinx.serialization.Serializable

@Serializable
data class DeleteCustomEmojiResponse internal constructor(
    val id: CustomEmojiId,
    val success: Boolean,
)
