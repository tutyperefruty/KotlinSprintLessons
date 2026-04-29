package org.example.again_lesson_10

const val MIN_VAL = 1
const val MAX_VAL = 6

fun main() {

    println("Плейер бросает кости")
    val playerRollsDice = rollsDice()
    println("У плейера выпало: $playerRollsDice")

    println("Компьютер бросает кости")
    val computerRollsDice = rollsDice()
    println("У компьютера выпало: $computerRollsDice")

    val result = when {
        playerRollsDice > computerRollsDice -> "Победило человечество"
        playerRollsDice < computerRollsDice -> "Победила машина"
        playerRollsDice == computerRollsDice -> "Победила дружба"
        else -> "SMTH wrong"
    }
    println(result)
}

fun rollsDice() = (MIN_VAL..MAX_VAL).random()