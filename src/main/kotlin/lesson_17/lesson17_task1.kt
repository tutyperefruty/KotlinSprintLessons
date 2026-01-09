package org.example.lesson_17

class Viktorina(private var _question: String, private var _answer: String) {

    val question: String
        get() = _question

    var answer: String
        get() = _answer
        set(value) {
            _answer = value
        }
}

fun main() {

    val viktorina = Viktorina("Who?", "Me")
    with(viktorina) {
        println(question)
        println(answer)
        answer = "You"
        println(question)
        println(answer)
    }

}