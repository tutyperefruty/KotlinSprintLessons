package org.example.again_lesson_6

const val MILLIS_IN_SECOND = 1000L

fun main() {

    println("Give me tne number of seconds: ")
    val secondsNumber = readln().toLong()

    Thread.sleep(secondsNumber * MILLIS_IN_SECOND)

    println("Прошло $secondsNumber секунд.")
}