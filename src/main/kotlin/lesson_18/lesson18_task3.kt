package org.example.lesson_18

interface Eatable {

    fun eat() = "Eats"

}

interface Sleepable {

    fun sleep() = "Sleeps"

}

abstract class Tamagochi(val name: String) : Eatable, Sleepable

class Fox(name: String) : Tamagochi(name) {

    override fun eat() = "Eats berries"

}

class Dog(name: String) : Tamagochi(name) {

    override fun eat() = "Eats bones"

}

class Cat(name: String) : Tamagochi(name) {

    override fun eat() = "Eats fish"

}

fun main() {
    val fox: Tamagochi = Fox("Foxic")
    val dog: Tamagochi = Dog("Dogic")
    val cat: Tamagochi = Cat("Catic")

    val whatEatsList: Array<Tamagochi> = arrayOf(fox, dog, cat)
    whatEatsList.forEach { tamagochi ->
        println("[${tamagochi.name}] -> [${tamagochi.eat().lowercase()}]")
    }

}