package dev.dallyh.lemmyktclient.api.v3.comment

import dev.dallyh.lemmyktclient.api.ApiResponse
import dev.dallyh.lemmyktclient.api.v3.admin.form.PurgePost
import dev.dallyh.lemmyktclient.api.v3.admin.json.PURGE_ITEM_RESPONSE
import dev.dallyh.lemmyktclient.api.v3.comment.form.*
import dev.dallyh.lemmyktclient.api.v3.comment.json.*
import dev.dallyh.lemmyktclient.api.v3.comment.json.CREATE_COMMENT_REPORT_RESPONSE
import dev.dallyh.lemmyktclient.api.v3.comment.json.CREATE_COMMENT_RESPONSE
import dev.dallyh.lemmyktclient.api.v3.comment.json.RESOLVE_COMMENT_REPORT_RESPONSE
import dev.dallyh.lemmyktclient.api.v3.types.CommentSortType
import dev.dallyh.lemmyktclient.api.v3.types.ListingType
import dev.dallyh.lemmyktclient.api.v3.utils.MockClient
import dev.dallyh.lemmyktclient.utils.executeTest
import io.ktor.http.*
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.asserter

class CommentTest {

    @Test
    fun `create comment`() {
        executeTest {
            val client = MockClient(
                httpMethod = HttpMethod.Post,
                endpoint = "comment",
                responseJson = CREATE_COMMENT_RESPONSE,
            )

            val form = CreateComment(
                content = "This is a great content!",
                postId = 1,
                auth = "testauth"
            )

            when (val res = client.comment.createComment(form)) {
                is ApiResponse.Error -> {
                    println("${res.statusCode} :: ${res.statusDescription}")
                    asserter.fail("should not have failed")
                }

                is ApiResponse.Success -> {
                    println(res.data.toString())
                    assertEquals("Lemmy comment content!", res.data.commentView.comment.content)
                }
            }
        }
    }

    @Test
    fun `get comment`() {
        executeTest {
            val client = MockClient(
                httpMethod = HttpMethod.Get,
                queryParams = "?id=2&auth=testauth",
                endpoint = "comment",
                responseJson = GET_COMMENT_RESPONSE,
            )

            val form = GetComment(
                id= 2,
                auth = "testauth"
            )

            when (val res = client.comment.getComment(form)) {
                is ApiResponse.Error -> {
                    println("${res.statusCode} :: ${res.statusDescription}")
                    asserter.fail("should not have failed")
                }

                is ApiResponse.Success -> {
                    println(res.data.toString())
                    assertEquals("Lemmy comment content!", res.data.commentView.comment.content)
                }
            }
        }
    }

    @Test
    fun `get comments`() {
        executeTest {
            val client = MockClient(
                httpMethod = HttpMethod.Get,
                queryParams = "?type_=Local&sort=New&max_depth=1&page=1&community_id=2&post_id=1&saved_only=false",
                endpoint = "comment/list",
                responseJson = GET_COMMENTS_RESPONSE,
            )

            val form = GetComments(
                type = ListingType.LOCAL,
                sort = CommentSortType.NEW,
                maxDepth = 1,
                page = 1,
                communityId = 2,
                postId = 1,
                savedOnly = false
            )

            when (val res = client.comment.getComments(form)) {
                is ApiResponse.Error -> {
                    println("${res.statusCode} :: ${res.statusDescription}")
                    asserter.fail("should not have failed")
                }

                is ApiResponse.Success -> {
                    println(res.data.toString())
                    assertEquals(2, res.data.comments.count())
                }
            }
        }
    }

    @Test
    fun `mod distinguish comment`() {
        executeTest {
            val client = MockClient(
                httpMethod = HttpMethod.Post,
                endpoint = "comment/distinguish",
                responseJson = DISTINGUISH_COMMENT_RESPONSE,
            )

            val form = DistinguishComment(
                commentId = 2,
                distinguished = true,
                auth = "testauth"
            )

            when (val res = client.comment.distinguishComment(form)) {
                is ApiResponse.Error -> {
                    println("${res.statusCode} :: ${res.statusDescription}")
                    asserter.fail("should not have failed")
                }

                is ApiResponse.Success -> {
                    println(res.data.toString())
                    assertEquals(true, res.data.commentView.comment.distinguished)
                }
            }
        }
    }

    @Test
    fun `edit comment`() {
        executeTest {
            val client = MockClient(
                httpMethod = HttpMethod.Put,
                endpoint = "comment",
                responseJson = EDIT_COMMENT_RESPONSE,
            )

            val form = EditComment(
                content = "Lemmy comment content, but edited!",
                commentId = 2,
                auth = "testauth"
            )

            when (val res = client.comment.editComment(form)) {
                is ApiResponse.Error -> {
                    println("${res.statusCode} :: ${res.statusDescription}")
                    asserter.fail("should not have failed")
                }

                is ApiResponse.Success -> {
                    println(res.data.toString())
                    assertEquals("Lemmy comment content, but edited!", res.data.commentView.comment.content)
                }
            }
        }
    }

    @Test
    fun `save comment`() {
        executeTest {
            val client = MockClient(
                httpMethod = HttpMethod.Put,
                endpoint = "comment/save",
                responseJson = SAVE_COMMENT_RESPONSE,
            )

            val form = SaveComment(
                commentId = 2,
                save = true,
                auth = "testauth"
            )

            when (val res = client.comment.saveComment(form)) {
                is ApiResponse.Error -> {
                    println("${res.statusCode} :: ${res.statusDescription}")
                    asserter.fail("should not have failed")
                }

                is ApiResponse.Success -> {
                    println(res.data.toString())
                    assertEquals(true, res.data.commentView.saved)
                }
            }
        }
    }

