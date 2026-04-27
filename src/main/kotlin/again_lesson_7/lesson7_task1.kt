package org.example.again_lesson_7

const val PASS_FROM = 1
const val PASS_TO = 6

fun main() {

    var password = ""
    val charRange = 'a'..'z'
    val digitRange = 0..9

    for (i in PASS_FROM..PASS_TO)
        password += if (i % 2 == 0) charRange.random() else digitRange.random().toString()

    println(password)
}