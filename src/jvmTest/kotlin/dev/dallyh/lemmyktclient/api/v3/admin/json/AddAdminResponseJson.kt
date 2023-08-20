package dev.dallyh.lemmyktclient.api.v3.admin.json

internal const val ADD_ADMIN_RESPONSE = """
{
    "admins": [
        {
            "person": {
                "id": 2,
                "name": "lemmy",
                "banned": false,
                "published": "2023-07-21T19:40:02.910917",
                "actor_id": "https://localhost/u/lemmy",
                "inbox_url": "https://localhost/",
                "local": true,
                "deleted": false,
                "admin": true,
                "bot_account": false,
                "instance_id": 1
            },
            "counts": {
                "id": 1,
                "person_id": 2,
                "post_count": 0,
                "post_score": 0,
                "comment_count": 0,
                "comment_score": 0
            }
        },
        {
            "person": {
                "id": 3,
                "name": "testuser",
                "banned": false,
                "published": "2023-07-21T20:48:38.786591",
                "actor_id": "https://localhost/u/testuser",
                "inbox_url": "https://localhost/",
                "local": true,
                "deleted": false,
                "admin": true,
                "bot_account": false,
                "instance_id": 1
            },
            "counts": {
                "id": 2,
                "person_id": 3,
                "post_count": 0,
                "post_score": 0,
                "comment_count": 0,
                "comment_score": 0
            }
        }
    ]
}
"""
