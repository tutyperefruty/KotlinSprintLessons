package org.example.lesson_5

import kotlin.random.Random

fun main() {
    val firstNum = Random.nextInt(0, 43)
    val secondNum = Random.nextInt(0, 43)
    val thirdNum = Random.nextInt(0, 43)
    val lottoList = listOf(firstNum, secondNum, thirdNum)
//    println(lottoList)

    println("\nInter three numbers from 0 up to 42 to check luck!\nFirst number: ")
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