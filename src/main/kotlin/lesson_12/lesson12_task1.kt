package org.example.lesson_12

class OneDayWeather {
    var dayTemper: Int = 10
    var nightTemper: Int = 5
    var precipitation: Boolean = false

    fun printByOne() {
        return println("Day temperature is: ${dayTemper}°C, Night temperature is: ${nightTemper}°C, Precipitation is: ${if (precipitation) "Yes" else "No"}")
    }

}

fun main() {

    val day1: OneDayWeather = OneDayWeather()
    day1.dayTemper = 20
    day1.nightTemper = 15
    val day2: OneDayWeather = OneDayWeather()
    day2.dayTemper = 30
    day2.nightTemper = 25
    day2.precipitation = true

    println("${day1.printByOne()}\n${day2.printByOne()}")

}