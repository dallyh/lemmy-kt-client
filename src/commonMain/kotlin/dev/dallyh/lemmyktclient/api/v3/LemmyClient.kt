package dev.dallyh.lemmyktclient.api.v3

import dev.dallyh.lemmyktclient.api.ApiResponse
import dev.dallyh.lemmyktclient.api.v3.admin.Admin
import dev.dallyh.lemmyktclient.api.v3.comment.Comment
import dev.dallyh.lemmyktclient.api.v3.community.Community
import dev.dallyh.lemmyktclient.api.v3.customemoji.CustomEmoji
import dev.dallyh.lemmyktclient.api.v3.image.Image
import dev.dallyh.lemmyktclient.api.v3.modlog.Modlog
import dev.dallyh.lemmyktclient.api.v3.post.Post
import dev.dallyh.lemmyktclient.api.v3.privatemessage.PrivateMessage
import dev.dallyh.lemmyktclient.api.v3.resolveobject.Object
import dev.dallyh.lemmyktclient.api.v3.resolveobject.form.ResolveObject
import dev.dallyh.lemmyktclient.api.v3.resolveobject.response.ResolveObjectResponse
import dev.dallyh.lemmyktclient.api.v3.search.Search
import dev.dallyh.lemmyktclient.api.v3.search.form.SearchForm
import dev.dallyh.lemmyktclient.api.v3.search.response.SearchResponse
import dev.dallyh.lemmyktclient.api.v3.site.Site
import dev.dallyh.lemmyktclient.api.v3.user.User
import dev.dallyh.lemmyktclient.client.LemmyClientBase

class LemmyClient(val url: String) : LemmyClientBase(url) {
    val admin: Admin = Admin()
    val comment: Comment = Comment()
    val community: Community = Community()
    val customEmoji: CustomEmoji = CustomEmoji()
    val modLog: Modlog = Modlog()
    val post: Post = Post()
    val privateMessage: PrivateMessage = PrivateMessage()
    val site: Site = Site()
    val user: User = User()
    val image: Image = Image()

    suspend fun search(form: SearchForm): ApiResponse<SearchResponse> {
        return Search().searchLemmy(form)
    }

    suspend fun resolveObject(form: ResolveObject): ApiResponse<ResolveObjectResponse> {
        return Object().resolve(form)
    }
}