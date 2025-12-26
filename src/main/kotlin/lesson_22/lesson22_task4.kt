package org.example.lesson_22

import java.time.LocalDateTime

data class GalacticGuide(
    val location: String,
    val description: String,
    val eventDateTime: LocalDateTime,
    val distanceFromEarth: Double,
)

fun main() {
    val alphaCentauri = GalacticGuide(
        location = "The constellations of Centaurus",
        description = "A new object will be detected closer to the Rigel",
        eventDateTime = LocalDateTime.of(2032, 10, 7, 19, 7),
        distanceFromEarth = 4.36
    )
    val (location, description, eventDateTime, distanceFromEarth) = alphaCentauri

    println("Locsation: $location")
    println("Description: $description")
    println("Date and time: $eventDateTime")
    println("Distance from Earth: $distanceFromEarth ly")
}