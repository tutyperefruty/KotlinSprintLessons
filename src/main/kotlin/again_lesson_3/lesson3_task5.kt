package org.example.again_lesson_3

fun main() {

    val input = "D2-D4;0"
    val parts = input.split('-',';')
    val startPoint = parts[0]
    val nextPoint = parts[1]
    val moveNumber = parts[2]
    println(startPoint)
    println(nextPoint)
    println(moveNumber)

}