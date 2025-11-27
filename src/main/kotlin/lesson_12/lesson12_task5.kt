package org.example.lesson_12

import kotlin.random.Random

//Опираясь на мск стат.данные за последние года (диапазоны в ноябре месяце, неофиц.источник)
const val START_NUM = 1
const val CICLE = 30
const val DAY_MIN_T = -10
const val DAY_MAX_T = 8
const val NIGHT_MIN_T = -15
const val NIGHT_MAX_T = 3
const val PROBABILITY_MIN: Double = 0.5
const val PROBABILITY_MAX: Double = 0.67


class OneDayWeather {

    val dayTemper = (DAY_MIN_T..DAY_MAX_T).random()
    val nightTemper = (NIGHT_MIN_T..NIGHT_MAX_T).random()
    val precipitation: Boolean = (Random.nextDouble() <= Random.nextDouble(PROBABILITY_MIN, PROBABILITY_MAX))
}

fun main() {

    val weatherListForMonth: MutableList<OneDayWeather> = mutableListOf()

    for (everyOneDay in START_NUM..CICLE) {
        val oneDay: OneDayWeather = OneDayWeather()
        weatherListForMonth.add(oneDay)
    }

    val averageOfDayT = weatherListForMonth.map { it.dayTemper }.average().toInt()
    val averageOfNightT = weatherListForMonth.map { it.nightTemper }.average().toInt()
    val countDaysWithPrecipitation = weatherListForMonth.filter { it.precipitation == true }.size

    printResult(averageOfDayT, averageOfNightT, countDaysWithPrecipitation)

}

fun printResult(averageOfDayT: Int, averageOfNightT: Int, countDaysWithPrecipitation: Int) {
    println("Average Temperature in Msk in november: for day is ${averageOfDayT}°C, for night is ${averageOfNightT}°C")
    println("And total days with precipitation is ${countDaysWithPrecipitation}")
}