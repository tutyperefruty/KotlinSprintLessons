package org.example.lesson_15

abstract class User(val name: String) {
    fun readForum() = println("$name is reading a forum")
    fun writeMessage(msgForInput: String) = println("$name is writing a message '$msgForInput'")
}

class Administrator(name: String) : User(name) {
    fun deleteUser(user: User) {
        println("$name is deleting user: ${user.name}")
    }

    fun deleteMessage(msgForDelete: String) {
        println("$name is deleting '${msgForDelete}'")
    }
}

class RegularUser(name: String) : User(name)

fun main() {

    val regularUser = RegularUser("Axel")
    val admin = Administrator("Mr.Admin")

    val printTest = with(regularUser) {
        readForum()
        writeMessage("I'm Regularlarlar")
    }.also {
        with(admin) {
            readForum()
            writeMessage("I'm Adminminmin")
            deleteMessage("Wow")
            deleteUser(regularUser)
        }
    }
}