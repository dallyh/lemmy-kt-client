package dev.dallyh.lemmyktclient.api.v3.types

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
enum class SearchType(val type: String) {
    @SerialName("All")
    ALL("All"),

    @SerialName("Comments")
    COMMENT("Comments"),

    @SerialName("Posts")
    POST("Posts"),

    @SerialName("Communities")
    COMMUNITY("Communities"),

    @SerialName("Users")
    USER("Users"),

    @SerialName("Url")
    URL("Url")
}
