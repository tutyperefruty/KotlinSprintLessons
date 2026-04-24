package org.example.again_lesson_7

const val RANGE_FROM = 1
const val MIN_PASSWORD_LENGTH = 6
const val MIN_NUM = 0
const val MAX_NUM = 9
const val MIN_SMALL_CHAR = 'a'
const val MAX_SMALL_CHAR = 'z'
const val MIN_BIG_CHAR = 'A'
const val MAX_BIG_CHAR = 'Z'

fun main() {

    println("Введите длину пароля: ")
    var passwordLength = readln().toInt()
    if (passwordLength < MIN_PASSWORD_LENGTH) passwordLength = MIN_PASSWORD_LENGTH

    var password = ""

    for (i in RANGE_FROM..passwordLength) {
        val randomSymbol: String = listOf(
            (MIN_NUM..MAX_NUM).random().toString(),
            (MIN_SMALL_CHAR..MAX_SMALL_CHAR).random().toString(),
            (MIN_BIG_CHAR..MAX_BIG_CHAR).random().toString()
        )
            .random()

        password += randomSymbol
    }

    println(password)
}