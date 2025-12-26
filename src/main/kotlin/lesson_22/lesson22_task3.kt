package org.example.lesson_22

data class Zombi (val name: String, val color: String, val isHead: Boolean)

fun main() {
    val zombi = Zombi("ya", "green", true)
    val (name, color, isHead) = zombi

    println("Name: $name")
    println("Color: $color")
    println("Is head?: $isHead")
}