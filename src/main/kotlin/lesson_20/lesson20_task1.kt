package org.example.lesson_20

fun main() {
    val newYearCongratulation: (String) -> String = { somebody -> "Happy New Year, $somebody!" }
    println(newYearCongratulation("username"))
}