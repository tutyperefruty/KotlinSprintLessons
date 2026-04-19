package org.example.again_lesson_4

const val ZERO = 0
const val REMAINDER_OF_TWO = 2

fun main() {

    val todayIsDay: Int = 5

    val isEvenDay: Boolean = todayIsDay % REMAINDER_OF_TWO == ZERO

    println(
        """
        Exercises for hands: ${!isEvenDay}
        Exercises for legs:  $isEvenDay
        Exercises for back:  $isEvenDay
        Exercises for abs:   ${!isEvenDay}
    """.trimIndent()
    )
}