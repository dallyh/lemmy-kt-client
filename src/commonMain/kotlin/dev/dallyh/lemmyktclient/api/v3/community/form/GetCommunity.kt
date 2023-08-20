package dev.dallyh.lemmyktclient.api.v3.community.form

import dev.dallyh.lemmyktclient.api.v3.aliases.CommunityId
import dev.dallyh.lemmyktclient.api.v3.auth.OptionalAuthentication
import kotlinx.serialization.Serializable

@Serializable
data class GetCommunity(
    val id: CommunityId? = null,
    val name: String? = null,
    override val auth: String? = null,
) : OptionalAuthentication

internal fun GetCommunity.asParams() = mapOf(
    Pair("id", id?.toString()), Pair("name", name), Pair("auth", auth)
)
