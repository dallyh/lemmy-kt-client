# lemmy-kt-client
A Kotlin multiplatform client for [Lemmy](https://github.com/LemmyNet/).

Project is now work in progress and I don't know if it ever gets finished or maintained. 
This is just my first take on Kotlin as I wanted to learn something new and kill some time.

The project builds, and it's currently in somewhat usable state.

## Disclaimer
I don't call myself a developer (it's just my hobby), so there will be quirks (a lot). 
This project is currently not finalized, and it is a subject to change (a lot).

Any comments, suggestions, criticism and help are welcome!

Tests are currently mocked and not complete, and also they all lie in tests for JVM which should probably change to common.
Current plan for tests is to have a set of mocked tests to check the functionality, and tests against a real API against a local
instance in Docker to check for changes between builds.

Project is currently not on Maven, so if you want to use it, you'll have to build it for now.

## Supported platforms
- JVM
- LinuxX64
- MingwX64

## Compatibility
The client should be inline with version v0.18.3 of [lemmy-js-client](https://github.com/LemmyNet/lemmy-js-client)

## How to use the client
To use the client, just initialize the Lemmy Client with a host (import it from the version you want to use, currently only v3):

The client should then use the relevant HTTP implementation for the platform:
- OkHttp for JVM/Android
- CURL for Linux
- WinHTTP for Windows

The JVM client is compatible with Android as a package that you can use as a dependency.

````kotlin
import dev.dallyh.lemmyktclient.api.v3.LemmyClient

val client = LemmyClient("https://awesome-instance.ee")
````

Then just make a request with a proper form:

````kotlin
import dev.dallyh.lemmyktclient.LemmyApi
import dev.dallyh.lemmyktclient.api.ApiResponse

val form = AddAdmin(
    personId = 3,
    added = true,
    auth = "jwttoken"
)

runBlocking {
    when (val res = client.admin.addAdmin(form)) {

        is ApiResponse.Error -> {
            // Do something with the error
            // Status code and description are HTTP status codes/descriptions
            // In case of some status codes the API returns its own error which is available in the error and message property
            println("${res.statusCode} :: ${res.statusDescription} :: ${res.error} :: ${res.message}")
        }

        is ApiResponse.Success -> {
            // Do something with the response
            val data = res.data
        }
    }
}
````

## Insomnia
In the folder [Insomnia](/insomnia) there is an Insomnia project which can be useful to test the APIs. 
Please take a look at it's dedicated [README](/insomnia/README.md).

## Credits
Original project can be found here: https://github.com/eiknat/lemmy-client. The project was abandoned long time ago (when version of Lemmy API was v1), 
so I decided to create a new repository which aims to bring the new changes into this client with some improvements.

Also thanks a lot for helping me with this goes to [Bartuzen](https://github.com/Bartuzen)


