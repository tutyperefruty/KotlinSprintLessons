package org.example.again_lesson_7

fun main() {

    println("Введи число: ")
    val rangeLastNumber = readln().toInt()

    for (number in 0 .. rangeLastNumber step 2) println(number)
}