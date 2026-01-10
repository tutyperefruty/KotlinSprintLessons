package org.example.lesson_15

abstract class User(val name: String) {

    fun readForum() = println("$name is reading a forum")

    fun writeMessage(message: String) = println("$name is writing a message '$message'")

    abstract fun showActions()
}

class Administrator(name: String) : User(name) {

    override fun showActions() {
        println("Admin can read the forum, write and delete messages, and delete users")
    }

    fun deleteUser(user: User) {
        println("$name is deleting user: ${user.name}")
    }

    fun deleteMessage(message: String) {
        println("$name is deleting '${message}'")
    }

}

class RegularUser(name: String) : User(name) {

    override fun showActions() {
        println("Regular Users can read the forum and write messages")
    }

}

fun main() {

    val regularUser = RegularUser("Axel")
    val admin = Administrator("Mr.Admin")

    with(regularUser) {
        showActions()
        readForum()
        writeMessage("I'm Regularlarlar")
    }
    with(admin) {
        showActions()
        readForum()
        writeMessage("I'm Adminminmin")
        deleteMessage("Wow")
        deleteUser(regularUser)
    }

}