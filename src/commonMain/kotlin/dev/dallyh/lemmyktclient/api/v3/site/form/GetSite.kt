package dev.dallyh.lemmyktclient.api.v3.site.form

import dev.dallyh.lemmyktclient.api.v3.auth.OptionalAuthentication
import kotlinx.serialization.Serializable

@Serializable
data class GetSite(
    override val auth: String? = null,
) : OptionalAuthentication
