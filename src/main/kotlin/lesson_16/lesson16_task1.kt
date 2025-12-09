package org.example.lesson_16

import kotlin.random.Random

class Dice {

    private val sideValue: Int = Random.nextInt(1, 7)

    fun showNumber() {
        println("Your number is $sideValue, Congratulations!")
    }
}

fun main() {

    val dice = Dice()

    dice.showNumber()
}