package org.example.again_lesson_5

fun main() {

    val firstNumber = (1..9).random()
    val secondNumber = (1..9).random()

    println("Введи результат суммы двух чисел: ${firstNumber} + ${secondNumber} = ")
    val input = readln().toIntOrNull()

    if (input == firstNumber + secondNumber) println("Добро пожаловать!") else println("Доступ запрещен!")
}