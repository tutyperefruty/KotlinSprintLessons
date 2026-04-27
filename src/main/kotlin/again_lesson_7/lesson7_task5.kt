package org.example.again_lesson_7

const val MIN_PASSWORD_LENGTH = 6

fun main() {

    println("Введите длину пароля: ")
    var passwordLength = readln().toInt()
    if (passwordLength < MIN_PASSWORD_LENGTH) passwordLength = MIN_PASSWORD_LENGTH

    val digitToCharRange = '0'..'9'
    val smallCharRange = 'a'..'z'
    val bigCharRange = 'A'..'Z'
    val fullRange = digitToCharRange + smallCharRange + bigCharRange

    val symbolListForPassword = mutableListOf<Char>()

    for (i in 0 until passwordLength) {
        symbolListForPassword +=
            when (i % 4) {
                0 -> digitToCharRange.random()
                1 -> smallCharRange.random()
                2 -> bigCharRange.random()
                else -> fullRange.random()
            }
    }

    val password = symbolListForPassword.shuffled().joinToString("")

    println(password)
}