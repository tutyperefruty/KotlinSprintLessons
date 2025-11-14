package org.example.lesson_7

const val MIN_NUM = 0
const val MAX_NUM = 9
const val MIN_SMALL_CHAR = 'a'
const val MAX_SMALL_CHAR = 'z'
const val MIN_BIG_CHAR = 'A'
const val MAX_BIG_CHAR = 'Z'
const val PASS_FROM = 1
const val PASS_TO = 6

fun main() {

    for (output in PASS_FROM..PASS_TO) {
        val randomOfRange = listOf(
            (MIN_NUM..MAX_NUM).random(),
            (MIN_SMALL_CHAR..MAX_SMALL_CHAR).random(),
            (MIN_BIG_CHAR..MAX_BIG_CHAR).random()
        )
            .random()
        print(randomOfRange)
    }

}