package org.example.again_lesson_9

fun main() {

    println("Введите пять ингредиентов для блюда через “, ” (запятая с пробелом)): ")
    val ingredients = readln()
        .split(", ")
        .map{it.trim()}
        .toList()

    val abcSortList = ingredients.sorted()
    println(abcSortList)

}