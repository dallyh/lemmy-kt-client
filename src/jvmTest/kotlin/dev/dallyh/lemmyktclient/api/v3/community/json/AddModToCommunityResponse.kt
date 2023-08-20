package dev.dallyh.lemmyktclient.api.v3.community.json

internal const val ADD_MOD_TO_COMMUNITY_RESPONSE = """
{
	"moderators": [
		{
			"community": {
				"id": 2,
				"name": "testcommunity",
				"title": "Test Community",
				"removed": false,
				"published": "2023-08-02T17:57:55.788785",
				"deleted": false,
				"nsfw": false,
				"actor_id": "https://localhost/c/testcommunity",
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
		},
		{
			"community": {
				"id": 2,
				"name": "testcommunity",
				"title": "Test Community",
				"removed": false,
				"published": "2023-08-02T17:57:55.788785",
				"deleted": false,
				"nsfw": false,
				"actor_id": "https://localhost/c/testcommunity",
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
		}
	]
}
"""