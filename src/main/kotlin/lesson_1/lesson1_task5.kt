package org.example.lesson_1

fun main() {
//    01:48:00
    val flightTotalSecs = 6480
    val mountForMinOrSec = 60

    val flightTotalMinutes = flightTotalSecs/mountForMinOrSec
//    println(flightTotalMinutes)

    val ostatokMinutes = flightTotalMinutes % mountForMinOrSec
//    println(ostatokMinutes)

    val flightTotalHours = (flightTotalMinutes-ostatokMinutes)/mountForMinOrSec
//    println(flightTotalHours)

    val ostatokSeconds = flightTotalSecs % mountForMinOrSec
//    println(ostatokSeconds)

    println("\nGagarin\'s time in cosmos is 0$flightTotalHours:$ostatokMinutes:0$ostatokSeconds")
}