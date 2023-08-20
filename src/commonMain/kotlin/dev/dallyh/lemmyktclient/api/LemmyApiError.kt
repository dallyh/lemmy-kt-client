package dev.dallyh.lemmyktclient.api

import kotlinx.serialization.Serializable

@Serializable
data class LemmyApiError internal constructor(
    val error: String, val message: String? = null
) {
    internal fun formatError(): String {
        return  error.replaceFirstChar { it.uppercaseChar() }.replace('_', ' ')
    }
}



