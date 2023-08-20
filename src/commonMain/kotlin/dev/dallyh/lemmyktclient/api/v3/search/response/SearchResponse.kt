package dev.dallyh.lemmyktclient.api.v3.search.response

import dev.dallyh.lemmyktclient.api.v3.comment.model.CommentView
import dev.dallyh.lemmyktclient.api.v3.community.model.CommunityView
import dev.dallyh.lemmyktclient.api.v3.post.model.PostView
import dev.dallyh.lemmyktclient.api.v3.types.SearchType
import dev.dallyh.lemmyktclient.api.v3.user.model.PersonView
import kotlinx.serialization.Serializable

@Serializable
data class SearchResponse internal constructor(
    val type: SearchType, /* "All" | "Comments" | "Posts" | "Communities" | "Users" | "Url" */
    val comments: List<CommentView>,
    val posts: List<PostView>,
    val communities: List<CommunityView>,
    val users: List<PersonView>,
)
