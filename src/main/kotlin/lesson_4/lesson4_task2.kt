package org.example.lesson_4

const val WEIGHT_MIN = 35
const val WEIGHT_MAX = 100
const val VOLUME_CRIT = 100

fun main() {

    val weightA = 20
    val litersA = 80
    val weightB = 50
    val litersB = 100

    println("A: The cargo with a weight of $weightA kg and a volume of $litersA liters corresponds to the category \'Average\': ${(weightA > WEIGHT_MIN && weightA <= WEIGHT_MAX) and (litersA < VOLUME_CRIT)}")
    println("B: The cargo with a weight of $weightB kg and a volume of $litersB liters corresponds to the category \'Average\': ${(weightB > WEIGHT_MIN && weightB <= WEIGHT_MAX) and (litersB < VOLUME_CRIT)}")

}