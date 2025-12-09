package org.example.lesson_16

const val FROM = 1
const val TO = 6

class Dice {

    private val sideValue: Int = (FROM..TO).random()

    fun showNumber() {
        println("Your number is $sideValue, Congratulations!")
    }
}

fun main() {

    val dice = Dice()

    dice.showNumber()
}