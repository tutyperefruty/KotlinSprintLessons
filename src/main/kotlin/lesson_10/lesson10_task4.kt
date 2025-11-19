package org.example.lesson_10

const val MIN_VAL = 1
const val MAX_VAL = 6

fun main() {
    var wins = 0
    var round = 2
    val playerRollsDice = rollsDice()
    val compRollsDice = rollsDice()
    while (true) {
        playRound(playerRollsDice, compRollsDice)

        when {
            playerRollsDice > compRollsDice -> {
                println("Player wins")
                wins++
            }
            playerRollsDice < compRollsDice -> println("Computer wins")
            playerRollsDice == compRollsDice -> println("Friendship wins")
            else -> println("SMTH wrong")
        }
        println("What to play one more round?")
        val answer = readln()
        if (answer.equals("yes", ignoreCase = true)) {
            println("Round: ${round++}")
            true
        } else if (answer.equals("no", ignoreCase = true)) {
            println("Finish")
            println(
                "Player total wins: ${wins}"
            )
            return
        } else {
            println("SMTH wrong")
            return
        }
    }
}

fun playRound(playerRollsDice: Int,compRollsDice: Int) {

    println("The Player rolls the dice")
    println("The Player rolls a ${playerRollsDice} on the dice")
    println("The Computer rolls the dice")
    println("The Computer rolls a ${compRollsDice} on the dice")

}

fun rollsDice(): Int = (MIN_VAL..MAX_VAL).random()