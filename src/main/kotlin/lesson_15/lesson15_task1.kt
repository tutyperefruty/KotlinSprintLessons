package org.example.lesson_15

interface Swimmable {
    val name: String
    fun canSwim() = println("$name swims")
}

interface Flyable {
    val name: String
    fun canFly() = println("$name flies")
}

class Carp(override val name: String) : Swimmable

class Gull(override val name: String) : Swimmable, Flyable

class Duck(override val name: String) : Swimmable, Flyable

fun main() {

    val carp1 = Carp("Carp-01").run { canSwim() }
    val gull1 = Gull("Gull-01").run { canSwim(); canFly() }
    val duck1 = Duck("Duck-01").run { canFly(); canSwim() }

}