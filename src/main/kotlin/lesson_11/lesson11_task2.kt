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
    var bio: String = "Like Kotlin",
) {
    fun outputInfoAboutUser() {
        println("User with id ${id}: login - ${login}, password - ${password}, e-mail - ${eMail}, bio - ${bio}.")
    }

    fun changeBioParam(newBio: String) {
        bio = newBio
    }

    fun changePassword(newPass: String): String {
        password = newPass
        println("Password was changed to ${password}")
        return ""
    }
}

fun main() {

    val userDima: User = User(1, "Dima", "qwerty", "dima@dot.dot")
    val userLisa: User = User(2, "Lisa", "asdfgh", "lisa@dot.dot")
    userDima.outputInfoAboutUser()
    userLisa.outputInfoAboutUser()

    val userKit: User2 = User2(3, "Kit", "p", "ocean-kasatka@hotmail.com", "Yes")
    userKit.outputInfoAboutUser()
    userKit.changePassword("shlyapa")
    userKit.changeBioParam("Like coding")
    userKit.outputInfoAboutUser()

}