package org.example.lesson_7

const val RANGE_FROM = 1
const val MIN_PASS_LENGTH = 6
const val MIN_NUM = 0
const val MAX_NUM = 9
const val MIN_SMALL_CHAR = 'a'
const val MAX_SMALL_CHAR = 'z'
const val MIN_BIG_CHAR = 'A'
const val MAX_BIG_CHAR = 'Z'

fun main() {

    println("Length of password: ")
    var passLength = readln().toInt()
    if (passLength < MIN_PASS_LENGTH) {
        passLength = MIN_PASS_LENGTH
    }
    for (output in RANGE_FROM..passLength) {
        val passInt = (MIN_NUM..MAX_NUM).random()
        val passSmallChar = (MIN_SMALL_CHAR..MAX_SMALL_CHAR).random()
        val passBigChar = (MIN_BIG_CHAR..MAX_BIG_CHAR).random()
        val finRandom = listOf(passInt, passSmallChar, passBigChar).random()
        print(finRandom)
    }
}