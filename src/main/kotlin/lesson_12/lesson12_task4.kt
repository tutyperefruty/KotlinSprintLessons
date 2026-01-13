package org.example.lesson_12

class OneDayWeather(_dayTemper: Int, _nightTemper: Int, _precipitation: Boolean) {

    var dayTemper = (_dayTemper - 273.15).toInt()
    var nightTemper = (_nightTemper - 273.15).toInt()
    var precipitation = _precipitation

    init {
        println("Day temperature is: ${dayTemper}°C, Night temperature is: ${nightTemper}°C, Precipitation is: ${if (precipitation) "Yes" else "No"}")

    }

}

fun main() {

    val day1: OneDayWeather = OneDayWeather(300, 280, true)
    val day2: OneDayWeather = OneDayWeather(300, 280, false)
}