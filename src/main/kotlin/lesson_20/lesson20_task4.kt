package org.example.lesson_20

fun main() {
    val elementsList: MutableList<String> = mutableListOf()
    for (i in 1..20) {
        elementsList.add("Element-${i}")
    }

    val printWithLambdaEachPressed: (List<String>) -> List<Unit> = { list ->
        list.map { element -> println("Pressed element [$element]") }
    }

    fun List<String>.pressEvenElement(): List<String> {
        return this.filterIndexed { index, _ -> (index + 1) % 2 == 0 }
    }

    printWithLambdaEachPressed(elementsList.pressEvenElement())
}