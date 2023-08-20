package dev.dallyh.lemmyktclient.api.v3.community.json

internal const val TRANSFER_COMMUNITY_RESPONSE = """
{
	"community_view": {
		"community": {
			"id": 3,
			"name": "greatcommunity",
			"title": "This community is great",
			"removed": false,
			"published": "2023-08-06T15:26:46.733295",
			"deleted": false,
			"nsfw": false,
			"actor_id": "https://localhost/c/greatcommunity",
			"local": true,
			"hidden": false,
			"posting_restricted_to_mods": false,
			"instance_id": 1
		},
		"subscribed": "NotSubscribed",
		"blocked": false,
		"counts": {
			"id": 2,
			"community_id": 3,
			"subscribers": 0,
			"posts": 1,
			"comments": 1,
			"published": "2023-08-06T15:26:46.733295",
			"users_active_day": 0,
			"users_active_week": 0,
			"users_active_month": 0,
			"users_active_half_year": 0,
			"hot_rank": 745
		}
	},
	"moderators": [
		{
			"community": {
				"id": 3,
				"name": "greatcommunity",
				"title": "This community is great",
				"removed": false,
				"published": "2023-08-06T15:26:46.733295",
				"deleted": false,
				"nsfw": false,
				"actor_id": "https://localhost/c/greatcommunity",
				"local": true,
				"hidden": false,
				"posting_restricted_to_mods": false,
				"instance_id": 1
			},
			"moderator": {
				"id": 3,
				"name": "testuser",
				"banned": false,
				"published": "2023-08-06T14:57:44.404978",
				"actor_id": "https://localhost/u/testuser",
				"local": true,
				"deleted": false,
				"admin": false,
				"bot_account": false,
				"instance_id": 1
			}
		},
		{
			"community": {
				"id": 3,
				"name": "greatcommunity",
				"title": "This community is great",
				"removed": false,
				"published": "2023-08-06T15:26:46.733295",
				"deleted": false,
				"nsfw": false,
				"actor_id": "https://localhost/c/greatcommunity",
				"local": true,
				"hidden": false,
				"posting_restricted_to_mods": false,
				"instance_id": 1
			},
			"moderator": {
				"id": 2,
				"name": "lemmy",
				"banned": false,
				"published": "2023-08-02T17:25:58.819526",
				"actor_id": "https://localhost/u/lemmy",
				"local": true,
				"deleted": false,
				"admin": true,
				"bot_account": false,
				"instance_id": 1
			}
		}
	],
	"discussion_languages": []
}
"""