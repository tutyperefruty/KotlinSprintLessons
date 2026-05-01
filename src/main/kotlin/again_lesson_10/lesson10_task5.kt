package org.example.again_lesson_10

const val LOGIN = "l"
const val PASSWORD = "p"
const val LOGIN_NAME = "Login"
const val PASS_NAME = "Password"
const val TOKEN_NAME = "Token"

fun main() {

    val cart = listOf("Кукла", 7, "Банка", 9, "Ракета")

    askFor(LOGIN_NAME)
    if (readln() validateWith LOGIN == null) printValidFail(LOGIN_NAME).also { return }

    askFor(PASS_NAME)
    if (readln() validateWith PASSWORD == null) printValidFail(PASS_NAME).also { return }

    askFor(TOKEN_NAME)
    val tokenString = generateToken().also { println(it) }
    if (readln() validateWith tokenString == null) printValidFail(TOKEN_NAME).also { return }
    else getCart(cart)
}

private fun askFor(string: String) = println("Введите $string")

private infix fun String?.validateWith(infoString: String): String? =
    if (this?.isBlank() == true || this != infoString) null else ""

private fun generateToken(): String {
    val stringBuilder = StringBuilder()
    val rangeForRandom = ('0'..'9') + ('a'..'z') + ('A'..'Z')
    while (stringBuilder.length < 32) stringBuilder.append(rangeForRandom.random())
    return stringBuilder.toString()
}

private fun printValidFail(smth: String) = println("$smth validation failed")

private fun getCart(cart: List<Any>) = println("Сейчас в корзине присутствуют: $cart")