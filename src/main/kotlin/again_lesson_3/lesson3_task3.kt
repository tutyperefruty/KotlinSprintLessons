package org.example.again_lesson_3

const val PADDING = 2

fun main() {
    val firstNumber = 9
    var secondNumber = 0

    println(
        """${firstNumber multiplicateAndDisplayWithPadTwo ++secondNumber}
              |${firstNumber multiplicateAndDisplayWithPadTwo ++secondNumber}
              |${firstNumber multiplicateAndDisplayWithPadTwo ++secondNumber}
              |${firstNumber multiplicateAndDisplayWithPadTwo ++secondNumber}
              |${firstNumber multiplicateAndDisplayWithPadTwo ++secondNumber}
              |${firstNumber multiplicateAndDisplayWithPadTwo ++secondNumber}
              |${firstNumber multiplicateAndDisplayWithPadTwo ++secondNumber}
              |${firstNumber multiplicateAndDisplayWithPadTwo ++secondNumber}
              |${firstNumber multiplicateAndDisplayWithPadTwo ++secondNumber}""".trimMargin()
    )
}

infix fun Int.multiplicateAndDisplayWithPadTwo(secondNumber: Int) =
    "$this * $secondNumber = ${(this * secondNumber).toString().padStart(PADDING)}"