package dev.dallyh.lemmyktclient.api.v3.comment.json

internal const val CREATE_COMMENT_REPORT_RESPONSE = """
{
	"comment_report_view": {
		"comment_report": {
			"id": 1,
			"creator_id": 2,
			"comment_id": 2,
			"original_comment_text": "Lemmy comment content!",
			"reason": "Reported",
			"resolved": false,
			"published": "2023-08-06T09:32:12.476241"
		},
		"comment": {
			"id": 2,
			"creator_id": 2,
			"post_id": 1,
			"content": "Lemmy comment content!",
			"removed": false,
			"published": "2023-08-06T09:19:25.568032",
			"deleted": false,
			"ap_id": "https://localhost/comment/2",
			"local": true,
			"path": "0.2",
			"distinguished": false,
			"language_id": 0
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
		"comment_creator": {
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
			"id": 2,
			"comment_id": 2,
			"score": 1,
			"upvotes": 1,
			"downvotes": 0,
			"published": "2023-08-06T09:19:25.568032",
			"child_count": 0,
			"hot_rank": 1484,
			"controversy_rank": 0.0
		},
		"creator_banned_from_community": false,
		"my_vote": 1
	}
}
"""