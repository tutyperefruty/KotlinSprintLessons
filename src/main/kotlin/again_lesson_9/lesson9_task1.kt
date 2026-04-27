package org.example.again_lesson_9

fun main() {

    val ingredients = listOf("Томат", "Огурец", "Лук", "Уксус", "Соль")

    println("Рецепт включает следующие ингредиенты: $ingredients")

    ingredients.forEach {ingredient -> println(ingredient) }
}