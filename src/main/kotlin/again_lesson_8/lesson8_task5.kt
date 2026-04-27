package org.example.again_lesson_8

fun main() {
    print("Введите количество ингредиентов: ")
    val arraySize = readln().toInt()

    val ingredients = Array(arraySize) { "" }
    for (ingredient in ingredients.indices) {
        print("Введи ингредиент ${ingredient + 1}: ")
        ingredients[ingredient] = readln().replaceFirstChar { it.uppercase() }
    }

    println(ingredients.joinToString(", "))
}