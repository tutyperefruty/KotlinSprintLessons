package org.example.lesson_4

fun main() {

    val handsArmsAbs = 1

    val todayIsDay = 5

    val handArmsAbsRemainder = todayIsDay % 2 == handsArmsAbs

    println(
        """
        Exercises for hands: $handArmsAbsRemainder
        Exercises for abs:   $handArmsAbsRemainder
        Exercises for legs:  ${!handArmsAbsRemainder}
        Exercises for back:  ${!handArmsAbsRemainder}
    """.trimIndent()
    )

}