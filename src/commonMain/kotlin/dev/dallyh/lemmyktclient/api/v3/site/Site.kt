package dev.dallyh.lemmyktclient.api.v3.site


import dev.dallyh.lemmyktclient.api.ApiResponse
import dev.dallyh.lemmyktclient.api.v3.auth.Auth
import dev.dallyh.lemmyktclient.api.v3.auth.toParams
import dev.dallyh.lemmyktclient.api.v3.site.form.CreateSite
import dev.dallyh.lemmyktclient.api.v3.site.form.EditSite
import dev.dallyh.lemmyktclient.api.v3.site.response.GetSiteResponse
import dev.dallyh.lemmyktclient.api.v3.site.response.SiteResponse
import dev.dallyh.lemmyktclient.client.HttpApi
import dev.dallyh.lemmyktclient.internal.Endpoint


class Site internal constructor() {
    private val site = Endpoint("site")

    /**
     * Gets the site, and your user data.
     *
     * `HTTP.GET /site`
     */
    suspend fun get(auth: Auth?): ApiResponse<GetSiteResponse> {
        return HttpApi.get(site, auth?.toParams() ?: emptyMap())
    }

    /**
     * Create your site.
     *
     * `HTTP.POST /site`
     */
    suspend fun create(form: CreateSite): ApiResponse<SiteResponse> {
        return HttpApi.post(site, form)
    }

    /**
     * Edit your site.
     *
     * `HTTP.PUT /site`
     */
    suspend fun edit(form: EditSite): ApiResponse<SiteResponse> {
        return HttpApi.put(site, form)
    }
}
