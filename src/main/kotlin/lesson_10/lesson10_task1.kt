package org.example.lesson_10

const val MIN_VAL = 1
const val MAX_VAL = 6

fun main() {

    println("The Player rolls the dice")
    val playerRollsDice = rollsDice()
    println("The Player rolls a ${playerRollsDice} on the dice")
    println("The Computer rolls the dice")
    val compRollsDice = rollsDice()
    println("The Computer rolls a ${compRollsDice} on the dice")

    val result = when {
        playerRollsDice > compRollsDice -> "Player wins"
        playerRollsDice < compRollsDice -> "Computer wins"
        playerRollsDice == compRollsDice -> "Friendship wins"
        else -> "SMTH wrong"
    }
    println(result)
}

fun rollsDice(): Int {
    val randomVal = (MIN_VAL..MAX_VAL).random()
    return randomVal
}