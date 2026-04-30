package org.example.again_lesson_10

const val MIN_LENGTH = 4

fun main() {
    println("Введите логин: ")
    val newLogin = readln()
    println("введите пароль: ")
    val newPassword = readln()
    if (newLogin validateLength MIN_LENGTH && newPassword validateLength MIN_LENGTH) println("Приветствую тебя!")
    else println("Логин или пароль недостаточно длинные")
}

infix fun String.validateLength(length: Int) = this.length >= length