package com.foo.helloworld

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Post
import io.micronaut.http.annotation.Produces
import io.micronaut.http.MediaType
import com.foo.helloworld.proto.Foo

@Controller("/hello")
class HelloController {

    @Get("/")
    @Produces(MediaType.TEXT_PLAIN)
    fun index(): String {
        val greeting = Foo.Hello.newBuilder().setGreeting("hello there").setName("John Doe").build()
        return "${greeting.greeting}, ${greeting.name}!"
    }
}