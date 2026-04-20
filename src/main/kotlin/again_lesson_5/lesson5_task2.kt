package org.example.again_lesson_5

import java.time.Year

const val AGE_OF_MAJORITY = 18

fun main() {
    println("Input your birth year: ")
    val inputBirthYear = readln().toInt()

    val nowYear = Year.now().value

    if (nowYear - inputBirthYear >= AGE_OF_MAJORITY) println("Показать экран со скрытым контентом")
    else println("В доступе отказано")
}