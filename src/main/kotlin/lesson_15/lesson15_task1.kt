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

class Carp(override val name: String) : Entity()
class Gull(override val name: String) : Entity()
class Duck(override val name: String) : Entity()

fun main() {
    val carp: Carp = Carp("Carp-01").apply { canSwim() }
    val gull1: Gull = Gull("Gull-01").apply { canSwim(); canFly() }
    val duck1: Duck = Duck("Duck-01").apply { canFly(); canSwim() }
}