package dev.dallyh.lemmyktclient.api.v3.user.model

import dev.dallyh.lemmyktclient.api.v3.aliases.LocalUserId
import dev.dallyh.lemmyktclient.api.v3.aliases.PersonId
import dev.dallyh.lemmyktclient.api.v3.types.ListingType
import dev.dallyh.lemmyktclient.api.v3.types.SortType
import kotlinx.serialization.Serializable

@Serializable
data class LocalUser internal constructor(
    val id: LocalUserId,
    val personId: PersonId,
    val email: String? = null,
    val showNsfw: Boolean,
    val theme: String,
    val defaultSortType: SortType, /* "Active" | "Hot" | "New" | "Old" | "TopDay" | "TopWeek" | "TopMonth" | "TopYear" | "TopAll" | "MostComments" | "NewComments" */
    val defaultListingType: ListingType, /* "All" | "Local" | "Subscribed" */
    val interfaceLanguage: String,
    val showAvatars: Boolean,
    val sendNotificationsToEmail: Boolean,
    val validatorTime: String,
    val showScores: Boolean,
    val showBotAccounts: Boolean,
    val showReadPosts: Boolean,
    val showNewPostNotifs: Boolean,
    val emailVerified: Boolean,
    val acceptedApplication: Boolean,
    val totp2FaUrl: String? = null,
)
