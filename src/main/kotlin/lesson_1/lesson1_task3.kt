package org.example.lesson_1

fun main() {
    val heroName = "Yuri Gagarin"
    val yearOfFlight = "1961"
    var takeOffHour = "09"
    var takeOffMinute = "07"

    println("$heroName\'s flight time: $takeOffHour hours, and")
    println("$takeOffMinute minutes")

    val landingHour = takeOffHour
    takeOffHour = "10"
    val landingMinute = takeOffMinute
    takeOffMinute = "55"

    print("Landing time: $landingHour:$landingMinute")
}