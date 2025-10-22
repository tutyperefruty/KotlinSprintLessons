package org.example.lesson_2

fun main() {

    val clockHours = 9
    val clockMinutes = 39
    val travelMinutes = 457

    val clockHoursToMinutesPlusClockMinutes = clockHours * STD_MIN_SEC + clockMinutes
    val totalOnClockByMinsOnArrive = clockHoursToMinutesPlusClockMinutes + travelMinutes
    val totalHoursOnArrive = totalOnClockByMinsOnArrive / STD_MIN_SEC
    val totalMinsOnArrive = totalOnClockByMinsOnArrive % STD_MIN_SEC

    val time = String.format("%02d:%02d", totalHoursOnArrive, totalMinsOnArrive)

    println("Time on arrive: $time")
}

const val STD_MIN_SEC = 60