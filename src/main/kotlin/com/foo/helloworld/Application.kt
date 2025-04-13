package com.foo.helloworld

import io.micronaut.runtime.Micronaut

object Application {
    @JvmStatic
    fun main(args: Array<String>) {
        println("Starting application...")
        
        try {
            Micronaut.run(Application::class.java, *args)
        
        } catch (e: Exception) {
            println("ERROR: Application failed to start")
            e.printStackTrace()
        }
    }
}