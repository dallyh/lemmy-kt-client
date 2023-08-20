package dev.dallyh.lemmyktclient.api.v3.admin

import dev.dallyh.lemmyktclient.api.ApiResponse
import dev.dallyh.lemmyktclient.api.v3.admin.form.*
import dev.dallyh.lemmyktclient.api.v3.admin.json.ADD_ADMIN_RESPONSE
import dev.dallyh.lemmyktclient.api.v3.admin.json.APPROVE_REGISTRATION_APPLICATION_RESPONSE
import dev.dallyh.lemmyktclient.api.v3.admin.json.GET_UNREAD_REGISTRATION_APPLICATION_COUNT_RESPONSE
import dev.dallyh.lemmyktclient.api.v3.admin.json.LIST_REGISTRATION_APPLICATIONS_RESPONSE
import dev.dallyh.lemmyktclient.api.v3.admin.json.PURGE_ITEM_RESPONSE
import dev.dallyh.lemmyktclient.api.v3.utils.MockClient
import dev.dallyh.lemmyktclient.utils.executeTest
import io.ktor.http.*
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.asserter

class AdminTest {

    @Test
    fun `add admin - mocked`() {
        executeTest {
            val client = MockClient(
                httpMethod = HttpMethod.Post,
                endpoint = "admin/add",
                responseJson = ADD_ADMIN_RESPONSE,
            )

            val form = AddAdmin(
                personId = 3,
                added = true,
                auth = "testauth"
            )

            when (val res = client.admin.addAdmin(form)) {
                is ApiResponse.Error -> {
                    println("${res.statusCode} :: ${res.statusDescription}")
                    asserter.fail("should not have failed")
                }

                is ApiResponse.Success -> {
                    assertEquals(3, res.data.admins[1].person.id)
                }
            }
        }
    }

    @Test
    fun `approve registration application`() {
        executeTest {
            val client = MockClient(
                httpMethod = HttpMethod.Put,
                endpoint = "admin/registration_application/approve",
                responseJson = APPROVE_REGISTRATION_APPLICATION_RESPONSE,
            )

            val form = ApproveRegistrationApplication(
                id = 1,
                approve = true,
                auth = "testauth"
            )

            when (val res = client.admin.approveRegistrationApplication(form)) {
                is ApiResponse.Error -> {
                    println("${res.statusCode} :: ${res.statusDescription}")
                    asserter.fail("should not have failed")
                }

                is ApiResponse.Success -> {
                    println(res.data.toString())
                    assertEquals(1, res.data.registrationApplication.registrationApplication.id)
                }
            }
        }
    }

    @Test
    fun `get registration application count`() {
        executeTest {
            val client = MockClient(
                httpMethod = HttpMethod.Get,
                queryParams = "?auth=testauth",
                endpoint = "admin/registration_application/count",
                responseJson = GET_UNREAD_REGISTRATION_APPLICATION_COUNT_RESPONSE,
            )

            val form = GetUnreadRegistrationApplicationCount(
                auth = "testauth"
            )

            when (val res = client.admin.getUnreadRegistrationApplicationCount(form)) {
                is ApiResponse.Error -> {
                    println("${res.statusCode} :: ${res.statusDescription}")
                    asserter.fail("should not have failed")
                }

                is ApiResponse.Success -> {
                    println(res.data.toString())
                    assertEquals(0, res.data.registrationApplications)
                }
            }
        }
    }

    @Test
    fun `list registration applications`() {
        executeTest {
            val client = MockClient(
                httpMethod = HttpMethod.Get,
                queryParams = "?auth=testauth",
                endpoint = "admin/registration_application/list",
                responseJson = LIST_REGISTRATION_APPLICATIONS_RESPONSE,
            )

            val form = ListRegistrationApplications(
                auth = "testauth"
            )

            when (val res = client.admin.listRegistrationApplications(form)) {
                is ApiResponse.Error -> {
                    println("${res.statusCode} :: ${res.statusDescription}")
                    asserter.fail("should not have failed")
                }

                is ApiResponse.Success -> {
                    println(res.data.toString())
                    assertEquals(0, res.data.registrationApplications.count())
                }
            }
        }
    }

    @Test
    fun `purge comment`() {
        executeTest {
            val client = MockClient(
                httpMethod = HttpMethod.Post,
                endpoint = "admin/purge/comment",
                responseJson = PURGE_ITEM_RESPONSE,
            )

            val form = PurgeComment(
                commentId = 1,
                auth = "testauth"
            )

            when (val res = client.admin.purgeComment(form)) {
                is ApiResponse.Error -> {
                    println("${res.statusCode} :: ${res.statusDescription}")
                    asserter.fail("should not have failed")
                }

                is ApiResponse.Success -> {
                    println(res.data.toString())
                    assertEquals(true, res.data.success)
                }
            }
        }
    }

    @Test
    fun `purge person`() {
        executeTest {
            val client = MockClient(
                httpMethod = HttpMethod.Post,
                endpoint = "admin/purge/person",
                responseJson = PURGE_ITEM_RESPONSE,
            )

            val form = PurgePerson(
                personId = 1,
                auth = "testauth"
            )

            when (val res = client.admin.purgePerson(form)) {
                is ApiResponse.Error -> {
                    println("${res.statusCode} :: ${res.statusDescription}")
                    asserter.fail("should not have failed")
                }

                is ApiResponse.Success -> {
                    println(res.data.toString())
                    assertEquals(true, res.data.success)
                }
            }
        }
    }

    @Test
    fun `purge community`() {
        executeTest {
            val client = MockClient(
                httpMethod = HttpMethod.Post,
                endpoint = "admin/purge/community",
                responseJson = PURGE_ITEM_RESPONSE,
            )

            val form = PurgeCommunity(
                communityId = 1,
                auth = "testauth"
            )

            when (val res = client.admin.purgeCommunity(form)) {
                is ApiResponse.Error -> {
                    println("${res.statusCode} :: ${res.statusDescription}")
                    asserter.fail("should not have failed")
                }

                is ApiResponse.Success -> {
                    println(res.data.toString())
                    assertEquals(true, res.data.success)
                }
            }
        }
    }

    @Test
    fun `purge post`() {
        executeTest {
            val client = MockClient(
                httpMethod = HttpMethod.Post,
                endpoint = "admin/purge/post",
                responseJson = PURGE_ITEM_RESPONSE,
            )

            val form = PurgePost(
                postId = 1,
                auth = "testauth"
            )

            when (val res = client.admin.purgePost(form)) {
                is ApiResponse.Error -> {
                    println("${res.statusCode} :: ${res.statusDescription}")
                    asserter.fail("should not have failed")
                }

                is ApiResponse.Success -> {
                    println(res.data.toString())
                    assertEquals(true, res.data.success)
                }
            }
        }
    }
}


