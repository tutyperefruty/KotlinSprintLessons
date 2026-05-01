package org.example.again_lesson_10

const val DICE_MIN_VALUE = 1
const val DICE_MAX_VALUE = 6

fun main() {
    var humanWins = 0

    while (true) {
        if (playRound(playerRollDice = rollDice(), computerRollDice = rollDice())) humanWins++
        if (askForPlayAgain(humanWins)) continue else return
    }
}

private fun askForPlayAgain(humanWins: Int): Boolean {
    println("Хотите сыграть еще раунд? Введите Да или Нет")
    val answer = readln()
    if (answer.equals("да", ignoreCase = true)) return true
    else if (answer.equals("нет", ignoreCase = true)) displayStatsBeforeEnd(humanWins).also { return false }
    else displayStatsBeforeEnd(humanWins)
    return false
}

private fun displayStatsBeforeEnd(humanWins: Int) = println("Финиш\nОбщее количество побед человечества: $humanWins")

private fun playRound(playerRollDice: Int, computerRollDice: Int): Boolean {

    displayRoundProgress(playerRollDice, computerRollDice)

    return displayRoundResult(determineWinner(playerRollDice, computerRollDice))
}

private fun displayRoundProgress(playerRollDice: Int, computerRollDice: Int) {
    println(
        "Человек кидает кости ->\nУ человека выпало: $playerRollDice\n" +
                "Машина кидает кости ->\nУ машины выпало: $computerRollDice"
    )
}

private fun determineWinner(playerRollDice: Int, computerRollDice: Int): Boolean? {
    return when {
        playerRollDice > computerRollDice -> true
        playerRollDice < computerRollDice -> false
        else -> null
    }
}

private fun displayRoundResult(result: Boolean?): Boolean {
    when (result) {
        true -> println("Побеждает человечество").also { return true }
        false -> println("Машина победила")
        else -> println("Победила дружба")
    }
    return false
}

private fun rollDice(): Int = (DICE_MIN_VALUE..DICE_MAX_VALUE).random()