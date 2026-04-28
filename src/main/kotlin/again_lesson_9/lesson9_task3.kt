package org.example.again_lesson_9

const val EGG_FOR_PORTION = 2
const val MILK_FOR_PORTION = 50
const val BUTTER_FOR_PORTION = 15

fun main() {

    val index0 = "Яйца"
    val index1 = "Молок"
    val index2 = "Масло"
    val omeletteOneUnit = listOf(EGG_FOR_PORTION, MILK_FOR_PORTION, BUTTER_FOR_PORTION)
    println("Введи количество порций: ")
    val servings = readln().toInt()
    val listForAllServings = omeletteOneUnit.map { it * servings }
    println("На $servings порции омлета вам понадобится: " +
            "$index0 - ${listForAllServings[0]} шт., " +
            "$index1 - ${listForAllServings[1]} мл., " +
            "$index2 - ${listForAllServings[2]} гр..")

}