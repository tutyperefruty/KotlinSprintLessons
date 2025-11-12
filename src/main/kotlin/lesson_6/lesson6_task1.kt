package org.example.lesson_6

fun main() {

        println("New ID: ")
        val newID = readln()
        println("New PASSWORD: ")
        val newPass = readln()

    do {
        println("Input your ID: ")
        val yourID = readln()
        println("Input your PASSWORD: ")
        val yourPass = readln()
    } while ((newID != yourID) or (newPass != yourPass))

    println("Авторизация прошла успешно.")

}