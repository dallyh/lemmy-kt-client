package dev.dallyh.lemmyktclient.api.v3.comment.json

internal const val REMOVE_COMMENT_RESPONSE = """
{
	"comment_view": {
		"comment": {
			"id": 4,
			"creator_id": 2,
			"post_id": 1,
			"content": "Comment reply.",
			"removed": true,
			"published": "2023-08-06T14:41:11.578157",
			"deleted": false,
			"ap_id": "https://localhost/comment/4",
			"local": true,
			"path": "0.2.4",
			"distinguished": false,
			"language_id": 0
		},
		"creator": {
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
		},
		"post": {
			"id": 1,
			"name": "Test post!",
			"creator_id": 2,
			"community_id": 2,
			"removed": false,
			"locked": false,
			"published": "2023-08-04T18:15:42.162438",
			"deleted": false,
			"nsfw": false,
			"ap_id": "https://localhost/post/1",
			"local": true,
			"language_id": 0,
			"featured_community": false,
			"featured_local": false
		},
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
		"counts": {
			"id": 4,
			"comment_id": 4,
			"score": 1,
			"upvotes": 1,
			"downvotes": 0,
			"published": "2023-08-06T14:41:11.578157",
			"child_count": 1,
			"hot_rank": 1330,
			"controversy_rank": 0.0
		},
		"creator_banned_from_community": false,
		"subscribed": "Subscribed",
		"saved": false,
		"creator_blocked": false,
		"my_vote": 1
	},
	"recipient_ids": []
}
"""