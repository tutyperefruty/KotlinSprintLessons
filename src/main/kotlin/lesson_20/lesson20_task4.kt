package org.example.lesson_20

fun main() {
    val elementsList: MutableList<String> = mutableListOf()
    for (i in 1..20) {
        elementsList.add("Element-${i}")
    }

    val pressedElementList = elementsList.map { element: String ->
        { println("Нажат элемент $element") }
    }

    pressedElementList.forEachIndexed { index, action ->
        if ((index + 1) % 2 == 0) {
            action()
        }
    }
}