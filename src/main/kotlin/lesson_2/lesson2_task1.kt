package org.example.lesson_2

const val NUM_NUMS = 4

fun main() {

    val num1: Float = 3f
    val num2: Float = 4f
    val num3: Float = 3f
    val num4: Float = 5f

    val sum = num1 + num2 + num3 + num4
    val average = sum / NUM_NUMS

    println("$average")

}