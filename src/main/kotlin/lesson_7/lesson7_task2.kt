package org.example.lesson_7

const val MIN_NUM = 1000
const val MAX_NUM = 9999

fun main() {

    do {
        val random = (MIN_NUM..MAX_NUM).random()
        println("Your auth.number is ${random}\nEnter your code for auth: ")
        val input = readln().toInt()
    } while (random != input)
    println("Hi!")

}