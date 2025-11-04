package org.example.lesson_5

const val RAN_MIN = 0
const val RAN_MAX = 42

fun main() {
    val firstNum = ((RAN_MIN)..(RAN_MAX)).random()
    val secondNum = ((RAN_MIN)..(RAN_MAX)).random()
    val thirdNum = ((RAN_MIN)..(RAN_MAX)).random()
    val lottoList = listOf(firstNum, secondNum, thirdNum)

    println("\nInter three numbers from ${RAN_MIN} up to ${RAN_MAX} to check luck!\nFirst number: ")
    val firstInput = readln().toInt()
    println("Second number: ")
    val secondInput = readln().toInt()
    println("Third number: ")
    val thirdInput = readln().toInt()
    val myList = listOf(firstInput, secondInput, thirdInput)

    val crossNums = lottoList.intersect(myList).size
    println(crossNums)

    val result = when (crossNums) {
        1 -> "Получаешь утешительный приз"
        2 -> "Получаешь скромный приз"
        3 -> "Джекпот!"
        else -> "Nothing matches"
    }
    println(result)
    println("Правильные данные: ${firstNum}, ${secondNum}, ${thirdNum}.")

}