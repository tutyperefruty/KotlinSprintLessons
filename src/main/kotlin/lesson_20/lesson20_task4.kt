package org.example.lesson_20

fun main() {
    val elementsList: MutableList<String> = mutableListOf()
    for (i in 1..20) {
        elementsList.add("Element-${i}")
    }

    val printEvenPresedWithLambda: (List<String>) -> List<Unit> = { list ->
        list.map { element -> println("Pressed element [$element]") }
    }

    printEvenPresedWithLambda(elementsList.filterIndexed { index, _ -> (index + 1) % 2 == 0 })
}