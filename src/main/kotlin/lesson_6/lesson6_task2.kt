package org.example.lesson_6

const val MILLIS_IN_SECOND = 1000L

fun main() {

    println("Give me tne number of seconds: ")
    val numOfSecs = readln().toLong()
    Thread.sleep(MILLIS_IN_SECOND * numOfSecs)
    println("Прошло ${numOfSecs} секунд.")

}