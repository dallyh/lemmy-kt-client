package dev.dallyh.lemmyktclient.api.v3.community


import dev.dallyh.lemmyktclient.api.ApiResponse
import dev.dallyh.lemmyktclient.api.v3.community.form.*
import dev.dallyh.lemmyktclient.api.v3.community.response.*
import dev.dallyh.lemmyktclient.client.HttpApi
import dev.dallyh.lemmyktclient.internal.Endpoint


class Community internal constructor() {

    /**
     * Add a moderator to your community.
     *
     * `HTTP.POST /community/mod`
     */
    suspend fun addModToCommunity(form: AddModToCommunity): ApiResponse<AddModToCommunityResponse> {
        return HttpApi.post(Endpoint("community/mod"), form)
    }

    /**
     * Ban a user from a community.
     *
     * `HTTP.POST /community/ban_user`
     */
    suspend fun banFromCommunity(form: BanFromCommunity): ApiResponse<BanFromCommunityResponse> {
        return HttpApi.post(Endpoint("community/ban_user"), form)
    }

    /**
     * Block a community.
     *
     * `HTTP.POST /community/block`
     */
    suspend fun blockCommunity(form: BlockCommunity): ApiResponse<BlockCommunityResponse> {
        return HttpApi.post(Endpoint("community/block"), form)
    }

    /**
     * Create a new community.
     *
     * `HTTP.POST /community`
     */
    suspend fun createCommunity(form: CreateCommunity): ApiResponse<CommunityResponse> {
        return HttpApi.post(Endpoint("community"), form)
    }

    /**
     * Delete a community.
     *
     * `HTTP.POST /community/delete`
     */
    suspend fun deleteCommunity(form: DeleteCommunity): ApiResponse<CommunityResponse> {
        return HttpApi.post(Endpoint("community/delete"), form)
    }

    /**
     * Edit a community.
     *
     * `HTTP.PUT /community`
     */
    suspend fun editCommunity(form: EditCommunity): ApiResponse<CommunityResponse> {
        return HttpApi.put(Endpoint("community"), form)
    }

    /**
     * Follow / subscribe to a community.
     *
     * `HTTP.POST /community/follow`
     */
    suspend fun followCommunity(form: FollowCommunity): ApiResponse<CommunityResponse> {
        return HttpApi.post(Endpoint("community/follow"), form)
    }

    /**
     * Get / fetch a community.
     *
     * `HTTP.GET /community`
     */
    suspend fun getCommunity(form: GetCommunity): ApiResponse<GetCommunityResponse> {
        return HttpApi.get(Endpoint("community"), form.asParams())
    }

    /**
     * List communities, with various filters.
     *
     * `HTTP.GET /community/list`
     */
    suspend fun listCommunities(form: ListCommunities = ListCommunities()): ApiResponse<ListCommunitiesResponse> {
        return HttpApi.get(Endpoint("community/list"), form.asParams())
    }

    /**
     * A moderator remove for a community.
     *
     * `HTTP.POST /community/remove`
     */
    suspend fun removeCommunity(form: RemoveCommunity): ApiResponse<CommunityResponse> {
        return HttpApi.post(Endpoint("community/remove"), form)
    }

    /**
     * Transfer your community to an existing moderator.
     *
     * `HTTP.POST /community/transfer`
     */
    suspend fun transferCommunity(form: TransferCommunity): ApiResponse<GetCommunityResponse> {
        return HttpApi.post(Endpoint("community/transfer"), form)
    }

}
