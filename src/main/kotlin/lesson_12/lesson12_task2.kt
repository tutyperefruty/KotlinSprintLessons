package org.example.lesson_12

class OneDayWeather(
    var dayTemper: Int = 10,
    var nightTemper: Int = 5,
    var precipitation: Boolean = false,
) {
    fun printByOne() {
        return println("Day temperature is: ${dayTemper}°C, Night temperature is: ${nightTemper}°C, Precipitation is: ${if (precipitation) "Yes" else "No"}")
    }

}

fun main() {

    val day1: OneDayWeather = OneDayWeather(35, 29, true)

    day1.printByOne()
}