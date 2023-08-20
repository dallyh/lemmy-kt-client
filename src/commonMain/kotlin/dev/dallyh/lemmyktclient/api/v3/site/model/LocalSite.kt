package dev.dallyh.lemmyktclient.api.v3.site.model

import dev.dallyh.lemmyktclient.api.v3.aliases.LocalSiteId
import dev.dallyh.lemmyktclient.api.v3.aliases.SiteId
import dev.dallyh.lemmyktclient.api.v3.types.ListingType
import dev.dallyh.lemmyktclient.api.v3.types.RegistrationModeType
import dev.dallyh.lemmyktclient.internal.LemmyDateSerializer
import kotlinx.datetime.Instant
import kotlinx.serialization.Serializable

@Serializable
data class LocalSite internal constructor(
    val id: LocalSiteId,
    val siteId: SiteId,
    val siteSetup: Boolean,
    val enableDownvotes: Boolean,
    val enableNsfw: Boolean,
    val communityCreationAdminOnly: Boolean,
    val requireEmailVerification: Boolean,
    val applicationQuestion: String? = null,
    val privateInstance: Boolean,
    val defaultTheme: String,
    val defaultPostListingType: ListingType, /* "All" | "Local" | "Subscribed" */
    val legalInformation: String? = null,
    val hideModlogModNames: Boolean,
    val applicationEmailAdmins: Boolean,
    val slurFilterRegex: String? = null,
    val actorNameMaxLength: Int,
    val federationEnabled: Boolean,
    val federationWorkerCount: Int,
    val captchaEnabled: Boolean,
    val captchaDifficulty: String,
    @Serializable(with = LemmyDateSerializer::class)
    val published: Instant,
    @Serializable(with = LemmyDateSerializer::class)
    val updated: Instant? = null,
    val registrationMode: RegistrationModeType, /* "Closed" | "RequireApplication" | "Open" */
    val reportsEmailAdmins: Boolean,
)
