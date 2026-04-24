package org.example.again_lesson_6

const val MIN_NUM = 1
const val MAX_NUM = 9

fun main() {

    var attempt: Int = 5
    val randomNumber = (MIN_NUM..MAX_NUM).random()

    while (attempt > 0) {
        println("\nВведи любое число от $MIN_NUM до $MAX_NUM: ")
        val inputNumber = readln().toInt()

        if (inputNumber == randomNumber) {
            println("Это была великолепная игра!")
            break
        } else {
            attempt--
            if (attempt == 0) {
                println("It was number $randomNumber")
                break
            }
            println("Неверно, оставшееся количество попыток: $attempt")
        }
    }
}