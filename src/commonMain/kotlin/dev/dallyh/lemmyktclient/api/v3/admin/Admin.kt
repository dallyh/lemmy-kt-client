package dev.dallyh.lemmyktclient.api.v3.admin

import dev.dallyh.lemmyktclient.api.ApiResponse
import dev.dallyh.lemmyktclient.api.v3.admin.form.*
import dev.dallyh.lemmyktclient.api.v3.admin.response.*
import dev.dallyh.lemmyktclient.client.HttpApi
import dev.dallyh.lemmyktclient.internal.Endpoint

class Admin internal constructor() {

    /**
     * Add an admin to your site.
     *
     * `HTTP.POST /admin/add`
     */
    suspend fun addAdmin(form: AddAdmin): ApiResponse<AddAdminResponse> {
        return HttpApi.post(Endpoint("admin/add"), form)
    }

    /**
     * Approve a registration application
     *
     * `HTTP.PUT /admin/registration_application/approve`
     */
    suspend fun approveRegistrationApplication(form: ApproveRegistrationApplication): ApiResponse<RegistrationApplicationResponse> {
        return HttpApi.put(Endpoint("admin/registration_application/approve"), form)
    }

    /**
     * Get the unread registration applications count.
     *
     * `HTTP.GET /admin/registration_application/count`
     */
    suspend fun getUnreadRegistrationApplicationCount(form: GetUnreadRegistrationApplicationCount): ApiResponse<GetUnreadRegistrationApplicationCountResponse> {
        return HttpApi.get(Endpoint("admin/registration_application/count"), form.toParams())
    }

    /**
     * List the registration applications.
     *
     * `HTTP.GET /admin/registration_application/list`
     */
    suspend fun listRegistrationApplications(form: ListRegistrationApplications): ApiResponse<ListRegistrationApplicationsResponse> {
        return HttpApi.get(Endpoint("admin/registration_application/list"), form.toParams())
    }

    /**
     * Purge / Delete a comment from the database.
     *
     * `HTTP.POST /admin/purge/comment`
     */
    suspend fun purgeComment(form: PurgeComment): ApiResponse<PurgeItemResponse> {
        return HttpApi.post(Endpoint("admin/purge/comment"), form)
    }

    /**
     * Purge / Delete a person from the database.
     *
     * `HTTP.POST /admin/purge/person`
     */
    suspend fun purgePerson(form: PurgePerson): ApiResponse<PurgeItemResponse> {
        return HttpApi.post(Endpoint("admin/purge/person"), form)
    }

    /**
     * Purge / Delete a community from the database.
     *
     * `HTTP.POST /admin/purge/community`
     */
    suspend fun purgeCommunity(form: PurgeCommunity): ApiResponse<PurgeItemResponse> {
        return HttpApi.post(Endpoint("admin/purge/community"), form)
    }

    /**
     * Purge / Delete a post from the database.
     *
     * `HTTP.POST /admin/purge/post`
     */
    suspend fun purgePost(form: PurgePost): ApiResponse<PurgeItemResponse> {
        return HttpApi.post(Endpoint("admin/purge/post"), form)
    }
}