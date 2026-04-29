package org.example.again_lesson_9

fun main() {

    println("Введите пять ингредиентов для блюда через “, ” (запятая с пробелом)): ")
    val sortedIngredients = readln().split(", ").sorted()

    println(sortedIngredients)

}