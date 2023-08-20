package dev.dallyh.lemmyktclient.api.v3.image.response

data class GetImageResponse internal constructor(
    val image: ByteArray,
    val contentType: String,
    val format: String
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as GetImageResponse

        return image.contentEquals(other.image)
    }

    override fun hashCode(): Int {
        return image.contentHashCode()
    }
}
