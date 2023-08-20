package dev.dallyh.lemmyktclient.api.v3.community.json

internal const val CREATE_COMMUNITY_RESPONSE = """
{
	"community_view": {
		"community": {
			"id": 4,
			"name": "story",
			"title": "Listen up here is a story",
			"removed": false,
			"published": "2023-08-06T15:32:15.215187",
			"deleted": false,
			"nsfw": false,
			"actor_id": "https://localhost/c/story",
			"local": true,
			"hidden": false,
			"posting_restricted_to_mods": false,
			"instance_id": 1
		},
		"subscribed": "Subscribed",
		"blocked": false,
		"counts": {
			"id": 3,
			"community_id": 4,
			"subscribers": 1,
			"posts": 0,
			"comments": 0,
			"published": "2023-08-06T15:32:15.215187",
			"users_active_day": 0,
			"users_active_week": 0,
			"users_active_month": 0,
			"users_active_half_year": 0,
			"hot_rank": 1728
		}
	},
	"discussion_languages": [
		0
	]
}
"""