package org.example.lesson_13

class TelBookContact(
    val name: String, val number: Long, val company: String? = null
) {
    fun printInfo() {
        println("- Name: $name\n- Number: $number\n- Company: ${company ?: "Not specified"}")
    }
}

fun main() {
    val contact1: TelBookContact = TelBookContact("Alya", 9876543210, "Gug")
    contact1.printInfo()
}