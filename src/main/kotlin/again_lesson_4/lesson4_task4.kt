package org.example.again_lesson_4

const val CONSTANT_FOR_ARMS_AND_ABS = 1
const val REMAINDER_OF_TWO = 2

fun main() {

    val todayIsDay: Int = 5

    val exerciseReminder: Boolean = todayIsDay % REMAINDER_OF_TWO == CONSTANT_FOR_ARMS_AND_ABS

    println(
        """
        Exercises for hands: $exerciseReminder
        Exercises for abs:   $exerciseReminder
        Exercises for legs:  ${!exerciseReminder}
        Exercises for back:  ${!exerciseReminder}
    """.trimIndent()
    )
}