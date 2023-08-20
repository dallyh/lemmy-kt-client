package dev.dallyh.lemmyktclient.api.v3.community.json

internal const val FOLLOW_COMMUNITY_RESPONSE = """
{
	"community_view": {
		"community": {
			"id": 2,
			"name": "testcommunity",
			"title": "Test Community",
			"description": "This description was edited.",
			"removed": false,
			"published": "2023-08-02T17:57:55.788785",
			"updated": "2023-08-06T15:43:53.215048",
			"deleted": false,
			"nsfw": false,
			"actor_id": "https://localhost/c/testcommunity",
			"local": true,
			"hidden": false,
			"posting_restricted_to_mods": false,
			"instance_id": 1
		},
		"subscribed": "Subscribed",
		"blocked": false,
		"counts": {
			"id": 1,
			"community_id": 2,
			"subscribers": 1,
			"posts": 1,
			"comments": 6,
			"published": "2023-08-02T17:57:55.788785",
			"users_active_day": 2,
			"users_active_week": 2,
			"users_active_month": 2,
			"users_active_half_year": 2,
			"hot_rank": 1
		}
	},
	"discussion_languages": [
		0
	]
}
"""