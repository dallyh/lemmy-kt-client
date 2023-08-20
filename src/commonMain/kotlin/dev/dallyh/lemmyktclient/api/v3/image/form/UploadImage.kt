package dev.dallyh.lemmyktclient.api.v3.image.form

import dev.dallyh.lemmyktclient.api.v3.auth.OptionalAuthentication
import kotlinx.serialization.EncodeDefault
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable

data class UploadImage internal constructor(
    val image: ByteArray,
    override val auth: String?
): OptionalAuthentication {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as UploadImage

        if (!image.contentEquals(other.image)) return false
        return auth == other.auth
    }

    override fun hashCode(): Int {
        var result = image.contentHashCode()
        result = 31 * result + auth.hashCode()
        return result
    }
}
