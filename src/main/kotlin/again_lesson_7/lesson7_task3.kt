package org.example.again_lesson_7

const val RANGE_START_NUM = 0

fun main() {

    println("Введи число: ")
    val rangeLastNumber = readln().toInt()

    for (number in RANGE_START_NUM until rangeLastNumber step 2) println(number)
}