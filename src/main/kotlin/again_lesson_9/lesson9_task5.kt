package org.example.again_lesson_9


const val INGREDIENTS_QUANTITY = 5

fun main() {

    val ingredients = MutableList(INGREDIENTS_QUANTITY) { "" }
    for (i in ingredients.indices) {
        println("Введите ингредиент ${i + 1}: ")
        ingredients[i] = readln()
    }

    val conditionedList = ingredients.toSet().sorted().toMutableList()
    conditionedList[0] = conditionedList[0].replaceFirstChar { it.uppercase() }
    println(conditionedList.joinToString(","))
}