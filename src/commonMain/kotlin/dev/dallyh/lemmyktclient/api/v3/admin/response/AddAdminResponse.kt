package dev.dallyh.lemmyktclient.api.v3.admin.response

import dev.dallyh.lemmyktclient.api.v3.user.model.PersonView
import kotlinx.serialization.Serializable

@Serializable
data class AddAdminResponse internal constructor(val admins: List<PersonView>)
