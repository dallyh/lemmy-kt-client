package dev.dallyh.lemmyktclient.utils

import kotlinx.coroutines.runBlocking

internal fun <T> executeTest(code: suspend () -> T) {
    runBlocking { code() }
}