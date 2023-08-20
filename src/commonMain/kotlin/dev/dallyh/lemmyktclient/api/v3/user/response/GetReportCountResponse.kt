package dev.dallyh.lemmyktclient.api.v3.user.response

import dev.dallyh.lemmyktclient.api.v3.aliases.CommunityId
import kotlinx.serialization.Serializable

@Serializable
data class GetReportCountResponse internal constructor(
    val communityId: CommunityId? = null,
    val commentReports: Int,
    val postReports: Int,
    val privateMessageReports: Int? = null,
)
