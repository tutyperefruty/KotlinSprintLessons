package org.example.lesson_1

fun main() {
    val flightTotalSecs = 6480
    val mountForMinOrSec = 60

    val flightTotalMinutes = flightTotalSecs/mountForMinOrSec
    val ostatokMinutes = flightTotalMinutes % mountForMinOrSec
    val flightTotalHours = (flightTotalMinutes-ostatokMinutes)/mountForMinOrSec
    val ostatokSeconds = flightTotalSecs % mountForMinOrSec

    val time = String.format("%02d:%02d:%02d", flightTotalHours, ostatokMinutes, ostatokSeconds)
    println("\nGagarin\'s time in cosmos is $time")
}