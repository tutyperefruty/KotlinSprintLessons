package org.example.lesson_10

const val RANGE_FROM = 1
const val MIN_NUM = 0
const val MAX_NUM = 9

fun main() {
    println("Length of password: ")
    val passLengthInput = readln().toInt()
    generatePass(vhodnayaDlina = passLengthInput)
}

fun generatePass(vhodnayaDlina: Int) {
    val specList = listOf("!", "\"", "#", "$", "%", "&", "'", "(", ")", "*", "+", ",", "-", ".", "/", "_")
    for (output in RANGE_FROM..vhodnayaDlina) {
        val passInt = (MIN_NUM..MAX_NUM).random()
        val passSpec = specList.random()
        val finRandom = listOf(passInt, passSpec).random()
        print(finRandom)
    }
    return
}