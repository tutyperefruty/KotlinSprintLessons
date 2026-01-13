package org.example.lesson_3

fun main() {

    val input = "D2-D4;0"
    val parts = input.split('-',';')
    val a = parts[0].toString()
    val b = parts[1].toString()
    val c = parts[2].toString()
    println(a)
    println(b)
    println(c)

}