package dev.dallyh.lemmyktclient.api.v3.community.json

internal const val BAN_FROM_COMMUNITY_RESPONSE = """
{
	"person_view": {
		"person": {
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
		},
		"counts": {
			"id": 2,
			"person_id": 3,
			"post_count": 0,
			"post_score": 0,
			"comment_count": 2,
			"comment_score": 2
		}
	},
	"banned": true
}
"""