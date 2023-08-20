package dev.dallyh.lemmyktclient.api.v3.user.form

import dev.dallyh.lemmyktclient.api.v3.aliases.PersonId
import dev.dallyh.lemmyktclient.api.v3.auth.RequireAuthentication

data class BlockPerson(
    val personId: PersonId,
    val block: Boolean,
    override val auth: String,
) : RequireAuthentication

internal fun BlockPerson.toParams() = mapOf(
    Pair("person_id", personId.toString()),
    Pair("block", block.toString()),
    Pair("auth", auth),
)
