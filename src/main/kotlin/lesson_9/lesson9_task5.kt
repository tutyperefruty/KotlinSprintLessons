package org.example.lesson_9

import java.util.*

const val INGREDIENT_NUMS = 5

fun main() {

    val ingredientList = MutableList(INGREDIENT_NUMS) { "" }
    for (ingredient in ingredientList.indices) {
        println("Enter ingredient: ")
            ingredientList[ingredient] = readln()
    }
//
    val conditionedList = ingredientList.sorted().toSet().toMutableList()
    conditionedList[0] = conditionedList[0].replaceFirstChar { it.titlecase(Locale.getDefault()) }
    println(conditionedList.joinToString(","))
}