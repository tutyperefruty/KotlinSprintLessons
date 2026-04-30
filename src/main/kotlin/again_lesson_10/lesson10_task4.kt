package org.example.again_lesson_10

const val DICE_MIN_VALUE = 1
const val DICE_MAX_VALUE = 6

fun main() {
    var humanWins = 0

    while (true) {
        val roundResult = playRound(playerRollDice = rollDice(), computerRollDice = rollDice())

        when (roundResult) {
            true -> println("Побеждает человечество").also { humanWins++ }
            false -> println("Машина победила")
            else -> println("Победила дружба")
        }

        println("Хотите сыграть еще раунд? Введите Да или Нет")
        val answer = readln()
        if (answer.equals("да", ignoreCase = true)) continue
        else if (answer.equals("нет", ignoreCase = true))
            println("Финиш\nОбщее количество побед человечества: $humanWins").also { return }
        else return
    }
}

private fun playRound(playerRollDice: Int, computerRollDice: Int): Boolean? {

    println(
        "Человек кидает кости ->\nУ человека выпало: $playerRollDice\n" +
                "Машина кидает кости ->\nУ машины выпало: $computerRollDice"
    )

    return when {
        playerRollDice > computerRollDice -> true
        playerRollDice < computerRollDice -> false
        else -> null
    }
}

private fun rollDice(): Int = (DICE_MIN_VALUE..DICE_MAX_VALUE).random()