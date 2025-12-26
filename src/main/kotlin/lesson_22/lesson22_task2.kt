package org.example.lesson_22

class RegularNote (private val name: String, private val author: String) {
    override fun toString(): String {
        return "RegularNote(name=$name, author=$author)"
    }
}

data class DataNote (private val name: String, private val author: String)

fun main() {

    val book = RegularNote("Snow", "Darek")

    val dataBook = DataNote("Rain", "Alya")

/* При выводе в консоль экземпляра обычного класса, будет только строковое представление в виде ссылки ->
   -> "org.example.lesson_22.RegularNote@55f96302"
   Для возврата "нормальной" строки, с полями объекта, необходимо переопределять метод toString() */
    println(book) // RegularNote(name=Snow, author=Darek)
// В дата-классе же ничего переопределять нет необходимости. Но переопределение возможно
    println(dataBook) // DataNote(name=Rain, author=Alya)


}