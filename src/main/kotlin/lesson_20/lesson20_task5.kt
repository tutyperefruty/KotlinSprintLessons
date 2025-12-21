package org.example.lesson_20

fun main() {

    val phrases = listOf(
        "Me to You.",
        "The faster, the higher!",
        "Don't repeat yourself!",
        "Keep it simple, stupid!",
        "Ooo my god."
    )
    val modifier: (String) -> String = { it.split(" ").reversed().joinToString(" ") }
    var phrase = phrases.random()
    fun say() {
        println(phrase)
    }
    fun setModifier(modifier: (String) -> String) {
        phrase = modifier(phrase)
    }

    say()
    setModifier(modifier)
    say()
}