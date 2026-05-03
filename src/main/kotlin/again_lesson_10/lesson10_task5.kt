package org.example.again_lesson_10

const val LOGIN = "l"
const val PASSWORD = "p"

fun main() {

    println("Введите Login")
    val inputLogin = readln().trim()
    println("Введите password")
    val inputPassword = readln().trim()

    val token = validateLoginAndPassword(inputLogin, inputPassword)
    if (token != null) println("Сейчас в корзине присутствуют: ${getCart(token)}")
    else println("Validation failed")
}

private fun validateLoginAndPassword(login: String, password: String)=
    if (login == LOGIN && password == PASSWORD) generateToken() else null

private fun generateToken(): String {
    val stringBuilder = StringBuilder()
    val rangeForRandom = ('0'..'9') + ('a'..'z') + ('A'..'Z')
    while (stringBuilder.length < 32) stringBuilder.append(rangeForRandom.random())
    return stringBuilder.toString()
}

private fun getCart(token: String): List<Any>  =
    if (token.isNotBlank()) listOf("Кукла", 7, "Банка", 9, "Ракета") else emptyList()