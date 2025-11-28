package org.example.lesson_13

class TelBookContact(val name: String, val number: Long, val company: String? = "null")

fun main() {

    val book: List<TelBookContact> = listOf(
        TelBookContact("Alya", 187659548, "Gug"),
        TelBookContact("Balya", 2865997, null),
        TelBookContact("Calya", 38969569, "Loki"),
        TelBookContact("Dalya", 49812739, "null"),
        TelBookContact("Ealya", 510927903, null)
    )

    val fullContacts = book.map { it.company }.filter { it != null.toString() && it != null }.joinToString()
    println("All existing companies list: $fullContacts.")
}