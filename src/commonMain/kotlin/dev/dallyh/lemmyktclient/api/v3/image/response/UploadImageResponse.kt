package dev.dallyh.lemmyktclient.api.v3.image.response

import dev.dallyh.lemmyktclient.api.v3.image.model.ImageFile
import kotlinx.serialization.Serializable

@Serializable
data class UploadImageResponse internal constructor(
    /**
     * Is "ok" if the upload was successful; is something else otherwise.
     */
    var msg: String,
    var files: List<ImageFile>? = null,
    var url: String? = null,
    var deleteUrl: String? = null
)
