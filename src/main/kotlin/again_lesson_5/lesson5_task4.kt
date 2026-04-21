package org.example.again_lesson_5

const val NAME = "Zaphad"
const val PASSWORD = "PanGalactic"

fun main() {

    println("Эх..., пожалуйста, вводите свои данные...: ")
    val nameInput = readln()

    when (nameInput) {
        NAME -> {
            println("Введи пароль: ")
            val passwordInput = readln()
            when (passwordInput) {
                PASSWORD -> println("Эх... ... Ваши данные проверены, и о, чудо, они верны... Пользователь $NAME, " +
                        "вам разрешено входить на борт корабля \"Heart of Gold\". Хотя мне всё равно...")
                else -> {
                    println("Эх... Печаль, вам отказано...")
                    displayRegistrationByMarvin(nameInput)
                }
            }
        }
        else -> displayRegistrationByMarvin(nameInput)
    }
}

fun displayRegistrationByMarvin(nameInput: String) {
    println("Эх..., $nameInput, давай зарегистрируемся. Создай имя: ")
    val nameReg = readln()
    println("Вот и дошли до создания пароля... Что-ж, придумай его: ")
    val passwordReg = readln()
    println("Вот теперь у нас есть новый персонаж в нашем путешествии. " +
            "Это $nameReg с ${passwordReg.length} значным паролем")
}