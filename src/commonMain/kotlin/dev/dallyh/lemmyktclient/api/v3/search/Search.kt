package dev.dallyh.lemmyktclient.api.v3.search


import dev.dallyh.lemmyktclient.api.ApiResponse
import dev.dallyh.lemmyktclient.api.v3.search.form.SearchForm
import dev.dallyh.lemmyktclient.api.v3.search.form.toParams
import dev.dallyh.lemmyktclient.api.v3.search.response.SearchResponse
import dev.dallyh.lemmyktclient.client.HttpApi
import dev.dallyh.lemmyktclient.internal.Endpoint

class Search internal constructor() {
    /**
     * Search lemmy.
     *
     * `HTTP.GET /search`
     */
    suspend fun searchLemmy(form: SearchForm): ApiResponse<SearchResponse> {
        return HttpApi.get(Endpoint("search"), form.toParams())
    }
}