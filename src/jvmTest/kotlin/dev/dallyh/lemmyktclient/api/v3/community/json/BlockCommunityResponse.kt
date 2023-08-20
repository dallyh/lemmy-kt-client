package dev.dallyh.lemmyktclient.api.v3.community.json

internal const val BLOCK_COMMUNITY_RESPONSE = """
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
		"blocked": true,
		"counts": {
			"id": 2,
			"community_id": 3,
			"subscribers": 0,
			"posts": 0,
			"comments": 0,
			"published": "2023-08-06T15:26:46.733295",
			"users_active_day": 0,
			"users_active_week": 0,
			"users_active_month": 0,
			"users_active_half_year": 0,
			"hot_rank": 1728
		}
	},
	"blocked": true
}
"""