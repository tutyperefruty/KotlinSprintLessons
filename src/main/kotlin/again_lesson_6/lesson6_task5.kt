package org.example.again_lesson_6

const val MIN_NUM = 1
const val MAX_NUM = 9

fun main() {

    var attempt = 3

    do {
        val randomNumberOne = (MIN_NUM..MAX_NUM).random()
        val randomNumberTwo = (MIN_NUM..MAX_NUM).random()
        println("\nРеши пример $randomNumberOne + $randomNumberTwo: ")
        val inputNumber = readln().toInt()

        if (inputNumber != (randomNumberOne + randomNumberTwo)) {
            attempt--
            continue
        } else {
            println("Добро пожаловать!")
            return
        }
    } while (attempt > 0)

    println("Доступ запрещен")
}