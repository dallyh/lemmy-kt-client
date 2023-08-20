package dev.dallyh.lemmyktclient.api.v3.community

import dev.dallyh.lemmyktclient.api.ApiResponse
import dev.dallyh.lemmyktclient.api.v3.community.form.*
import dev.dallyh.lemmyktclient.api.v3.community.json.*
import dev.dallyh.lemmyktclient.api.v3.types.ListingType
import dev.dallyh.lemmyktclient.api.v3.types.SortType
import dev.dallyh.lemmyktclient.api.v3.types.SubscribedType
import dev.dallyh.lemmyktclient.api.v3.utils.MockClient
import dev.dallyh.lemmyktclient.utils.executeTest
import io.ktor.http.*
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.asserter

class CommunityTest {

    @Test
    fun `add mod to community`() {
        executeTest {
            val client = MockClient(
                httpMethod = HttpMethod.Post,
                endpoint = "community/mod",
                responseJson = ADD_MOD_TO_COMMUNITY_RESPONSE,
            )

            val form = AddModToCommunity(
                communityId = 2, personId = 3, added = true, auth = "testauth"
            )

            when (val res = client.community.addModToCommunity(form)) {
                is ApiResponse.Error -> {
                    println("${res.statusCode} :: ${res.statusDescription}")
                    asserter.fail("should not have failed")
                }

                is ApiResponse.Success -> {
                    println(res.data.toString())
                    assertEquals("testuser", res.data.moderators[1].moderator.name)
                }
            }
        }
    }

    @Test
    fun `ban user from community`() {
        executeTest {
            val client = MockClient(
                httpMethod = HttpMethod.Post,
                endpoint = "community/ban_user",
                responseJson = BAN_FROM_COMMUNITY_RESPONSE,
            )

            val form = BanFromCommunity(
                communityId = 2,
                personId = 3,
                ban = true,
                removeData = false,
                reason = "Banhammer",
                expires = 0,
                auth = "testauth"
            )

            when (val res = client.community.banFromCommunity(form)) {
                is ApiResponse.Error -> {
                    println("${res.statusCode} :: ${res.statusDescription}")
                    asserter.fail("should not have failed")
                }

                is ApiResponse.Success -> {
                    println(res.data.toString())
                    assertEquals(true, res.data.banned)
                }
            }
        }
    }

    @Test
    fun `block community`() {
        executeTest {
            val client = MockClient(
                httpMethod = HttpMethod.Post,
                endpoint = "community/block",
                responseJson = BLOCK_COMMUNITY_RESPONSE,
            )

            val form = BlockCommunity(
                communityId = 2, block = true, auth = "testauth"
            )

            when (val res = client.community.blockCommunity(form)) {
                is ApiResponse.Error -> {
                    println("${res.statusCode} :: ${res.statusDescription}")
                    asserter.fail("should not have failed")
                }

                is ApiResponse.Success -> {
                    println(res.data.toString())
                    assertEquals(true, res.data.blocked)
                }
            }
        }
    }

    @Test
    fun `create a community`() {
        executeTest {
            val client = MockClient(
                httpMethod = HttpMethod.Post,
                endpoint = "community",
                responseJson = CREATE_COMMUNITY_RESPONSE,
            )

            val form = CreateCommunity(
                name = "story", title = "Listen up here is a story", auth = "testauth"
            )

            when (val res = client.community.createCommunity(form)) {
                is ApiResponse.Error -> {
                    println("${res.statusCode} :: ${res.statusDescription}")
                    asserter.fail("should not have failed")
                }

                is ApiResponse.Success -> {
                    println(res.data.toString())
                    assertEquals("story", res.data.communityView.community.name)
                }
            }
        }
    }

    @Test
    fun `delete a community`() {
        executeTest {
            val client = MockClient(
                httpMethod = HttpMethod.Post,
                endpoint = "community/delete",
                responseJson = DELETE_COMMUNITY_RESPONSE,
            )

            val form = DeleteCommunity(
                communityId = 4, deleted = true, auth = "testauth"
            )

            when (val res = client.community.deleteCommunity(form)) {
                is ApiResponse.Error -> {
                    println("${res.statusCode} :: ${res.statusDescription}")
                    asserter.fail("should not have failed")
                }

                is ApiResponse.Success -> {
                    println(res.data.toString())
                    assertEquals("story", res.data.communityView.community.name)
                }
            }
        }
    }

