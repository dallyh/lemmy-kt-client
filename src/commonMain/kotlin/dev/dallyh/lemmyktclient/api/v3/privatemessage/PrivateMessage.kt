package dev.dallyh.lemmyktclient.api.v3.privatemessage


import dev.dallyh.lemmyktclient.api.ApiResponse
import dev.dallyh.lemmyktclient.api.v3.privatemessage.form.*
import dev.dallyh.lemmyktclient.api.v3.privatemessage.response.ListPrivateMessageReportsResponse
import dev.dallyh.lemmyktclient.api.v3.privatemessage.response.PrivateMessageReportResponse
import dev.dallyh.lemmyktclient.api.v3.privatemessage.response.PrivateMessageResponse
import dev.dallyh.lemmyktclient.api.v3.privatemessage.response.PrivateMessagesResponse
import dev.dallyh.lemmyktclient.client.HttpApi
import dev.dallyh.lemmyktclient.internal.Endpoint

class PrivateMessage internal constructor() {

    /**
     * Get / fetch private messages.
     *
     * `HTTP.GET /private_message/list`
     */
    suspend fun list(form: GetPrivateMessages): ApiResponse<PrivateMessagesResponse> {
        return HttpApi.get(Endpoint("private_message/list"), form.toParams())
    }

    /**
     * Create a private message.
     *
     * `HTTP.POST /private_message`
     */
    suspend fun create(form: CreatePrivateMessage): ApiResponse<PrivateMessageResponse> {
        return HttpApi.post(Endpoint("private_message"), form)
    }

    /**
     * Edit a private message.
     *
     * `HTTP.PUT /private_message`
     */
    suspend fun edit(form: EditPrivateMessage): ApiResponse<PrivateMessageResponse> {
        return HttpApi.put(Endpoint("private_message"), form)
    }

    /**
     * Delete a private message.
     *
     * `HTTP.POST /private_message/delete`
     */
    suspend fun delete(form: DeletePrivateMessage): ApiResponse<PrivateMessageResponse> {
        return HttpApi.post(Endpoint("private_message/delete"), form)
    }

    /**
     * Mark a private message as read.
     *
     * `HTTP.POST /private_message/mark_as_read`
     */
    suspend fun markAsRead(form: MarkPrivateMessageAsRead): ApiResponse<PrivateMessageResponse> {
        return HttpApi.post(Endpoint("private_message/mark_as_read"), form)
    }

    /**
     * Create a report for a private message.
     *
     * `HTTP.POST /private_message/report`
     */
    suspend fun report(form: CreatePrivateMessageReport): ApiResponse<PrivateMessageReportResponse> {
        return HttpApi.post(Endpoint("private_message/report"), form)
    }

    /**
     * Resolve a report for a private message.
     *
     * `HTTP.PUT /private_message/report/resolve`
     */
    suspend fun resolveReport(form: ResolvePrivateMessageReport): ApiResponse<PrivateMessageReportResponse> {
        return HttpApi.put(Endpoint("private_message/report/resolve"), form)
    }

    /**
     * List private message reports.
     *
     * `HTTP.GET /private_message/report/list`
     */
    suspend fun listReports(form: ListPrivateMessageReports): ApiResponse<ListPrivateMessageReportsResponse> {
        return HttpApi.get(Endpoint("private_message/report/list"), form.toParams())
    }

}
