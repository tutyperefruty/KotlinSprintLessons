package org.example.lesson_9

const val INGREDIENT_NUMS = 5

fun main() {

    println("Enter ${INGREDIENT_NUMS} ingredients for dish (on a single line separated by commas with a space): ")
    val ingredientList = readln().split(Regex(",s*")).map{it.trim()}.toList()
    val abcSortList = ingredientList.sorted()
    println(abcSortList)

}