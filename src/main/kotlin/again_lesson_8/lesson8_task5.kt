package org.example.again_lesson_8

fun main() {
    print("Введите количество ингредиентов: ")
    val arraySize = readln().toInt()

    val ingredients = Array(arraySize) { "" }
    for (i in ingredients.indices) {
        print("Введи ингредиент ${i + 1}: ")
        ingredients[i] = readln().replaceFirstChar { it.uppercase() }
    }

    println(ingredients.joinToString(", "))
}