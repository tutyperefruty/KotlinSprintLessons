package org.example.lesson_5

import kotlin.math.pow

const val TO_METERS = 0.01

fun main() {

    println("Give me your weight in kilograms: ")
    val weightInput = readln().toDouble()
    println("Give me your height in centimeters: ")
    val heightInput = readln().toFloat()

    val meters = heightInput * TO_METERS

    val imtFofmula = weightInput / meters.toDouble().pow(2)

    val result = when {
        imtFofmula < 18.5 -> "Underweight"
        imtFofmula < 25.0 -> "Normal body weight"
        imtFofmula < 30.0 -> "Excess body weight"
        imtFofmula >= 30.0 -> "Obesity"
        else -> "You are not human!"
    }

    val imtFormulaF = String.format("%.02f", imtFofmula)
    println("\nYour IMT is: ${imtFormulaF}; it's ${result}!")
}