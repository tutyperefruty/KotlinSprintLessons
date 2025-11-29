package org.example.lesson_13

class TelBookContacts(val name: String, val number: Long?, val company: String?) {
    fun getContactInfo() {
        println("Your contact is: Name - $name, Phone number - $number, Company - $company.")
    }
}

fun main() {

    println("Enter your Name: ")
    val inputName = readln()

    println("Enter your Phone number: ")
    val inputPhoneNumber = readln()
    if (inputPhoneNumber.isEmpty()) {
        println("Phone number must be specified!")
        return
    }

    println("Enter your Company: ")
    var inputCompany: String? = readln()
    if (inputCompany!!.isEmpty()) {
        inputCompany = null
    }

    val contacts: MutableList<TelBookContacts> = mutableListOf()
    val newContact: TelBookContacts = TelBookContacts(inputName, inputPhoneNumber.toLongOrNull(), inputCompany.toString())
    contacts.add(newContact)
    newContact.getContactInfo()

}