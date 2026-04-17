package org.example.again_lesson_4

const val SUNNY_WEATHER: Boolean = true
const val OPENED_TENT: Boolean = true
const val FAVORABLE_HUMIDITY: Int = 20
const val WINTER: String = "Winter"
const val RESULT_QUESTION = "Are the conditions now favorable for growing legumes?"

fun main() {

    val isSunnyToday: Boolean = true
    val isNowTentOpened: Boolean = true
    val presentHumidity: Int = 20
    val currentSeason: String = "Winter"

    val result = isSunnyToday == SUNNY_WEATHER && isNowTentOpened == OPENED_TENT
            && presentHumidity == FAVORABLE_HUMIDITY && currentSeason != WINTER

    println("$RESULT_QUESTION $result")
}