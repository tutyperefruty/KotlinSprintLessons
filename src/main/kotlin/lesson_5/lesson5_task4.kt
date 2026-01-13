package org.example.lesson_5

const val NAME = "Zaphad"
const val PASS = "PanGalactic"

fun main() {

    println("Чтож, введи, пожалуйста, своё имя пользователя: ")
    val nameInput = readln()

    if (nameInput == NAME) {
        println("Введи пароль: ")
        val passInput = readln()
        if (passInput == PASS) {
            println("Hi, ${NAME}")
        } else {
            println("Отказ")
        }
    } else {
            println("Создай имя: ")
            val nameReg = readln()
            println("Создай пароль: ")
            val passReg = readln()
        }
}