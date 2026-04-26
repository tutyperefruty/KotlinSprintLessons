package org.example.again_lesson_7

const val MIN_PASSWORD_LENGTH = 6
const val MIN_NUM = '0'
const val MAX_NUM = '9'
const val MIN_SMALL_CHAR = 'a'
const val MAX_SMALL_CHAR = 'z'
const val MIN_BIG_CHAR = 'A'
const val MAX_BIG_CHAR = 'Z'

fun main() {

    println("Введите длину пароля: ")
    var passwordLength = readln().toInt()
    if (passwordLength < MIN_PASSWORD_LENGTH) passwordLength = MIN_PASSWORD_LENGTH

    val digitToCharRange = MIN_NUM..MAX_NUM
    val smallCharRange = MIN_SMALL_CHAR..MAX_SMALL_CHAR
    val bigCharRange = MIN_BIG_CHAR..MAX_BIG_CHAR
    val fullRange = digitToCharRange.toList() + smallCharRange.toList() + bigCharRange.toList()

    val symbolListForPassword = mutableListOf<Char>()

    (0 until passwordLength).forEachIndexed { index, _ ->
        symbolListForPassword +=
            when (index % 4) {
                0 -> digitToCharRange.random()
                1 -> smallCharRange.random()
                2 -> bigCharRange.random()
                else -> fullRange.random()
            }
    }

    val password = symbolListForPassword.shuffled().joinToString("")

    println(password)
}