package org.example.lesson_2

fun main() {

    val clockHours = 9
    val clockMinutes = 39
    val travelMinutes = 457

    val travelHours = travelMinutes/60
    val minutesRemain = travelMinutes % 60

    var totalHoursOnClock = clockHours+travelHours
    var totalMinutesOnClock = clockMinutes+minutesRemain
    val ostatokMinut = totalMinutesOnClock % 60
    val previsheniye = clockMinutes + minutesRemain

    if (ostatokMinut > 0 && previsheniye >= 60) totalHoursOnClock +=1
    if (previsheniye >= 60) totalMinutesOnClock -=60

    val time = String.format("%02d:%02d", totalHoursOnClock, totalMinutesOnClock)

    println("Time on arrive: $time")
}