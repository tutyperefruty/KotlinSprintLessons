package org.example.again_lesson_4

fun main() {

    val todayIsDay: Int = 5

    val isEvenDay: Boolean = todayIsDay % 2 == 0

    println(
        """
        Exercises for hands: ${!isEvenDay}
        Exercises for legs:  $isEvenDay
        Exercises for back:  $isEvenDay
        Exercises for abs:   ${!isEvenDay}
    """.trimIndent()
    )
}