package org.example.again_lesson_3

fun main() {
    val firstNumber = 9
    var secondNumber = 0

    println(
        """$firstNumber * ${(++secondNumber).toString().padStart(2)} = ${
            (firstNumber * secondNumber).toString().padStart(2)
        }
              |$firstNumber * ${(++secondNumber).toString().padStart(2)} = ${
            (firstNumber * secondNumber).toString().padStart(2)
        }
              |$firstNumber * ${(++secondNumber).toString().padStart(2)} = ${
            (firstNumber * secondNumber).toString().padStart(2)
        }
              |$firstNumber * ${(++secondNumber).toString().padStart(2)} = ${
            (firstNumber * secondNumber).toString().padStart(2)
        }
              |$firstNumber * ${(++secondNumber).toString().padStart(2)} = ${
            (firstNumber * secondNumber).toString().padStart(2)
        }
              |$firstNumber * ${(++secondNumber).toString().padStart(2)} = ${
            (firstNumber * secondNumber).toString().padStart(2)
        }
              |$firstNumber * ${(++secondNumber).toString().padStart(2)} = ${
            (firstNumber * secondNumber).toString().padStart(2)
        }
              |$firstNumber * ${(++secondNumber).toString().padStart(2)} = ${
            (firstNumber * secondNumber).toString().padStart(2)
        }
              |$firstNumber * ${(++secondNumber).toString().padStart(2)} = ${
            (firstNumber * secondNumber).toString().padStart(2)
        }
              |$firstNumber * ${(++secondNumber).toString().padStart(2)} = ${
            (firstNumber * secondNumber).toString().padStart(2)
        }""".trimMargin()
    )
}