package dev.dallyh.lemmyktclient.api.v3.types

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
enum class CommentSortType(val type: String) {
    @SerialName("Hot")
    HOT("Hot"),

    @SerialName("Top")
    TOP("Top"),

    @SerialName("New")
    NEW("New"),

    @SerialName("Old")
    OLD("Old"),
}