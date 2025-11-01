package org.example.lesson_5

const val FIRST_NUM = 3
const val SECOND_NUM = 6

fun main() {

    print("Введи результат суммы двух чисел: ${FIRST_NUM} + ${SECOND_NUM} = ")
    val input = readln()?.toInt()

    val okMsg = "Добро пожаловать!"
    val notOkMsg = "Доступ запрещен."

    val result = if (input == FIRST_NUM + SECOND_NUM) {
        okMsg
    } else {
        notOkMsg
    }
    println(result)
}