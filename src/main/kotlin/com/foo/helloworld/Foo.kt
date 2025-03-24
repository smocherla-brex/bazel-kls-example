package com.foo.helloworld

import jakarta.inject.Inject

class Foo(@Inject val name: String) {

    fun hello() {
        println("hello ${name}")
    }
}