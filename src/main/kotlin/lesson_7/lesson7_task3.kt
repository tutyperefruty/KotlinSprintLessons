package org.example.lesson_7

const val MIN_NUM = 0

fun main() {

    println("Enter number: ")
    val input = readln().toInt()
    val range: IntRange = MIN_NUM..input
    for (i in range step 2) {
        println(i)
    }

}