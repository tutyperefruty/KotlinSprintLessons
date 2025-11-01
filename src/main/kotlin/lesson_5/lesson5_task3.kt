package org.example.lesson_5

const val MIN_VALUE = 0
const val MAX_VALUE = 42

fun main() {

    val firstNum: Int = 3
    val secondNum: Int = 9

    println("Введите первое число от ${MIN_VALUE} до ${MAX_VALUE}: ")
    val firstInput = readln().toInt()
    println("Введите второе число от ${MIN_VALUE} до ${MAX_VALUE}: ")
    val secondInput = readln().toInt()

    val result =
        if (((firstInput == firstNum) || (firstInput == secondNum)) && ((secondInput == secondNum) || (secondInput == firstNum))) {
            "Поздравляем! Вы выиграли главный приз!"
        } else if (((firstInput == firstNum) || (firstInput == secondNum)) or ((secondInput == secondNum) || (secondInput == firstNum))) {
            "Вы выиграли утешительный приз!"
        } else {
            "Неудача!"
        }

    println(result)
    println("Правильные числа: ${secondNum} и ${firstNum}")

}