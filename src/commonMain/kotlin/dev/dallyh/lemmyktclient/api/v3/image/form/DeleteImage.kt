package dev.dallyh.lemmyktclient.api.v3.image.form

import dev.dallyh.lemmyktclient.api.v3.auth.RequireAuthentication

data class DeleteImage(
    val deleteToken: String,
    val file: String,
    override val auth: String
): RequireAuthentication
