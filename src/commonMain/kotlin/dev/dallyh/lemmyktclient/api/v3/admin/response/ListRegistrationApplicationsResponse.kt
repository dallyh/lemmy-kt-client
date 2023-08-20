package dev.dallyh.lemmyktclient.api.v3.admin.response

import dev.dallyh.lemmyktclient.api.v3.admin.models.RegistrationApplicationView
import kotlinx.serialization.Serializable

@Serializable
data class ListRegistrationApplicationsResponse internal constructor(
    val registrationApplications: List<RegistrationApplicationView>,
)
