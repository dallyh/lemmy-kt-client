package dev.dallyh.lemmyktclient.api.v3.comment


import dev.dallyh.lemmyktclient.api.ApiResponse
import dev.dallyh.lemmyktclient.api.v3.comment.form.*
import dev.dallyh.lemmyktclient.api.v3.comment.response.*
import dev.dallyh.lemmyktclient.client.HttpApi
import dev.dallyh.lemmyktclient.internal.Endpoint

class Comment internal constructor() {

    /**
     * Create a comment.
     *
     * `HTTP.POST /comment`
     */
    suspend fun createComment(form: CreateComment): ApiResponse<CommentResponse> {
        return HttpApi.post(Endpoint("comment"), form)
    }

    /**
     * Like / vote on a comment.
     *
     * `HTTP.POST /comment/like`
     */
    suspend fun likeComment(form: CreateCommentLike): ApiResponse<CommentResponse> {
        return HttpApi.post(Endpoint("comment/like"), form)
    }

    /**
     * Report a comment.
     *
     * `HTTP.POST /comment/report`
     */
    suspend fun createCommentReport(form: CreateCommentReport): ApiResponse<CommentReportResponse> {
        return HttpApi.post(Endpoint("comment/report"), form)
    }

    /**
     * Delete a comment.
     *
     * `HTTP.POST /comment/delete`
     */
    suspend fun deleteComment(form: DeleteComment): ApiResponse<CommentResponse> {
        return HttpApi.post(Endpoint("comment/delete"), form)
    }

    /**
     * Distinguishes a comment (speak as moderator)
     *
     * `HTTP.POST /comment/distinguish`
     */
    suspend fun distinguishComment(form: DistinguishComment): ApiResponse<CommentResponse> {
        return HttpApi.post(Endpoint("comment/distinguish"), form)
    }

    /**
     * Edit a comment.
     *
     * `HTTP.PUT /comment`
     */
    suspend fun editComment(form: EditComment): ApiResponse<CommentResponse> {
        return HttpApi.put(Endpoint("comment"), form)
    }

    /**
     * Get / fetch comment.
     *
     * `HTTP.GET /comment`
     */
    suspend fun getComment(form: GetComment): ApiResponse<CommentResponse> {
        return HttpApi.get(Endpoint("comment"), form.toParams())
    }

    /**
     * Get / fetch comments.
     *
     * `HTTP.GET /comment/list`
     */
    suspend fun getComments(form: GetComments = GetComments()): ApiResponse<GetCommentsResponse> {
        return HttpApi.get(Endpoint("comment/list"), form.toParams())
    }

    /**
     * List comment reports.
     *
     * `HTTP.GET /comment/report/list`
     */
    suspend fun listCommentReports(form: ListCommentReports): ApiResponse<ListCommentReportsResponse> {
        return HttpApi.get(Endpoint("comment/report/list"), form.toParams())
    }

    /**
     * Mark a comment as read.
     *
     * `HTTP.POST /comment/mark_as_read`
     */
    suspend fun markCommentReplyAsRead(form: MarkCommentReplyAsRead): ApiResponse<CommentReplyResponse> {
        return HttpApi.post(Endpoint("comment/mark_as_read"), form)
    }

    /**
     * A moderator remove for a comment.
     *
     * `HTTP.POST /comment/remove`
     */
    suspend fun removeComment(form: RemoveComment): ApiResponse<CommentResponse> {
        return HttpApi.post(Endpoint("comment/remove"), form)
    }

    /**
     * Resolve a comment report. Only a mod can do this.
     *
     * `HTTP.PUT /comment/report/resolve`
     */
    suspend fun resolveCommentReport(form: ResolveCommentReport): ApiResponse<CommentReportResponse> {
        return HttpApi.put(Endpoint("comment/report/resolve"), form)
    }

    /**
     * Save a comment.
     *
     * `HTTP.PUT /comment/save`
     */
    suspend fun saveComment(form: SaveComment): ApiResponse<CommentResponse> {
        return HttpApi.put(Endpoint("comment/save"), form)
    }
}
