package org.example.lesson_11

class User(
    val id: Int,
    val login: String,
    val password: String,
    val eMail: String,
) {
    fun printParams(){
        println("${id}, ${login}, ${password}, ${eMail}")
    }
}