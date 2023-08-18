package com.abstraction

abstract class Person(name: String) {

    init {
        println("My name is $name.")
    }

    fun displayAge(age: Int) {
        println("My age is $age.")
    }

    abstract fun displayJob(description: String)
}