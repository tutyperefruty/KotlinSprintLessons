package org.example.again_lesson_7

const val MIN_NUM = 0
const val MAX_NUM = 9
const val MIN_SMALL_CHAR = 'a'
const val MAX_SMALL_CHAR = 'z'
const val PASS_FROM = 1
const val PASS_TO = 6

fun main() {

    var password = ""
    val charRange = MIN_SMALL_CHAR..MAX_SMALL_CHAR
    val digitRange = MIN_NUM..MAX_NUM

    for (i in PASS_FROM..PASS_TO)
        password += if (i % 2 == 0) charRange.random().toString() else digitRange.random().toString()

    println(password)
}