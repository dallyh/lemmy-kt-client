package dev.dallyh.lemmyktclient.api.v3.utils

import dev.dallyh.lemmyktclient.ADMIN_PASSWORD
import dev.dallyh.lemmyktclient.ADMIN_USER
import dev.dallyh.lemmyktclient.TEST_HOST
import dev.dallyh.lemmyktclient.api.v3.user.form.Login
import kotlinx.coroutines.runBlocking
import kotlin.test.BeforeTest
import kotlin.test.Ignore
import kotlin.test.asserter

abstract class LoginCredentials {
    companion object {
        var client = dev.dallyh.lemmyktclient.api.v3.LemmyClient(TEST_HOST)
        var jwtToken: String? = null
    }

    @BeforeTest
    fun `get login credentials`() {
        runBlocking {
            val form = Login(
                usernameOrEmail = ADMIN_USER, password = ADMIN_PASSWORD
            )

            when (val res = client.user.login(form)) {
                is dev.dallyh.lemmyktclient.api.ApiResponse.Success -> {
                    jwtToken = res.data.jwt
                }

                is dev.dallyh.lemmyktclient.api.ApiResponse.Error -> {
                    asserter.fail("Error response: Could not get login token.${res.statusCode} :: ${res.statusDescription}")
                }
            }
        }
    }
}