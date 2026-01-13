package org.example.lesson_8

fun main() {
    print("Enter quantity of your ingredients: ")
    val arraySize = readln().toInt()

    val ingredients = Array(arraySize) { "" }
    for (i in ingredients.indices) {
        print("Enter ingredient ${i + 1}: ")
        ingredients[i] = readln()
    }
    println(ingredients.joinToString(", "))
}