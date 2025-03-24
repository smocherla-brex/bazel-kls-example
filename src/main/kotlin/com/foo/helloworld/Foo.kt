package com.foo.helloworld

import jakarta.inject.Inject
import foo.helloworld.proto.Foo

class Foo(@Inject val name: String) {

    fun hello() {
        println("hello ${name}")
        val foo = Foo(name)
        println(foo.hello())
    }
}