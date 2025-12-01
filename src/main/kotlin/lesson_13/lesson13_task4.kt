package org.example.lesson_13

class Contact(val name: String, val phoneNum: Long, val company: String?) {
    fun printContactInfo() {
        println("Next contact was created: Name - $name, Phone number - $phoneNum, Company - ${company ?: "Not specified"}.")
    }
}

fun main() {
    val contactsList = mutableListOf<Contact>()

    while (true) {
        println("Enter your Name: ")
        val inputName = readln()

        println("Enter your Phone number: ")
        val inputPhoneNumber: Long = readln().toLongOrNull().let {
            if (it == null) {
                println("Phone number must be specified.")
                continue
            } else {
                it
            }
        }

        println("Enter your Company: ")
        val inputCompany = readln().let { if (it.isEmpty()) null else it }

        val contact = Contact(inputName, inputPhoneNumber, inputCompany)
        contactsList.add(contact)

        contact.printContactInfo()

        println("Would you like to add one more contact?")
        if (readln().lowercase() != "yes") break
    }

    println("Full list of Contacts:")
    contactsList.forEachIndexed { index, contact ->
        println("Contact ${index + 1}: ${contact.name}, ${contact.phoneNum}, ${contact.company}.")
    }
}