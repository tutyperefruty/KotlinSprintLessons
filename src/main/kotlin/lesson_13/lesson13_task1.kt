package org.example.lesson_13

class TelBook(val name: String, val number: Long) {

    var company: String? = null

    constructor(
        name: String,
        number: Long,
        company: String?,
    ) : this(name, number) {
        this.company = company
    }
}