package dev.dallyh.lemmyktclient.api.v3.comment.json

internal const val MARK_COMMENT_REPLY_AS_READ_RESPONSE = """
 {
	"comment_reply_view": {
		"comment_reply": {
			"id": 1,
			"recipient_id": 2,
			"comment_id": 7,
			"read": true,
			"published": "2023-08-06T14:58:21.523463"
		},
		"comment": {
			"id": 7,
			"creator_id": 3,
			"post_id": 1,
			"content": "Reply from another user.",
			"removed": false,
			"published": "2023-08-06T14:58:21.514153",
			"deleted": false,
			"ap_id": "https://localhost/comment/7",
			"local": true,
			"path": "0.3.7",
			"distinguished": false,
			"language_id": 0
		},
		"creator": {
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
		"recipient": {
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
		"counts": {
			"id": 7,
			"comment_id": 7,
			"score": 1,
			"upvotes": 1,
			"downvotes": 0,
			"published": "2023-08-06T14:58:21.514153",
			"child_count": 0,
			"hot_rank": 1687,
			"controversy_rank": 0.0
		},
		"creator_banned_from_community": false,
		"subscribed": "Subscribed",
		"saved": false,
		"creator_blocked": false
	}
}
"""