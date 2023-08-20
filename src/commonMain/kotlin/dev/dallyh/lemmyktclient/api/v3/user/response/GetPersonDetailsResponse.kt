package dev.dallyh.lemmyktclient.api.v3.user.response

import dev.dallyh.lemmyktclient.api.v3.comment.model.CommentView
import dev.dallyh.lemmyktclient.api.v3.community.model.CommunityModeratorView
import dev.dallyh.lemmyktclient.api.v3.post.model.PostView
import dev.dallyh.lemmyktclient.api.v3.user.model.PersonView
import kotlinx.serialization.Serializable

@Serializable
data class GetPersonDetailsResponse internal constructor(
    val personView: PersonView,
    val comments: List<CommentView>,
    val posts: List<PostView>,
    val moderates: List<CommunityModeratorView>,
)
