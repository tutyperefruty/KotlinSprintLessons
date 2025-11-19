package org.example.lesson_10

const val RANGE_FROM = 1

fun main() {
    println("Length of password: ")
    println(generatePass(readln().toInt()))
}

fun generatePass(vhodnayaDlina: Int): String {
    val minNum = 0
    val maxNum = 9
    val minSpec = 0x20
    val maxSpec = 0x2F
    val oneWord = StringBuilder()
    for (output in RANGE_FROM..vhodnayaDlina) {
        val passInt = (minNum..maxNum).random()
        val passSpec = (minSpec..maxSpec).random().toChar()
        val finRandom = listOf(passInt, passSpec).random()
        oneWord.append(finRandom)
    }
    return oneWord.toString()
}