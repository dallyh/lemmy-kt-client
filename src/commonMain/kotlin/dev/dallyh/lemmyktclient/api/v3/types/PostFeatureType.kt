package dev.dallyh.lemmyktclient.api.v3.types

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Different Subscribed states
 */
@Serializable
enum class PostFeatureType(val type: String) {
    @SerialName("Local")
    LOCAL("Local"),

    @SerialName("Community")
    COMMUNITY("Community")
}