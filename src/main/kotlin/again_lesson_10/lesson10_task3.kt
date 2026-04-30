package org.example.again_lesson_10


fun main() {
    println("Введи длину пароля: ")

    generatePasswordWithLength(readln().toInt()).also { println(it) }
}

fun generatePasswordWithLength(length: Int): String {
    val password = StringBuilder()
    for (i in 1..length) {
        val digitRandom = (0..9).random()
        val specRandom = (0x20..0x2F).random().toChar()
        val finalRandom = listOf(digitRandom, specRandom).random()
        password.append(finalRandom)
    }
    return password.toString()
}