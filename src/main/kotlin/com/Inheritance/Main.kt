package com.Inheritance

open class Person(age: Int, name: String) {
    init {
        println("My name is $name.")
        println("My age is $age")
    }
}

class Person1(age: Int, name: String): Person(age, name) {

    fun Person1Function() {
        println("I am a person1")
    }
}

class Person2(age: Int, name: String): Person(age, name) {
    fun Person2Function() {
        println("I am a person2.")
    }
}

fun main(args: Array<String>) {
    val p1 = Person1(12, "Akash")
    p1.Person1Function()

    println()

    val p2 = Person2(22, "Sharma")
    p2.Person2Function()
}
