package dev.dallyh.lemmyktclient.api.v3.customemoji


import dev.dallyh.lemmyktclient.api.ApiResponse
import dev.dallyh.lemmyktclient.api.v3.customemoji.form.CreateCustomEmoji
import dev.dallyh.lemmyktclient.api.v3.customemoji.form.DeleteCustomEmoji
import dev.dallyh.lemmyktclient.api.v3.customemoji.form.EditCustomEmoji
import dev.dallyh.lemmyktclient.api.v3.customemoji.response.CustomEmojiResponse
import dev.dallyh.lemmyktclient.api.v3.customemoji.response.DeleteCustomEmojiResponse
import dev.dallyh.lemmyktclient.client.HttpApi
import dev.dallyh.lemmyktclient.internal.Endpoint

class CustomEmoji internal constructor() {
    /**
     * Create a new custom emoji
     *
     * `HTTP.POST /custom_emoji`
     */
    suspend fun create(form: CreateCustomEmoji): ApiResponse<CustomEmojiResponse> {
        return HttpApi.post(Endpoint("custom_emoji"), form)
    }

    /**
     * Edit an existing custom emoji
     *
     * `HTTP.PUT /custom_emoji`
     */
    suspend fun edit(form: EditCustomEmoji): ApiResponse<CustomEmojiResponse> {
        return HttpApi.put(Endpoint("custom_emoji"), form)
    }

    /**
     * Delete a custom emoji
     *
     * `HTTP.Post /custom_emoji/delete`
     */
    suspend fun delete(form: DeleteCustomEmoji): ApiResponse<DeleteCustomEmojiResponse> {
        return HttpApi.post(Endpoint("custom_emoji/delete"), form)
    }
}