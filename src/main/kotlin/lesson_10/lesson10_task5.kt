package org.example.lesson_10

const val LOGIN = "l"
const val PASSWORD = "p"
const val MIN_NUM = 0
const val MAX_NUM = 9
const val MIN_SMALL_CHAR = 'a'
const val MAX_SMALL_CHAR = 'z'
const val MIN_BIG_CHAR = 'A'
const val MAX_BIG_CHAR = 'Z'
const val TOK_NUM_FROM = 1
const val TOK_NUM_TO = 32
const val LOGIN_NAME = "Login"
const val PASS_NAME = "Password"
const val TOKEN_NAME = "Token"

fun main() {

    printBeforReadln(LOGIN_NAME)
    if (validateInput(readln(), LOGIN) == null) {
        printValidFail(LOGIN_NAME)
        return
    }

    printBeforReadln(PASS_NAME)
    if (validateInput(readln(), PASSWORD) == null) {
        printValidFail(PASS_NAME)
        return
    }

    val tokenString = generateToken()
    println(tokenString)
    printBeforReadln(TOKEN_NAME)
    if (validateInput(readln(), tokenString) == null) {
        printValidFail(TOKEN_NAME)
        return
    } else {
        getCart()
    }
}

fun validateInput(input: String?, constantaOrToken: String?): String? {
    if (input?.isEmpty() == true) return null
    if (input != constantaOrToken) return null
    return ""
}

fun generateToken(): String {
    val toOneWord = StringBuilder()
    for (output in TOK_NUM_FROM..TOK_NUM_TO) {
        val randomOfRange = listOf(
            (MIN_NUM..MAX_NUM).random(),
            (MIN_SMALL_CHAR..MAX_SMALL_CHAR).random(),
            (MIN_BIG_CHAR..MAX_BIG_CHAR).random()
        )
            .random()
        toOneWord.append(randomOfRange)
    }
    val tokenString = toOneWord.toString()
    return tokenString
}

fun printBeforReadln(smth: String) {
    println("Enter ${smth}")
}

fun printValidFail(name: String) {
    return println("${name} validation failed")
}

fun getCart() {
    println("You can see your cart here:")
    val list = listOf<Any>("Product1", 7, "Product3", 9, "Product5")
    list.forEach { println(it) }
}