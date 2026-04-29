package org.example.again_lesson_9

fun main() {

    val eggsForPortion = 2
    val milkForPortion = 50
    val butterForPortion = 15

    val omeletteOneUnit = listOf(eggsForPortion, milkForPortion, butterForPortion)
    println("Введи количество порций: ")
    val servings = readln().toInt()
    val listForAllServings = omeletteOneUnit.map { it * servings }
    println("На $servings порции омлета вам понадобится: " +
            "Яйца - ${listForAllServings[0]} шт., " +
            "Молоко - ${listForAllServings[1]} мл., " +
            "Масло - ${listForAllServings[2]} гр..")

}