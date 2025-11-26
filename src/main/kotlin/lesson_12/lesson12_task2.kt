package org.example.lesson_12

class OneDayWeather(
    var dayTemper: Int,
    var nightTemper: Int,
    var precipitation: Boolean,
) {
    fun printByOne() {
        return println("Day temperature is: ${dayTemper}°C, Night temperature is: ${nightTemper}°C, Precipitation is: ${if (precipitation) "Yes" else "No"}")
    }

}

fun main() {

    val day1: OneDayWeather = OneDayWeather(35, 29, true)

    day1.printByOne()
}