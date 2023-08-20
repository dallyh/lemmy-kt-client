package dev.dallyh.lemmyktclient.api.v3.resolveobject.response

import dev.dallyh.lemmyktclient.api.v3.comment.model.CommentView
import dev.dallyh.lemmyktclient.api.v3.community.model.CommunityView
import dev.dallyh.lemmyktclient.api.v3.post.model.PostView
import dev.dallyh.lemmyktclient.api.v3.user.model.PersonView
import kotlinx.serialization.Serializable

@Serializable
data class ResolveObjectResponse internal constructor(
    val comment: CommentView?,
    val post: PostView?,
    val community: CommunityView?,
    val person: PersonView?,
)
