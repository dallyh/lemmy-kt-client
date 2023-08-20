package dev.dallyh.lemmyktclient.api.v3.admin.json

internal const val APPROVE_REGISTRATION_APPLICATION_RESPONSE = """
{
    "registration_application": {
        "registration_application": {
            "id": 1,
            "local_user_id": 2,
            "answer": "Test",
            "admin_id": 2,
            "published": "2023-07-21T20:48:39.905671"
        },
        "creator_local_user": {
            "id": 2,
            "person_id": 3,
            "show_nsfw": false,
            "blur_nsfw": false,
            "auto_expand": true,
            "theme": "browser",
            "default_sort_type": "Active",
            "default_listing_type": "Local",
            "interface_language": "browser",
            "show_avatars": true,
            "send_notifications_to_email": false,
            "validator_time": "2023-07-21T20:48:39.736384",
            "show_scores": true,
            "show_bot_accounts": true,
            "show_read_posts": true,
            "show_new_post_notifs": false,
            "email_verified": false,
            "accepted_application": true,
            "open_links_in_new_tab": false,
            "infinite_scroll_enabled": false
        },
        "creator": {
            "id": 3,
            "name": "testuser",
            "banned": false,
            "published": "2023-07-21T20:48:38.786591",
            "actor_id": "https://localhost/u/testuser",
            "inbox_url": "https://localhost",
            "local": true,
            "deleted": false,
            "admin": true,
            "bot_account": false,
            "instance_id": 1
        },
        "admin": {
            "id": 2,
            "name": "lemmy",
            "banned": false,
            "published": "2023-07-21T19:40:02.910917",
            "actor_id": "https://localhost/u/lemmy",
            "inbox_url": "https://localhost",
            "local": true,
            "deleted": false,
            "admin": true,
            "bot_account": false,
            "instance_id": 1
        }
    }
}
"""
