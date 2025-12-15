package org.example.lesson_17

data class User(private var _login: String, private val _password: String) {

    var login: String
        get() = _login
        set(value) {
            val oldLogin = _login
            _login = value
            println("Login successfully changed from '$oldLogin' to '$_login'")
        }

    var password: String
        get() = "*".repeat(_password.length)
        set(value) = println("You can't change password to '$value'")
}

fun main() {

    val user1: User = User("Me", "qwerty")

    with(user1) {
        println("Old login: $login")
        login = "You"
        println("New login: $login")
        println("Password: $password")
        password = "000"
    }

}