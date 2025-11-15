package org.example.lesson_4

const val WEATHER: String = "sun"
const val IS_TENT_OPENED: Boolean = true
const val HUMIDITY: Int = 20
const val IS_FOR_WINTER_SEASON: Boolean = false

fun main() {

    val ask = "Are the conditions now favorable for growing legumes?"
    val nowWeather: String = "sun"
    val nowIsTentOpened: Boolean = true
    val nowHumidity: Int = 20
    val nowWinter: Boolean = true

    val result = (nowWeather == WEATHER) && (nowIsTentOpened == IS_TENT_OPENED) && (nowHumidity == HUMIDITY) && (nowWinter == IS_FOR_WINTER_SEASON)

    println("$ask\n$result")

}