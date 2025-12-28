package org.example.lesson_20

class Robot {
    val phrases = listOf(
        "Me to You.",
        "The faster, the higher!",
        "Don't repeat yourself!",
        "Keep it simple, stupid!",
        "Ooo my god."
    )
    private var modifier: (String) -> String = { it }
    private val randomPhrase = phrases.random()

    fun say() {
        println(modifier(randomPhrase))
    }

    fun setModifier(reverseModifier: (String) -> String) {
        modifier = reverseModifier
    }
}

fun main() {
    val robot = Robot()

    val reverseModifier: (String) -> String = { it.split(" ").reversed().joinToString(" ") }

    robot.say()
    robot.setModifier(reverseModifier)
    robot.say()
}