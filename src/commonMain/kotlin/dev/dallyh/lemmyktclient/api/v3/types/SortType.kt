package dev.dallyh.lemmyktclient.api.v3.types

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
enum class SortType(val type: String) {
    @SerialName("Active")
    ACTIVE("Active"),

    @SerialName("Hot")
    HOT("Hot"),

    @SerialName("New")
    NEW("New"),

    @SerialName("Old")
    OLD("Old"),

    @SerialName("TopDay")
    TOP_DAY("TopDay"),

    @SerialName("TopWeek")
    TOP_WEEK("TopWeek"),

    @SerialName("TopMonth")
    TOP_MONTH("TopMonth"),

    @SerialName("TopYear")
    TOP_YEAR("TopYear"),

    @SerialName("TopAll")
    TOP_ALL("TopAll"),

    @SerialName("MostComments")
    MOST_COMMENTS("MostComments"),

    @SerialName("NewComments")
    NEW_COMMENTS("NewCommens"),

    @SerialName("TopHour")
    TOP_HOUR("TopHour"),

    @SerialName("TopSixHour")
    TOP_SIX_HOUR("TopSixHour"),

    @SerialName("TopTwelveHour")
    TOP_TWELVE_HOUR("TopTwelveHour")
}
