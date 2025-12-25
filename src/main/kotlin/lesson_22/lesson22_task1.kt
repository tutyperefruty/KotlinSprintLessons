package org.example.lesson_22

class RegularBook (private val name: String, private val author: String)

data class DataBook (private val name: String, private val author: String)

fun main() {

    val book1 = RegularBook("Snow", "Darek")
    val book2 = RegularBook("Snow", "Darek")

    val dataBook1 = DataBook("Rain", "Alya")
    val dataBook2 = DataBook("Rain", "Alya")

//      Сравниваются ссылки на объекты в памяти
    println(book1 == book2) // false
//      Сравниваются значения
    println(dataBook1 == dataBook2) // true

}