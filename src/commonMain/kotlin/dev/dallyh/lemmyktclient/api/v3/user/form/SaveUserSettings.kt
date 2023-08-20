package dev.dallyh.lemmyktclient.api.v3.user.form

import dev.dallyh.lemmyktclient.api.v3.aliases.LanguageId
import dev.dallyh.lemmyktclient.api.v3.auth.RequireAuthentication
import dev.dallyh.lemmyktclient.api.v3.types.ListingType
import dev.dallyh.lemmyktclient.api.v3.types.SortType
import kotlinx.serialization.Serializable

@Serializable
data class SaveUserSettings(
    val showNsfw: Boolean? = null,
    val showScores: Boolean? = null,
    val theme: String? = null,
    val defaultSortType: SortType? /* "Active" | "Hot" | "New" | "Old" | "TopDay" | "TopWeek" | "TopMonth" | "TopYear" | "TopAll" | "MostComments" | "NewComments" */ = null,
    val defaultListingType: ListingType? /* "All" | "Local" | "Subscribed" */ = null,
    val interfaceLanguage: String? = null,
    val avatar: String? = null,
    val banner: String? = null,
    val displayName: String? = null,
    val email: String? = null,
    val bio: String? = null,
    val matrixUserId: String? = null,
    val showAvatars: Boolean? = null,
    val sendNotificationsToEmail: Boolean? = null,
    val botAccount: Boolean? = null,
    val showBotAccounts: Boolean? = null,
    val showReadPosts: Boolean? = null,
    val showNewPostNotifs: Boolean? = null,
    val discussionLanguages: List<LanguageId>? = null,
    val generateTotp2Fa: Boolean? = null,
    override val auth: String,
) : RequireAuthentication
