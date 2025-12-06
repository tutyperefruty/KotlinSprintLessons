package org.example.lesson_15

interface Swimmable {
    fun canSwim() = println("Can swim")
}

interface Flyable {
    fun canFly() = println("Can fly")
}

abstract class Entity : Swimmable, Flyable {
    abstract val name: String
    override fun canSwim() = println("$name swims")
    override fun canFly() = println("$name flies")
}

class Carp(override val name: String) : Entity(), Swimmable

class Gull(override val name: String) : Entity(), Swimmable, Flyable

class Duck(override val name: String) : Entity(), Swimmable, Flyable

fun main() {

    val entieties: MutableList<Entity> = mutableListOf()
    with(entieties) {
        Carp("Carp-01").apply { canSwim() }
        Gull("Gull-01").apply { canSwim(); canFly() }
        Duck("Duck-01").apply { canFly(); canSwim() }
    }
}