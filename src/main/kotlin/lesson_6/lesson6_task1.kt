package org.example.lesson_6

fun main() {

    do {
        println("New ID: ")
        val newID = readln()
        println("New PASSWORD: ")
        val newPass = readln()

        println("Input your ID: ")
        val yourID = readln()
        println("Input your PASSWORD: ")
        val yourPass = readln()
    } while (newID != yourID && newPass != yourPass)

    println("Авторизация прошла успешно.")

}