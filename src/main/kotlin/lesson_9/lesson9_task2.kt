package org.example.lesson_9

fun main() {
    val ingredientsList = mutableListOf("tomato", "cucumber", "onion")
    println("Recipe includes base ingredients: $ingredientsList")
    println("Do you want to add one more? ")
    val newIngredient = readln()
    if (newIngredient.equals("yes", ignoreCase = true)) {
        println("What do you want to add? ")
        val newIngredient = readln()
        if (ingredientsList.filter { it.equals(newIngredient, ignoreCase = true) }.isNotEmpty()) {
            println("Already have such ingredient ${newIngredient}")
        } else {
            ingredientsList.add(newIngredient)
            println("Now recipe includes next ingredients: $ingredientsList")
        }
    }
}