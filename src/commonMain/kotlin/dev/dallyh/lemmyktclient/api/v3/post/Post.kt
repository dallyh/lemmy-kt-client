package dev.dallyh.lemmyktclient.api.v3.post


import dev.dallyh.lemmyktclient.api.ApiResponse
import dev.dallyh.lemmyktclient.api.v3.post.form.*
import dev.dallyh.lemmyktclient.api.v3.post.response.*
import dev.dallyh.lemmyktclient.client.HttpApi
import dev.dallyh.lemmyktclient.internal.Endpoint

class Post internal constructor() {
    /**
     * Create a post.
     *
     * `HTTP.POST /post`
     */
    suspend fun createPost(form: CreatePost): ApiResponse<PostResponse> {
        return HttpApi.post(Endpoint("post"), form)
    }

    /**
     * Get / fetch a post.
     *
     * `HTTP.GET /post`
     */
    suspend fun getPost(form: GetPost = GetPost()): ApiResponse<GetPostResponse> {
        return HttpApi.get(Endpoint("post"), form.toParams())
    }

    /**
     * Edit a post.
     *
     * `HTTP.PUT /post`
     */
    suspend fun editPost(form: EditPost): ApiResponse<PostResponse> {
        return HttpApi.put(Endpoint("post"), form)
    }

    /**
     * Delete a post.
     *
     * `HTTP.POST /post/delete`
     */
    suspend fun removePost(form: RemovePost): ApiResponse<PostResponse> {
        return HttpApi.post(Endpoint("post/delete"), form)
    }

    /**
     * Mark a post as read.
     *
     * `HTTP.POST /post/mark_as_read`
     */
    suspend fun markPostAsRead(form: MarkPostAsRead): ApiResponse<PostResponse> {
        return HttpApi.post(Endpoint("post/mark_as_read"), form)
    }

    /**
     * A moderator can lock a post ( IE disable new comments ).
     *
     * `HTTP.POST /post/lock`
     */
    suspend fun lockPost(form: LockPost): ApiResponse<PostResponse> {
        return HttpApi.post(Endpoint("post/lock"), form)
    }

    /**
     * A moderator can feature a community post ( IE stick it to the top of a community ).
     *
     * `HTTP.POST /post/feature`
     */
    suspend fun featurePost(form: FeaturePost): ApiResponse<PostResponse> {
        return HttpApi.post(Endpoint("post/feature"), form)
    }

    /**
     * Get / fetch posts, with various filters.
     *
     * `HTTP.GET /post/list`
     */
    suspend fun getPosts(form: GetPosts = GetPosts()): ApiResponse<GetPostsResponse> {
        return HttpApi.get(Endpoint("post/list"), form.toParams())
    }

    /**
     * Like / vote on a post.
     *
     * `HTTP.POST /post/like`
     */
    suspend fun likePost(form: CreatePostLike): ApiResponse<PostResponse> {
        return HttpApi.post(Endpoint("post/like"), form)
    }

    /**
     * Save a post.
     *
     * `HTTP.PUT /post/save`
     */
    suspend fun savePost(form: SavePost): ApiResponse<PostResponse> {
        return HttpApi.put(Endpoint("post/save"), form)
    }

    /**
     * Report a post.
     *
     * `HTTP.POST /post/report`
     */
    suspend fun createPostReport(form: CreatePostReport): ApiResponse<PostReportResponse> {
        return HttpApi.post(Endpoint("post/report"), form)
    }

    /**
     * Resolve a post report. Only a mod can do this.
     *
     * `HTTP.PUT /post/report/resolve`
     */
    suspend fun resolvePostReport(form: ResolvePostReport): ApiResponse<PostReportResponse> {
        return HttpApi.post(Endpoint("post/report/resolve"), form)
    }

    /**
     * List post reports.
     *
     * `HTTP.GET /post/report/list`
     */
    suspend fun listPostReports(form: ListPostReports): ApiResponse<ListPostReportsResponse> {
        return HttpApi.get(Endpoint("post/report/list"), form.toParams())
    }

    /**
     * Fetch metadata for any given site.
     *
     * `HTTP.GET /post/site_metadata`
     */
    suspend fun getSiteMetadata(form: GetSiteMetadata): ApiResponse<GetSiteMetadataResponse> {
        return HttpApi.get(Endpoint("post/site_metadata"), form.toParams())
    }
}
