package org.example.lesson_11

fun main() {

    val userDima: User = User(
        id = 1,
        login = "Dima",
        password = "qwerty",
        eMail = "dima@dot.dot"
    )
    val userLisa: User = User(
        id = 2,
        login = "Lisa",
        password = "asdfgh",
        eMail = "lisa@dot.dot"
    )

    userDima.printParams()
    userLisa.printParams()

}