package org.example.again_lesson_6

fun main() {

    println("Create ID: ")
    val newId = readln()
    println("Create PASSWORD: ")
    val newPassword = readln()

    do {
        println("Input your ID to log in: ")
        val loginId = readln()
        println("Input your PASSWORD: ")
        val loginPassword = readln()
    } while ((newId != loginId) or (newPassword != loginPassword))

    println("Авторизация прошла успешно.")
}