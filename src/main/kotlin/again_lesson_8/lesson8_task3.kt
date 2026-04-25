package org.example.again_lesson_8

fun main() {

    val ingredientsForMarinade = arrayOf("лук", "перец", "чеснок", "уксус", "зира")
    println("Укажите ингредиент для поиска: ")
    val input = readln()
    if (input.lowercase() in ingredientsForMarinade) println("Ингредиент \"${input}\" в рецепте есть")
    else println("Такого ингредиента в рецепте нет")

}