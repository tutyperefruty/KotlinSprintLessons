package org.example.lesson_8

fun main() {
    val sun = 1
    val mon = 2
    val tue = 3
    val wen = 4
    val thu = 5
    val fri = 6
    val sat = 7
    val arrForWeek: IntArray = intArrayOf(sun, mon, tue, wen, thu, fri, sat)
    val weekVisits = arrForWeek.sum()
    println("Total visits on week is ${weekVisits}")

}