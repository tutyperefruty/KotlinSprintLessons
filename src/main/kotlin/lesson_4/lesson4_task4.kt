package org.example.lesson_4

fun main() {

    val handsarms = 1
    val abs = 1
    val legs = 0
    val back = 0

    val todayIsDay = 5

    val handArmsRemainder = todayIsDay % 2 == handsarms
    val absRemainder = handArmsRemainder
    val legsRemainder = !handArmsRemainder
    val backRemainder = !handArmsRemainder

    println("""
        Exercises for hands: $handArmsRemainder
        Exercises for abs:   $absRemainder
        Exercises for legs:  $legsRemainder
        Exercises for back:  $backRemainder
    """.trimIndent())

}