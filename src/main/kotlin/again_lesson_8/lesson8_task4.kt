package org.example.again_lesson_8

fun main() {

    val listOfIngredients = arrayOf("Соль", "Сахар", "Уксус", "Лавровый лист", "Патиссон")
    listOfIngredients.forEach {
        println(it)
    }
    println("Какой \"ингредиент\" вы хотите заменить?: ")
    val input = readln().lowercase().replaceFirstChar { it.uppercase() }
    val index = listOfIngredients.indexOf(input)

    if (index == -1) println("Такого ингредиента в списке нет").also { return }

    println("Какой ингредиент вы хотели бы добавить?: ")
    listOfIngredients[index] = readln().lowercase().replaceFirstChar { it.uppercase() }
    println("Готово! Вы сохранили следующий список: ${listOfIngredients.joinToString()}")

}