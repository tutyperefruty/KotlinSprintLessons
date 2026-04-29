package org.example.again_lesson_9

fun main() {
    val ingredients = mutableListOf("Томат", "Огурец", "Лук")
    println("В рецепте есть базовые ингредиенты: $ingredients")
    println("Желаете добавить еще? ")
    val answerInput = readln()

    if (answerInput.equals("да", ignoreCase = true)) {
        println("Какой ингредиент вы хотите добавить? ")
        val newIngredient = readln()
        if (ingredients.any { ingredient -> ingredient.equals(newIngredient, ignoreCase = true) }) {
            println("Ингредиент '$newIngredient' содержится в списке")
        } else {
            ingredients.add(newIngredient)
            println("Теперь в рецепте есть следующие ингредиенты: $ingredients")
        }
    }
}