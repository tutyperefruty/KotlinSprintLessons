package org.example.lesson_18

const val FROM = 1

abstract class Dice {
    abstract val sides: Int
    open fun rollDice() = println("${(FROM..sides).random()}")
}

class Dice4 : Dice() {
    override val sides: Int = 4
}

class Dice6 : Dice() {
    override val sides: Int = 6
}

class Dice8 : Dice() {
    override val sides: Int = 8
}

fun main() {
    val dice4: Dice = Dice4()
    val dice6: Dice = Dice6()
    val dice8: Dice = Dice8()

    val dices: Array<Dice> = arrayOf(dice4, dice6, dice8)
    dices.forEach {
        it.rollDice()
    }
}