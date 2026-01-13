package org.example.lesson_4

const val TABLES = 13

fun main() {

    val todayTables = 13
    val tomorrowTables = 9

    val availableToday = TABLES != todayTables
    val availableTomorrow = TABLES != tomorrowTables

    println("[Table availability on today: $availableToday]\n[Table availability on tomorrow: $availableTomorrow]")

}