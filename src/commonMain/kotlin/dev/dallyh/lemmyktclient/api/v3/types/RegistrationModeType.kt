package dev.dallyh.lemmyktclient.api.v3.types

import kotlinx.serialization.SerialName

enum class RegistrationModeType(val type: String) {
    @SerialName("Closed")
    CLOSED("Closed"),

    @SerialName("RequireApplication")
    REQUIRE_APPLICATION("RequireApplication"),

    @SerialName("Open")
    OPEN("Open")
}