    @Test
    fun `edit a community`() {
        executeTest {
            val client = MockClient(
                httpMethod = HttpMethod.Put,
                endpoint = "community",
                responseJson = EDIT_COMMUNITY_RESPONSE,
            )

            val description = "This description was edited."

            val form = EditCommunity(
                communityId = 2, description = description, auth = "testauth"
            )

            when (val res = client.community.editCommunity(form)) {
                is ApiResponse.Error -> {
                    println("${res.statusCode} :: ${res.statusDescription}")
                    asserter.fail("should not have failed")
                }

                is ApiResponse.Success -> {
                    println(res.data.toString())
                    assertEquals(description, res.data.communityView.community.description)
                }
            }
        }
    }

    @Test
    fun `follow a community`() {
        executeTest {
            val client = MockClient(
                httpMethod = HttpMethod.Post,
                endpoint = "community/follow",
                responseJson = EDIT_COMMUNITY_RESPONSE,
            )

            val form = FollowCommunity(
                communityId = 2, follow = true, auth = "testauth"
            )

            when (val res = client.community.followCommunity(form)) {
                is ApiResponse.Error -> {
                    println("${res.statusCode} :: ${res.statusDescription}")
                    asserter.fail("should not have failed")
                }

                is ApiResponse.Success -> {
                    println(res.data.toString())
                    assertEquals(SubscribedType.SUBSCRIBED, res.data.communityView.subscribed)
                }
            }
        }
    }

    @Test
    fun `get a community`() {
        executeTest {
            val client = MockClient(
                httpMethod = HttpMethod.Get,
                queryParams = "?id=2",
                endpoint = "community",
                responseJson = GET_COMMUNITY_RESPONSE,
            )

            val form = GetCommunity(
                id = 2
            )

            when (val res = client.community.getCommunity(form)) {
                is ApiResponse.Error -> {
                    println("${res.statusCode} :: ${res.statusDescription}")
                    asserter.fail("should not have failed")
                }

                is ApiResponse.Success -> {
                    println(res.data.toString())
                    assertEquals(false, res.data.communityView.community.deleted)
                }
            }
        }
    }

    @Test
    fun `list communities`() {
        executeTest {
            val client = MockClient(
                httpMethod = HttpMethod.Get,
                queryParams = "?type_=Local&sort=Old&show_nsfw=true&page=1&limit=5&auth=testauth",
                endpoint = "community/list",
                responseJson = LIST_COMMUNITIES_RESPONSE,
            )

            val form = ListCommunities(
                type = ListingType.LOCAL, sort = SortType.OLD, showNsfw = true, page = 1, limit = 5, auth = "testauth"
            )

            when (val res = client.community.listCommunities(form)) {
                is ApiResponse.Error -> {
                    println("${res.statusCode} :: ${res.statusDescription}")
                    asserter.fail("should not have failed")
                }

                is ApiResponse.Success -> {
                    println(res.data.toString())
                    assertEquals("testcommunity", res.data.communities[0].community.name)
                }
            }
        }
    }

    @Test
    fun `mod remove community`() {
        executeTest {
            val client = MockClient(
                httpMethod = HttpMethod.Post,
                endpoint = "community/remove",
                responseJson = REMOVE_COMMUNITY_RESPONSE,
            )

            val form = RemoveCommunity(
                communityId = 4,
                removed = true,
                reason = "Just casually removing,",
                expires = 0,
                auth = "testauth"
            )

            when (val res = client.community.removeCommunity(form)) {
                is ApiResponse.Error -> {
                    println("${res.statusCode} :: ${res.statusDescription}")
                    asserter.fail("should not have failed")
                }

                is ApiResponse.Success -> {
                    println(res.data.toString())
                    assertEquals(true, res.data.communityView.community.removed)
                }
            }
        }
    }

    @Test
    fun `transfer community`() {
        executeTest {
            val client = MockClient(
                httpMethod = HttpMethod.Post,
                endpoint = "community/transfer",
                responseJson = TRANSFER_COMMUNITY_RESPONSE,
            )

            val form = TransferCommunity(
                communityId = 3,
                personId = 3,
                auth = "testauth"
            )

            when (val res = client.community.transferCommunity(form)) {
                is ApiResponse.Error -> {
                    println("${res.statusCode} :: ${res.statusDescription}")
                    asserter.fail("should not have failed")
                }

                is ApiResponse.Success -> {
                    println(res.data.toString())
                    assertEquals("greatcommunity", res.data.communityView.community.name)
                }
            }
        }
    }

}