package org.example.again_lesson_10

const val DICE_MIN_VALUE = 1
const val DICE_MAX_VALUE = 6

fun main() {
    var humanWins = 0

    while (true) {
        if (playRound()) humanWins++

        if (askForPlayAgain()) continue
        else displayStatsBeforeEnd(humanWins).also { return }
    }
}

private fun askForPlayAgain(): Boolean {
    println("Хотите сыграть еще раунд? Введите Да или Нет")
    return (readln().equals("да", ignoreCase = true))
}

private fun displayStatsBeforeEnd(humanWins: Int) =
    println("Финиш\nОбщее количество побед человечества: $humanWins")

private fun playRound(): Boolean {
    val humanRollDice = rollDice()
    val computerRollDice = rollDice()
    displayRoundProgress(humanRollDice, computerRollDice)

    return displayRoundResult(determineWinner(humanRollDice, computerRollDice))
}

private fun displayRoundProgress(playerRollDice: Int, computerRollDice: Int) {
    println(
        "Человек кидает кости ->\nУ человека выпало: $playerRollDice\n" +
                "Машина кидает кости ->\nУ машины выпало: $computerRollDice"
    )
}

private fun determineWinner(playerRollDice: Int, computerRollDice: Int): Boolean? =
    when {
        playerRollDice > computerRollDice -> true
        playerRollDice < computerRollDice -> false
        else -> null
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