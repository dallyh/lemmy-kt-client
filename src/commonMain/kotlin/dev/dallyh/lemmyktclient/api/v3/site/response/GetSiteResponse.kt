package dev.dallyh.lemmyktclient.api.v3.site.response

import dev.dallyh.lemmyktclient.api.v3.aliases.LanguageId
import dev.dallyh.lemmyktclient.api.v3.customemoji.model.CustomEmojiView
import dev.dallyh.lemmyktclient.api.v3.site.model.Language
import dev.dallyh.lemmyktclient.api.v3.site.model.SiteView
import dev.dallyh.lemmyktclient.api.v3.site.model.Tagline
import dev.dallyh.lemmyktclient.api.v3.user.model.MyUserInfo
import dev.dallyh.lemmyktclient.api.v3.user.model.PersonView

data class GetSiteResponse internal constructor(
    val siteView: SiteView,
    val admins: List<PersonView>,
    val version: String,
    val myUser: MyUserInfo? = null,
    val allLanguages: List<Language>,
    val discussionLanguages: List<LanguageId>,
    val taglines: List<Tagline>,
    val customEmojis: List<CustomEmojiView>,
)
