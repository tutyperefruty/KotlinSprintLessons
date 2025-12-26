package org.example.lesson_9

fun main() {

    val listOfIngredients = listOf("tomato", "cucumber", "union", "vinegar", "solt")
    println("Recipe includes next ingredients: ${listOfIngredients}")
    for (ingredient in listOfIngredients) {
        println(ingredient)
    }
}