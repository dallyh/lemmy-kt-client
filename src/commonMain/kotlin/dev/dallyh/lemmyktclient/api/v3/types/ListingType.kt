package dev.dallyh.lemmyktclient.api.v3.types

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
enum class ListingType(val type: String) {
    @SerialName("All")
    ALL("All"),

    @SerialName("Local")
    LOCAL("Local"),

    @SerialName("Subscribed")
    SUBSCRIBED("Subscribed"),

    @SerialName("Community")
    COMMUNITY("Community")
}
