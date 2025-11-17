package org.example.lesson_9

import java.util.*

const val INGREDIENT_NUMS = 5

fun main() {

    val ingredientList = MutableList(INGREDIENT_NUMS) { "" }
    for (ingredient in ingredientList.indices) {
        println("Enter ingredient: ")
        val input = readln()
        if (ingredientList.contains(input)) {
            println("Don't dublicate, reenter, pls!: ")
            val reInput = readln()
            ingredientList[ingredient] = reInput
        } else {
            ingredientList[ingredient] = input
        }
    }

    val conditionedList = ingredientList.sorted().toMutableList()
    conditionedList[0] = conditionedList[0].replaceFirstChar { it.uppercase(Locale.getDefault()) }
    println(conditionedList.joinToString(","))

}