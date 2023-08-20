package dev.dallyh.lemmyktclient.api.v3.modlog


import dev.dallyh.lemmyktclient.api.ApiResponse
import dev.dallyh.lemmyktclient.api.v3.modlog.form.GetModlog
import dev.dallyh.lemmyktclient.api.v3.modlog.form.toParams
import dev.dallyh.lemmyktclient.api.v3.modlog.response.GetModlogResponse
import dev.dallyh.lemmyktclient.client.HttpApi
import dev.dallyh.lemmyktclient.internal.Endpoint

class Modlog internal constructor() {
    /**
     * Get the modlog.
     *
     * `HTTP.GET /modlog`
     */
    suspend fun get(form: GetModlog = GetModlog()): ApiResponse<GetModlogResponse> {
        return HttpApi.get(Endpoint("modlog"), form.toParams())
    }
}
