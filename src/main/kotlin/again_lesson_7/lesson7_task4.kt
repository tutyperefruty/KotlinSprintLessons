package org.example.again_lesson_7

const val ONE_SECOND = 1000L

fun main() {

    println("Введите количество секунд: ")
    val seconds = readln().toInt()
    for (i in seconds downTo 1) {
        println("Осталось $i секунд")
        Thread.sleep(ONE_SECOND)
    }
    println("Время вышло")
}