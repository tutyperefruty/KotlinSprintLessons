package org.example.again_lesson_11


class User(
    val id: Int,
    val login: String,
    val password: String,
    val eMail: String,
) {
    fun displayUserInfo() = println("Юзер с id $id: login - $login, password - $password, e-mail - $eMail.")
}

fun main() {

    val userLola = User(1, "Лола", "fghjkl", "lola@kotlin.kot")
    val userZaphod = User(2, "Зафод", "xcvbnm", "zaphod@kotlin.kot")

    userLola.displayUserInfo()
    userZaphod.displayUserInfo()

}