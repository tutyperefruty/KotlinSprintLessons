package org.example.lesson_4

fun main() {

    val a_handsarms = 1
    val b_abs = 1
    val c_legs = 0
    val d_back = 0

    val todayIsDay = 5

    val a_compareRemainder = todayIsDay % 2 == a_handsarms
    val b_compareRemainder = todayIsDay % 2 == b_abs
    val c_compareRemainder = todayIsDay % 2 == c_legs
    val d_compareRemainder = todayIsDay % 2 == d_back

    println("""
        Exercises for hands: $a_compareRemainder
        Exercises for abs:   $b_compareRemainder
        Exercises for legs:  $c_compareRemainder
        Exercises for back:  $d_compareRemainder
    """.trimIndent())

}