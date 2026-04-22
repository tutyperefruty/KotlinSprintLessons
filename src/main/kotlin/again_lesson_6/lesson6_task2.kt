package org.example.again_lesson_6

const val MILLIS_IN_SECOND = 1000L

fun main() {

    println("Give me tne number of seconds: ")
    var secondsNumber = readln().toLong()
    while (secondsNumber > 0) {
        Thread.sleep(MILLIS_IN_SECOND)
        secondsNumber--
    }
    println("Прошло ${secondsNumber} секунд.")
}