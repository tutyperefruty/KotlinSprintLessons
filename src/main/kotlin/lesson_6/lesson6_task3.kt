package org.example.lesson_6

fun main() {

    println("Give me tne number of seconds: ")
    var numOfSecs = readln().toInt()

    while (numOfSecs > 0) {
        println("Осталось секунд: ${numOfSecs--}")
        Thread.sleep(1000)
    }
    println("Время вышло")

}