package org.example.again_lesson_7

const val MIN_NUM = 1000
const val MAX_NUM = 9999

fun main() {

    do {
        val randomCode = (MIN_NUM..MAX_NUM).random()
        println("Ваш код авторизации: $randomCode\nВведите его: ")
        val input = readln().toInt()
    } while (randomCode != input)
    println("Добро пожаловать!!!")
}