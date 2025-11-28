package org.example.lesson_13

class TelBook(val name: String, val number: Long,) {

    var company: String = "Not specified"

    constructor(
        name: String,
        number: Long,
        companyInput: String? = null,
    ) : this(name, number) {
        if (companyInput == null) company else this.company = companyInput
    }

    fun printInfo() {
        println("- Name: $name\n- Number: $number\n- Company: $company")
    }
}

fun main() {
    val contact1: TelBook = TelBook("Alya", 9876543210, "Gugyyyy")
    contact1.printInfo()

}