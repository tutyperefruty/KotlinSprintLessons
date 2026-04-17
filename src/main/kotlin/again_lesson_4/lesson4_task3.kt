package org.example.again_lesson_4

const val WEATHER: String = "sun"
const val IS_FOR_OPENED_TENT: Boolean = true
const val HUMIDITY: Int = 20
const val IS_FOR_WINTER_SEASON: Boolean = false
const val RESULT_QUESTION = "Are the conditions now favorable for growing legumes?"

fun main() {

    val todayWeather: String = "sun"
    val isNowTentOpened: Boolean = true
    val presentHumidity: Int = 20
    val isNowWinter: Boolean = true

    val result = (todayWeather == WEATHER) && (isNowTentOpened == IS_FOR_OPENED_TENT)
            && (presentHumidity == HUMIDITY) && (isNowWinter == IS_FOR_WINTER_SEASON)

    println("$RESULT_QUESTION $result")
}