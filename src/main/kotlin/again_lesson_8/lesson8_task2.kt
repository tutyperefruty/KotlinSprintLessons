package org.example.again_lesson_8

fun main() {

    val ingredientsForMarinade = arrayOf("Лук", "перец", "чеснок", "уксус", "зира")
    println("Укажите ингредиент для поиска: ")
    val input = readln()
    for (ingredient in ingredientsForMarinade) {
        if (ingredient.equals(input, ignoreCase = true)) {
            println("Ингредиент \"${input}\" в рецепте есть")
            return
        }
    }
    println("Такого ингредиента в рецепте нет")

}