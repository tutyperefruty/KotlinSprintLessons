package org.example.again_lesson_10


fun main() {
    println("Введи длину пароля: ")

    generatePasswordWithLength(readln().toInt()).also { println(it) }
}

fun generatePasswordWithLength(length: Int): String {
    val password = StringBuilder()
    for (i in 1..length)
        if (i % 2 == 0) password.append((0..9).random()) else password.append((' '..'/').random())
    return password.toString()
}