    @Test
    fun `like comment`() {
        executeTest {
            val client = MockClient(
                httpMethod = HttpMethod.Post,
                endpoint = "comment/like",
                responseJson = LIKE_COMMENT_RESPONSE,
            )

            val form = CreateCommentLike(
                commentId = 2,
                score = 1,
                auth = "testauth"
            )

            when (val res = client.comment.likeComment(form)) {
                is ApiResponse.Error -> {
                    println("${res.statusCode} :: ${res.statusDescription}")
                    asserter.fail("should not have failed")
                }

                is ApiResponse.Success -> {
                    println(res.data.toString())
                    assertEquals(1, res.data.commentView.counts.score)
                }
            }
        }
    }

    @Test
    fun `report comment`() {
        executeTest {
            val client = MockClient(
                httpMethod = HttpMethod.Post,
                endpoint = "comment/report",
                responseJson = CREATE_COMMENT_REPORT_RESPONSE,
            )

            val form = CreateCommentReport(
                commentId = 2,
                reason = "Reported",
                auth = "testauth"
            )

            when (val res = client.comment.createCommentReport(form)) {
                is ApiResponse.Error -> {
                    println("${res.statusCode} :: ${res.statusDescription}")
                    asserter.fail("should not have failed")
                }

                is ApiResponse.Success -> {
                    println(res.data.toString())
                    assertEquals(false, res.data.commentReportView.commentReport.resolved)
                }
            }
        }
    }

    @Test
    fun `list comment reports`() {
        executeTest {
            val client = MockClient(
                httpMethod = HttpMethod.Get,
                endpoint = "comment/report/list?page=1&limit=1&unresolved_only=false&community_id=2&auth=testauth",
                responseJson = LIST_COMMENTS_REPORTS_RESPONSE,
            )

            val form = ListCommentReports(
                page = 1,
                limit = 1,
                unresolvedOnly = false,
                communityId = 2,
                auth = "testauth"
            )

            when (val res = client.comment.listCommentReports(form)) {
                is ApiResponse.Error -> {
                    println("${res.statusCode} :: ${res.statusDescription}")
                    asserter.fail("should not have failed")
                }

                is ApiResponse.Success -> {
                    println(res.data.toString())
                    assertEquals("Reported", res.data.commentReports[0].commentReport.reason)
                }
            }
        }
    }

    @Test
    fun `resolve comment report`() {
        executeTest {
            val client = MockClient(
                httpMethod = HttpMethod.Put,
                endpoint = "comment/report/resolve",
                responseJson = RESOLVE_COMMENT_REPORT_RESPONSE,
            )

            val form = ResolveCommentReport(
                reportId = 1,
                resolved = true,
                auth = "testauth"
            )

            when (val res = client.comment.resolveCommentReport(form)) {
                is ApiResponse.Error -> {
                    println("${res.statusCode} :: ${res.statusDescription}")
                    asserter.fail("should not have failed")
                }

                is ApiResponse.Success -> {
                    println(res.data.toString())
                    assertEquals(true, res.data.commentReportView.commentReport.resolved)
                }
            }
        }
    }

    @Test
    fun `mark comment reply as read`() {
        executeTest {
            val client = MockClient(
                httpMethod = HttpMethod.Post,
                endpoint = "comment/mark_as_read",
                responseJson = MARK_COMMENT_REPLY_AS_READ_RESPONSE,
            )

            val form = MarkCommentReplyAsRead(
                commentReplyId = 1,
                read = true,
                auth = "testauth"
            )

            when (val res = client.comment.markCommentReplyAsRead(form)) {
                is ApiResponse.Error -> {
                    println("${res.statusCode} :: ${res.statusDescription}")
                    asserter.fail("should not have failed")
                }

                is ApiResponse.Success -> {
                    println(res.data.toString())
                    assertEquals(true, res.data.commentReplyView.commentReply.read)
                }
            }
        }
    }

    @Test
    fun `remove comment`() {
        executeTest {
            val client = MockClient(
                httpMethod = HttpMethod.Post,
                endpoint = "comment/remove",
                responseJson = REMOVE_COMMENT_RESPONSE,
            )

            val form = RemoveComment(
                commentId = 4,
                removed = true,
                reason = "Removed.",
                auth = "testauth"
            )

            when (val res = client.comment.removeComment(form)) {
                is ApiResponse.Error -> {
                    println("${res.statusCode} :: ${res.statusDescription}")
                    asserter.fail("should not have failed")
                }

                is ApiResponse.Success -> {
                    println(res.data.toString())
                    assertEquals(true, res.data.commentView.comment.removed)
                }
            }
        }
    }

    @Test
    fun `delete comment`() {
        executeTest {
            val client = MockClient(
                httpMethod = HttpMethod.Post,
                endpoint = "comment/delete",
                responseJson = DELETE_COMMENT_RESPONSE,
            )

            val form = DeleteComment(
                commentId = 4,
                deleted = true,
                auth = "testauth"
            )

            when (val res = client.comment.deleteComment(form)) {
                is ApiResponse.Error -> {
                    println("${res.statusCode} :: ${res.statusDescription}")
                    asserter.fail("should not have failed")
                }

                is ApiResponse.Success -> {
                    println(res.data.toString())
                    assertEquals(true, res.data.commentView.comment.deleted)
                }
            }
        }
    }
}