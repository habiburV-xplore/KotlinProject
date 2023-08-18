package com.abstraction

class Person1(name: String): Person(name) {

    override fun displayJob(description: String) {
        println(description)
    }
}
