package org.example.lesson_5

import java.time.Year

const val AGE_OF_MAGORITY = 18

fun main() {
    println("Input your birth year: ")
    val inputBirthYear = readln().toInt()

    val nowYear = Year.now().value

    if (AGE_OF_MAGORITY <= nowYear - inputBirthYear) {
        println("Показать экран со скрытым контентом")
    }
}