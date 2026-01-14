package org.example.lesson_15

interface Searchable {
    fun search()
}

open class Product(val name: String, val quantity: Int)

class Instrument(name: String, quantity: Int, val components: MutableList<Component>
) : Product(name, quantity), Searchable {

    override fun search() {
        println("Searching components for \"$name\":")
        components.forEachIndexed { index, it -> println("${index+1}: ${it.name}, quantity - ${it.quantity}. ") }
    }
}

class Component(name: String, quantity: Int) : Product(name, quantity)

fun main() {

    val bag1 = Component("Bag for drum", 3)
    val sticks2 = Component("Sticks", 7)
    val drum = Instrument("Drum", 10, mutableListOf(bag1, sticks2))

    drum.search()
}