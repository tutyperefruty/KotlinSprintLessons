package org.example.lesson_8

fun main() {

    val ingredientsHealthSalad = arrayOf("tomato", "cucumber", "union", "olive", "spice")
    println("What you want to find: ")
    val input = readln()
    for (i in ingredientsHealthSalad) {
        if (ingredientsHealthSalad.contains(input)) {
            println("Ingredient \"${input}\" is in the Ingredient list")
            return
        }
    }
    println("There is no such ingredient")

}