package org.example.lesson_4

fun main() {

    val weightA = 20
    val litersA = 80
    val weightB = 50
    val litersB = 100

    println("A: The cargo with a weight of $weightA kg and a volume of $litersA liters corresponds to the category \'Average\': ${(weightA > 35 && weightA <= 100) and (litersA < 100)}")
    println("B: The cargo with a weight of $weightB kg and a volume of $litersB liters corresponds to the category \'Average\': ${(weightB > 35 && weightB <= 100) and (litersB < 100)}")

}