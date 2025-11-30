package org.example.lesson_13

class Contact(val name: String, val phoneNumber: Long, val company: String?) {
    fun getContactInfo() {
        println("Next contact was created: Name - $name, Phone number - $phoneNumber, Company - $company.")
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

        contact.getContactInfo()

        println("Would you like to add one more contact?")
        val continueOrNot = readln().lowercase().let { if (it != "yes") break }

    }

    var firstContact: Int = 1
    println("Full list of Contacts:")
    contactsList.forEach { println("Contact ${firstContact++}: ${it.name}, ${it.phoneNumber}, ${it.company}.") }
}