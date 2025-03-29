package com.foo.helloworld

import io.kotest.core.spec.style.DescribeSpec
import org.junit.runner.RunWith
import io.kotest.matchers.shouldBe
import io.kotest.runner.junit4.KotestTestRunner

@RunWith(KotestTestRunner::class)
class HelloWorldTests : DescribeSpec({
    describe("my test suite ") {
        it("says hello") {
            "hello" shouldBe "hello"
        }
        
        it("says hell2o") {
            "hello2" shouldBe "hello3"
        }
    }
})