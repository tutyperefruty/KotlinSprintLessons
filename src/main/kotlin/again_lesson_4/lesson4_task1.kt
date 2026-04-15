package org.example.again_lesson_4

const val TABLES = 13

fun main() {
    val todayTables = 13
    val tomorrowTables = 9

    val isTableAvailable: (Int) -> Boolean = { bookedTables -> bookedTables < TABLES }

    println(
        "Table availability on today: ${isTableAvailable(todayTables)}\n" +
                "Table availability on tomorrow: ${isTableAvailable(tomorrowTables)}"
    )
}