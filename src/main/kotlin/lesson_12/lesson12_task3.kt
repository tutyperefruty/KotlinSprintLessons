package org.example.lesson_12

class OneDayWeather(_dayTemper: Int, _nightTemper: Int, _precipitation: Boolean) {

    var dayTemper = (_dayTemper - 273.15).toInt()
    var nightTemper = (_nightTemper - 273.15).toInt()
    var precipitation = _precipitation

    fun printByOneKelvinToCelsius() {
        return println("Day temperature is: ${dayTemper}°C, Night temperature is: ${nightTemper}°C, Precipitation is: ${if (precipitation) "Yes" else "No"}")
    }

}

fun main() {

    val day1: OneDayWeather = OneDayWeather(300, 280, false)

    day1.printByOneKelvinToCelsius()
}