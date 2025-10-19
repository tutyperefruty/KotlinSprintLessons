package org.example.lesson_1

fun main() {
    var totalOrders: Int = 75
    val thanksMessage: String = "You are the Best buyer!"

    println(thanksMessage)
    println(totalOrders)

    var numbersOfEmployees = 2000

    println("Numbers of Employees: $numbersOfEmployees")

//    Представим, что один работник уволился. Создаём и инициализируем переменную увольняющихся работников в количестве 1 человека.
    val fired = 1
    var renewNumbersOfEmployees = numbersOfEmployees - fired
    println("Numbers of Employees now: $renewNumbersOfEmployees")
}