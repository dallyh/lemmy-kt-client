package dev.dallyh.lemmyktclient.api.v3.types

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
enum class ModlogActionType(val type: String) {
    @SerialName("All")
    ALL("All"),

    @SerialName("ModRemovePost")
    MOD_REMOVE_POST("ModRemovePost"),

    @SerialName("ModLockPost")
    MOD_LOCK_POST("ModLockPost"),

    @SerialName("ModFeaturePost")
    MOD_FEATURE_POST("ModFeaturePost"),

    @SerialName("ModRemoveComment")
    MOD_REMOVE_COMMENT("ModRemoveComment"),

    @SerialName("ModRemoveCommunity")
    MOD_REMOVE_COMMUNITY("ModRemoveCommunity"),

    @SerialName("ModBanFromCommunity")
    MOD_BAN_FROM_COMMUNITY("ModBanFromCommunity"),

    @SerialName("ModAddCommunity")
    MOD_ADD_COMMUNITY("ModAddCommunity"),

    @SerialName("ModTransferCommunity")
    MOD_TRANSFER_COMMUNITY("ModTransferCommunity"),

    @SerialName("ModAdd")
    MOD_ADD("ModAdd"),

    @SerialName("ModBan")
    MOD_BAN("ModBan"),

    @SerialName("ModHideCommunity")
    MOD_HIDE_COMMUNITY("ModHideCommunity"),

    @SerialName("AdminPurgePerson")
    ADMIN_PURGE_PERSON("AdminPurgePerson"),

    @SerialName("AdminPurgeCommunity")
    ADMIN_PURGE_COMMUNITY("AdminPurgeCommunity"),

    @SerialName("AdminPurgePost")
    ADMIN_PURGE_POST("AdminPurgePost"),

    @SerialName("AdminPurgeComment")
    ADMIN_PURGE_COMMENT("AdminPurgeComment")
}