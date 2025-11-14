package org.example.lesson_8

fun main() {

    var listOfIngredients = arrayOf("solt", "sugar", "vinegar", "leefs", "cucumber")
    for (ingredient in listOfIngredients) {
        println(ingredient)
    }
    println("What \"Ingredient\" in the list do you want to change?: ")
    val input = readln()
    if (input in listOfIngredients) {
        println("What's your new ingredient?: ")
        listOfIngredients[listOfIngredients.indexOf(input)] = readln()
        println("Done! You saved next list: [${listOfIngredients.joinToString()}]")
    } else {
        println("There is no such ingredient in the list")
    }

}