package org.example.lesson_20

fun main() {
    val elementsList: MutableList<String> = mutableListOf()
    for (i in 1..20) {
        elementsList.add("Element-${i}")
    }

    val printEvenWithLambdaList = elementsList.filterIndexed { index, _ -> (index + 1) % 2 == 0 }
        .map{ element -> println("Pressed element [$element]") }

    printEvenWithLambdaList
}