package org.example.again_lesson_5

const val MIN_VALUE = 0
const val MAX_VALUE = 3

fun main() {

    val firstNum: Int = (MIN_VALUE..MAX_VALUE).random()

    var secondNum: Int
    do { secondNum = (MIN_VALUE..MAX_VALUE).random() } while (secondNum == firstNum)

    println("Введите первое число от $MIN_VALUE до $MAX_VALUE: ")
    val firstInput = readln().toInt()
    println("Введите второе число от $MIN_VALUE до $MAX_VALUE: ")
    val secondInput = readln().toInt()

    val guessedCount = listOf(firstNum, secondNum).intersect(listOf(firstInput, secondInput)).size

    val result =
        if (guessedCount == 2) {
            "Поздравляем! Вы выиграли главный приз!"
        } else if (guessedCount == 1) {
            "Вы выиграли утешительный приз!"
        } else {
            "Неудача!"
        }

    println(result)
    println("Правильные числа: $secondNum и $firstNum")
}