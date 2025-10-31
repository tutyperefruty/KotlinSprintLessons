package org.example.lesson_5

fun main() {

    val firstNum: Int = 3
    val secondNum: Int = 9

    println("Введите первое число от 0 до 42: ")
    val firstInput = readLine()!!.toInt()
    println("Введите второе число от 0 до 42: ")
    val secondInput = readLine()!!.toInt()

    val result = when {
        (firstInput == firstNum) or (firstInput == secondNum) && (secondInput == secondNum) or (secondInput == firstNum) -> "Поздравляем! Вы выиграли главный приз!"
        (firstInput == firstNum) or (firstInput == secondNum) or (secondInput == secondNum) or (secondInput == firstNum) -> "Вы выиграли утешительный приз!"
        else -> "Неудача!"
    }

    println(result)
    println("Правильные числа: ${firstNum} и ${secondNum}")

}