package org.example.lesson_8

fun main() {

    var listOfIngredients = arrayOf("solt", "sugar", "vinegar", "leefs", "cucumber")
    listOfIngredients.forEach {
        println(it)
    }
    println("What \"Ingredient\" in the list do you want to change?: ")
    val input = readln()
    val index = listOfIngredients.indexOf(input)
    if (index == -1) {
        println("There is no such ingredient in the list")
    } else {
        println("What's your new ingredient?: ")
        listOfIngredients[index] = readln()
        println("Done! You saved next list: [${listOfIngredients.joinToString()}]")
    }
}