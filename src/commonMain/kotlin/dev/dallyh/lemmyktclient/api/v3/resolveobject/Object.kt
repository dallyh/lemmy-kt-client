package dev.dallyh.lemmyktclient.api.v3.resolveobject

import dev.dallyh.lemmyktclient.api.ApiResponse
import dev.dallyh.lemmyktclient.api.v3.resolveobject.form.ResolveObject
import dev.dallyh.lemmyktclient.api.v3.resolveobject.form.toParams
import dev.dallyh.lemmyktclient.api.v3.resolveobject.response.ResolveObjectResponse
import dev.dallyh.lemmyktclient.client.HttpApi
import dev.dallyh.lemmyktclient.internal.Endpoint

class Object internal constructor() {
    /**
     * Fetch a non-local / federated object.
     *
     * `HTTP.GET /resolve_object`
     */
    suspend fun resolve(form: ResolveObject): ApiResponse<ResolveObjectResponse> {
        return HttpApi.get(Endpoint("resolve_object"), form.toParams())
    }
}