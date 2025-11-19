package org.example.lesson_10

const val MIN_LENGTH = 4

fun main() {

    println("Input new login: ")
    val newLogin = readln()
    println("Input new password: ")
    val newPass = readln()
    if ((validateLoginAndPasswordLength(newLogin, newPass)) == true) {
        println("Glad to greet you!")
    } else {
        println("Login or Password is not rather long")
    }
}

fun validateLoginAndPasswordLength(vhodnieDannie1: String, vhodnieDannie2: String): Boolean =
    ((vhodnieDannie1.length >= MIN_LENGTH) && (vhodnieDannie2.length >= MIN_LENGTH))