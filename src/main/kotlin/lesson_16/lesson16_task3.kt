package org.example.lesson_16

class User(private val login: String, private val password: String) {

    fun validatePassword(inputPassword: String?): Boolean = inputPassword == password

}

fun main() {

    val user: User = User("me", "myPas")

    val inputPassword = user.validatePassword("myPass")

    if (inputPassword) println("OK") else println("NOT OK")

}