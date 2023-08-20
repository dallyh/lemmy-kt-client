package dev.dallyh.lemmyktclient.api.v3.site.form

import dev.dallyh.lemmyktclient.api.v3.aliases.LanguageId
import dev.dallyh.lemmyktclient.api.v3.auth.RequireAuthentication
import dev.dallyh.lemmyktclient.api.v3.types.ListingType
import dev.dallyh.lemmyktclient.api.v3.types.RegistrationModeType
import kotlinx.serialization.Serializable

@Serializable
data class EditSite(
    val name: String? = null,
    val sidebar: String? = null,
    val description: String? = null,
    val icon: String? = null,
    val banner: String? = null,
    val enableDownvotes: Boolean? = null,
    val enableNsfw: Boolean? = null,
    val communityCreationAdminOnly: Boolean? = null,
    val requireEmailVerification: Boolean? = null,
    val applicationQuestion: String? = null,
    val privateInstance: Boolean? = null,
    val defaultTheme: String? = null,
    val defaultPostListingType: ListingType? /* "All" | "Local" | "Subscribed" */ = null,
    val legalInformation: String? = null,
    val applicationEmailAdmins: Boolean? = null,
    val hideModlogModNames: Boolean? = null,
    val discussionLanguages: List<LanguageId>? = null,
    val slurFilterRegex: String? = null,
    val actorNameMaxLength: Int? = null,
    val rateLimitMessage: Int? = null,
    val rateLimitMessagePerSecond: Int? = null,
    val rateLimitPost: Int? = null,
    val rateLimitPostPerSecond: Int? = null,
    val rateLimitRegister: Int? = null,
    val rateLimitRegisterPerSecond: Int? = null,
    val rateLimitImage: Int? = null,
    val rateLimitImagePerSecond: Int? = null,
    val rateLimitComment: Int? = null,
    val rateLimitCommentPerSecond: Int? = null,
    val rateLimitSearch: Int? = null,
    val rateLimitSearchPerSecond: Int? = null,
    val federationEnabled: Boolean? = null,
    val federationDebug: Boolean? = null,
    val federationWorkerCount: Int? = null,
    val captchaEnabled: Boolean? = null,
    val captchaDifficulty: String? = null,
    val allowedInstances: List<String>? = null,
    val blockedInstances: List<String>? = null,
    val taglines: List<String>? = null,
    val registrationMode: RegistrationModeType? /* "Closed" | "RequireApplication" | "Open" */ = null,
    val reportsEmailAdmins: Boolean? = null,
    override val auth: String,
) : RequireAuthentication
