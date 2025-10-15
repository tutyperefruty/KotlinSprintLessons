package org.example.lesson_1

fun main() {
    var totalOrders: Int = 75
    val thanksMessage: String = "You are the Best buyer!"

    println(thanksMessage)
    println(totalOrders)

//    Устанавливаем количество работников
    var numbersOfEmployees = 2000

//    Количество работников: вывод на экран
    println("Numbers of Employees: $numbersOfEmployees")


//    Увольняется 1 работник
    val fired = 1
    var renewNumbersOfEmployees = numbersOfEmployees - fired
    println("Numbers of Employees now: $renewNumbersOfEmployees")
//or
    println("OR")
    numbersOfEmployees -=1
    println("Numbers of Employees now: $numbersOfEmployees")
}