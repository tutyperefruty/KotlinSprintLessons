package org.example.lesson_21

fun List<Int>.evenNumbersSum(): Int {
    return this.filter { it % 2 == 0 }.sum()
}

fun main() {
    val list = listOf(11, 22, 33, 44, 55, 66, 77, 88, 99)
    println(list.evenNumbersSum())
}