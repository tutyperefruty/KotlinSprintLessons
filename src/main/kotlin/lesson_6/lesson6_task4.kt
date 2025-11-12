package org.example.lesson_6

const val MIN_NUM = 1
const val MAX_NUM = 9

fun main() {

    var attempt: Int = 5
    val ranList = ((MIN_NUM)..(MAX_NUM)).random()

    do {
        println("\nInput any one number from ${MIN_NUM} to ${MAX_NUM}: ")
        val inputNum = readln().toInt()

        if (inputNum == ranList) {
            println("It was a great game")
            break
        } else {
            attempt--
            println("Wrong, ostatok popitok ${attempt}")
            if (attempt == 0) println("It was number ${ranList}")
        }
    } while (attempt > 0)

}