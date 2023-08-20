package dev.dallyh.lemmyktclient.api.v3.types

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
enum class SubscribedType(val type: String) {
    @SerialName("Subscribed")
    SUBSCRIBED("Subscribed"),

    @SerialName("NotSubscribed")
    NOT_SUBSCRIBED("NotSubscribed"),

    @SerialName("Pending")
    PENDING("Pending")
}