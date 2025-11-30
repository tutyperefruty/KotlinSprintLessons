package org.example.lesson_13

class TelBookContacts(val inputName: String, val inputPhoneNumber: String, val inputCompany: String?)

fun main() {

    println("Enter your Name: ")
    val inputName = readln()

    println("Enter your Phone number: ")
    var inputPhoneNumber = readln()
    if (inputPhoneNumber.isNotEmpty()) {
        try {
            inputPhoneNumber.toLong()
        } catch (e: Exception) {
            println("Catch ERROR name: ${e::class.simpleName}")
        }
        inputPhoneNumber = inputPhoneNumber.toLong().toString()
    } else {
        println("Phone number must be specified!")
        return
    }

    println("Enter your Company: ")
    var inputCompany: String? = readln()
    if (inputCompany!!.isEmpty()) {
        inputCompany = null
    }

}