package org.example.lesson_7

const val TO_ZERO = 1
const val ONE_SECOND = 1000L

fun main() {

    println("Input seconds: ")
    val seconds = readln().toInt()
    for (i in seconds downTo TO_ZERO) {
        println("${i} seconds left")
        Thread.sleep(ONE_SECOND)
    }
    println("Time's up")

}