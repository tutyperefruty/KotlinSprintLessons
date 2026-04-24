package org.example.again_lesson_7

const val MIN_NUM = 0
const val MAX_NUM = 9
const val MIN_SMALL_CHAR = 'a'
const val MAX_SMALL_CHAR = 'z'
const val PASS_FROM = 1
const val PASS_TO = 6

fun main() {

    var password = ""
    for (output in PASS_FROM..PASS_TO) {
        val nextCharOrDigit: String =
            if (password.length % 2 == 0) (MIN_SMALL_CHAR..MAX_SMALL_CHAR).random().toString()
            else (MIN_NUM..MAX_NUM).random().toString()
        password += nextCharOrDigit
    }
    println(password)
}