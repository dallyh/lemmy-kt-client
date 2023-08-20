package dev.dallyh.lemmyktclient.api.v3.admin.response

import kotlinx.serialization.Serializable

@Serializable
data class GetUnreadRegistrationApplicationCountResponse internal constructor(
    val registrationApplications: Int,
)
