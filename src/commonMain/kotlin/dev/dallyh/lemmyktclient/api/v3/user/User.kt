package dev.dallyh.lemmyktclient.api.v3.user


import dev.dallyh.lemmyktclient.api.ApiResponse
import dev.dallyh.lemmyktclient.api.v3.site.response.GetSiteResponse
import dev.dallyh.lemmyktclient.api.v3.user.form.*
import dev.dallyh.lemmyktclient.api.v3.user.response.*
import dev.dallyh.lemmyktclient.client.HttpApi
import dev.dallyh.lemmyktclient.internal.Endpoint

class User internal constructor() {

    /**
     * Log into lemmy.
     *
     * `HTTP.POST /user/login`
     */
    suspend fun login(form: Login): ApiResponse<LoginResponse> {
        return HttpApi.post(Endpoint("user/login"), form)
    }

    /**
     * Register a new user.
     *
     * `HTTP.POST /user/register`
     */
    suspend fun register(form: Register): ApiResponse<LoginResponse> {
        return HttpApi.post(Endpoint("user/register"), form)
    }

    /**
     * Leave the Site admins.
     *
     * `HTTP.POST /user/leave_admin`
     */
    suspend fun leaveAdmin(form: LeaveAdmin): ApiResponse<GetSiteResponse> {
        return HttpApi.post(Endpoint("user/leave_admin"), form)
    }

    /**
     * Get the details for a person.
     *
     * `HTTP.GET /user`
     */
    suspend fun getPersonDetails(form: GetPersonDetails = GetPersonDetails()): ApiResponse<GetPersonDetailsResponse> {
        return HttpApi.get(Endpoint("user"), form.toParams())
    }

    /**
     * Get mentions for your user.
     *
     * `HTTP.GET /user/mention`
     */
    suspend fun getPersonMentions(form: GetPersonMentions): ApiResponse<GetPersonMentionsResponse> {
        return HttpApi.get(Endpoint("user/mention"), form.toParams())
    }

    /**
     * Mark a person mention as read.
     *
     * `HTTP.POST /user/mention/mark_as_read`
     */
    suspend fun markPersonMentionAsRead(form: MarkPersonMentionAsRead): ApiResponse<PersonMentionResponse> {
        return HttpApi.post(Endpoint("user/mention/mark_as_read"), form)
    }

    /**
     * Get comment replies.
     *
     * `HTTP.GET /user/replies`
     */
    suspend fun getReplies(form: GetReplies): ApiResponse<GetRepliesResponse> {
        return HttpApi.get(Endpoint("user/replies"), form.toParams())
    }

    /**
     * Ban a person from your site.
     *
     * `HTTP.POST /user/ban`
     */
    suspend fun banPerson(form: BanPerson): ApiResponse<BanPersonResponse> {
        return HttpApi.post(Endpoint("user/ban"), form)
    }

    /**
     * Get a list of banned users
     *
     * `HTTP.GET /user/banned`
     */
    suspend fun getBannedPersons(form: GetBannedPersons): ApiResponse<BannedPersonsResponse> {
        return HttpApi.get(Endpoint("user/banned"), form.toParams())
    }

    /**
     * Block a person.
     *
     * `HTTP.POST /user/block`
     */
    suspend fun blockPerson(form: BlockPerson): ApiResponse<BlockPersonResponse> {
        return HttpApi.post(Endpoint("user/block"), form)
    }

    /**
     * Fetch a Captcha.
     *
     * `HTTP.GET /user/get_captcha`
     */
    suspend fun getCaptcha(form: GetCaptcha = GetCaptcha()): ApiResponse<GetCaptchaResponse> {
        return HttpApi.get(Endpoint("user/get_captcha"), form.toParams())
    }

    /**
     * Delete your account.
     *
     * `HTTP.POST /user/delete_account`
     */
    suspend fun deleteAccount(form: DeleteAccount): ApiResponse<DeleteAccountResponse> {
        return HttpApi.post(Endpoint("user/delete_account"), form)
    }

    /**
     * Reset your password.
     *
     * `HTTP.POST /user/password_reset`
     */
    suspend fun passwordReset(form: PasswordReset): ApiResponse<PasswordResetResponse> {
        return HttpApi.post(Endpoint("user/password_reset"), form)
    }

    /**
     * Change your password from an email / token based reset.
     *
     * `HTTP.POST /user/password_change`
     */
    suspend fun passwordChangeAfterReset(form: PasswordChangeAfterReset): ApiResponse<LoginResponse> {
        return HttpApi.post(Endpoint("user/password_change"), form)
    }

    /**
     * Mark all replies as read.
     *
     * `HTTP.POST /user/mark_all_as_read`
     */
    suspend fun markAllAsRead(form: MarkAllAsRead): ApiResponse<GetRepliesResponse> {
        return HttpApi.post(Endpoint("user/mark_all_as_read"), form)
    }

    /**
     * Save your user settings.
     *
     * `HTTP.PUT /user/save_user_settings`
     */

    suspend fun markAllAsRead(form: SaveUserSettings): ApiResponse<LoginResponse> {
        return HttpApi.put(Endpoint("user/save_user_settings"), form)
    }

    /**
     * Change your user password.
     *
     * `HTTP.PUT /user/change_password`
     */
    suspend fun changePassword(form: ChangePassword): ApiResponse<LoginResponse> {
        return HttpApi.put(Endpoint("user/change_password"), form)
    }

    /**
     * Get counts for your reports
     *
     * `HTTP.GET /user/report_count`
     */
    suspend fun getReportCount(form: GetReportCount): ApiResponse<GetReportCountResponse> {
        return HttpApi.get(Endpoint("user/report_count"), form.toParams())
    }

    /**
     * Get your unread counts
     *
     * `HTTP.GET /user/unread_count`
     */
    suspend fun getUnreadCount(form: GetUnreadCount): ApiResponse<GetUnreadCountResponse> {
        return HttpApi.get(Endpoint("user/unread_count"), form.toParams())
    }

    /**
     * Verify your email
     *
     * `HTTP.POST /user/verify_email`
     */
    suspend fun verifyEmail(form: VerifyEmail): ApiResponse<VerifyEmailResponse> {
        return HttpApi.post(Endpoint("user/verify_email"), form)
    }

}
