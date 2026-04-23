package org.example.again_lesson_6

const val MIN_NUM = 1
const val MAX_NUM = 9

fun main() {

    var attempt = 3

    do {
        val randomNumberOne = (MIN_NUM..MAX_NUM).random()
        val randomNumberTwo = (MIN_NUM..MAX_NUM).random()
        println("\nРеши пример $randomNumberOne до $randomNumberTwo: ")
        val inputNumber = readln().toInt()

        if (inputNumber != (randomNumberOne + randomNumberTwo)) {
            attempt--
            if (attempt != 0) continue else println("Доступ запрещен")
        } else {
            println("Добро пожаловать!")
            break
        }
    } while (attempt > 0)

}