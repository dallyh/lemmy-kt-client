package dev.dallyh.lemmyktclient.api

sealed class ApiResponse<out T> {
    data class Success<T>(val data: T) : ApiResponse<T>()
    data class Error(
        val statusCode: Int, val statusDescription: String, val error: String? = null, val message: String? = null
    ) : ApiResponse<Nothing>()
}