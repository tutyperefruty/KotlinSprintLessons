package org.example.lesson_11

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

class User2(
    val id: Int,
    val login: String,
    var password: String,
    val eMail: String,
    var bio: String = "Like Kotlin"
) {
    fun outputInfoAboutUser() {
        println("User with id ${id}: login - ${login}, password - ${password}, e-mail - ${eMail}, bio - ${bio}.")
    }

    fun changeBioParam() {
        println("Enter your Bio: ")
        bio = readln()
    }

    fun changePassword(): String? {
        println("Enter present Password to change it: ")
        val presentPass = readln()
        if (presentPass != password) {
            println("Invalid Password input")
            return null
        } else {
            println("Enter new Password to change it: ")
            val newPass = readln()
            if (newPass.isEmpty()) {
                println("Invalid Password input")
                return null
            }
            password = newPass
            println("Password was changed to ${password}")
        }
        return ""
    }
}

fun main() {

    val userDima: User = User(1, "Dima", "qwerty", "dima@dot.dot")
    val userLisa: User = User(2, "Lisa", "asdfgh", "lisa@dot.dot")
    userDima.outputInfoAboutUser()
    userLisa.outputInfoAboutUser()

    val userKit: User2 = User2(3, "Kit", "p", "ocean-kasatka@hotmail.com")
    userKit.outputInfoAboutUser()
    userKit.changePassword()

}