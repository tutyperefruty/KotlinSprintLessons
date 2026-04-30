package org.example.again_lesson_9


const val INGREDIENTS_QUANTITY = 5

fun main() {

    val ingredients = MutableList(INGREDIENTS_QUANTITY) { i ->
        println("Введите ингредиент ${i + 1}: ")
        readln()
    }

    println(ingredients.toSortedSet().joinToString().replaceFirstChar { it.uppercase() })
}