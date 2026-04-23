package org.example.again_lesson_5

const val MIN_NUMBER = 0
const val MAX_NUMBER = 42

fun main() {
    val firstNum = (MIN_NUMBER..MAX_NUMBER).random()
    val secondNum = (MIN_NUMBER..MAX_NUMBER).random()
    val thirdNum = (MIN_NUMBER..MAX_NUMBER).random()
    val lottoList = listOf(firstNum, secondNum, thirdNum)

    println("\nВведи 3 числа от $MIN_NUMBER до $MAX_NUMBER чтобы проверить свою удачу!\nПервое число: ")
    val firstInput = readln().toInt()
    println("Второе число: ")
    val secondInput = readln().toInt()
    println("Третье число: ")
    val thirdInput = readln().toInt()
    val myInputList = listOf(firstInput, secondInput, thirdInput)

    val crossNums = lottoList.intersect(myInputList).size

    val result = when (crossNums) {
        1 -> "Получаешь утешительный приз"
        2 -> "Получаешь крупный приз"
        3 -> "Джекпот!"
        else -> "Nothing matches"
    }
    println(result)
    println("Правильные данные: $lottoList.")
}