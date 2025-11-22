package org.example.lesson_11

fun main() {

    val userLola: User = User(1, "Lola", "fghjkl", "lola@kotlin.kot")
    val userKola: User = User(1, "Kola", "xcvbnm", "kola@kotlin.kot")
    userLola.outputInfoAboutUser()
    userKola.outputInfoAboutUser()

}

class User(
    val id: Int,
    val login: String,
    val password: String,
    val eMail: String,
) {
    fun outputInfoAboutUser() {
        println("User with id ${id}: login - ${login}, password - ${password}, e-mail - ${eMail}.")
    }
}