package org.example.lesson_20

class Robot {

    val phrases = listOf(
        "Me to You.",
        "The faster, the higher!",
        "Don't repeat yourself!",
        "Keep it simple, stupid!",
        "Ooo my god."
    )
    var phrase = phrases.random()

    fun say() {
        println(phrase)
    }

    fun setModifier(modifier: (String) -> String) {
        phrase = modifier(phrase)
    }
}

fun main() {
    val robot = Robot()

    val modifier: (String) -> String = { it.split(" ").reversed().joinToString(" ") }

    robot.say()
    robot.setModifier(modifier)
    robot.say()
}