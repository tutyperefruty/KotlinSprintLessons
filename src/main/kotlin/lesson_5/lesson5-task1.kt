package org.example.lesson_5

const val OK_MSG = "Добро пожаловать!"
const val NOT_OK_MSG = "Доступ запрещен."

fun main() {

    print("Введи(пример: 1+2=3) и реши простой математический пример – сложи два числа: ")
    val input = readLine()!!.split("+", "=")
    val part1 = input[0].toInt()
    val part2 = input[1].toInt()
    val part3 = input[2].toInt()

    val result = if (part3 == part2 + part1) {
        OK_MSG
    } else {
        NOT_OK_MSG
    }
    println(result)
}