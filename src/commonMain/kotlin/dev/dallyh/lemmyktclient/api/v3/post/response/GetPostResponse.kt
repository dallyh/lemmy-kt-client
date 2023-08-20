package dev.dallyh.lemmyktclient.api.v3.post.response

import dev.dallyh.lemmyktclient.api.v3.community.model.CommunityModeratorView
import dev.dallyh.lemmyktclient.api.v3.community.model.CommunityView
import dev.dallyh.lemmyktclient.api.v3.post.model.PostView
import kotlinx.serialization.Serializable

@Serializable
data class GetPostResponse internal constructor(
    val postView: PostView,
    val communityView: CommunityView,
    val moderators: List<CommunityModeratorView>,
    val crossPosts: List<PostView>,
)
