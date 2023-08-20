package dev.dallyh.lemmyktclient.api.v3.site.model

import dev.dallyh.lemmyktclient.api.v3.aliases.LanguageId
import kotlinx.serialization.Serializable

@Serializable
data class Language internal constructor(
    val id: LanguageId,
    val code: String,
    val name: String,
)
