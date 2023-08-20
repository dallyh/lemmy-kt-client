package dev.dallyh.lemmyktclient.api.v3.user.response

import kotlinx.serialization.Serializable


// TODO find a better way to handle those without captcha enabled
@Serializable
data class GetCaptchaResponse internal constructor(val ok: Ok? = Ok("no-captcha", null, "")) {
    @Serializable
    data class Ok internal constructor(
        val png: String,
        val wav: String?,
        val uuid: String,
    )
}
