package org.example.lesson_18

const val FROM = 1

open class Dice {

    open fun rollDice() = ""

}

class Dice4 : Dice() {

    private val sides: Int = 4
    private val sideValue: Int = (FROM..sides).random()

    override fun rollDice() = "$sideValue"

}

class Dice6 : Dice() {

    private val sides: Int = 6
    private val sideValue: Int = (FROM..sides).random()

    override fun rollDice() = "$sideValue"

}

class Dice8 : Dice() {

    private val sides: Int = 8
    private val sideValue: Int = (FROM..sides).random()

    override fun rollDice() = "$sideValue"

}


fun main() {

    val dice4: Dice = Dice4()
    val dice6: Dice = Dice6()
    val dice8: Dice = Dice8()

    val sides: Array<Dice> = arrayOf(dice4, dice6, dice8)
    sides.forEach { side ->
        println(side.rollDice())
    }


}