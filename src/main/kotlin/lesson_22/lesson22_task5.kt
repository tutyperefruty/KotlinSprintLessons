package org.example.lesson_22

import java.time.LocalDateTime

data class GalacticGuide(
    val location: String,
    val description: String,
    val eventDateTime: LocalDateTime,
    val distanceFromEarth: Double
)

fun main() {
    val guideList: MutableList<GalacticGuide> = mutableListOf()
    val alphaCentauri = GalacticGuide(
        location = "The constellations of Centaurus",
        description = "A new object will be detected closer to the Rigel",
        eventDateTime = LocalDateTime.of(2032, 10, 7, 19, 7),
        distanceFromEarth = 4.36
    )
    guideList.add(alphaCentauri)

    //    Только для Альфа Центавра
    val place = alphaCentauri.component1()
    val withDescription = alphaCentauri.component2()
    val inDate = alphaCentauri.component3()
    val showPlaceInfo: () -> Unit = {
        println("Here's $place where $withDescription in ${inDate.year}")
    }
    showPlaceInfo()

    //    Для всех в списке
    val showPlaceDistanceInfoIn: (List<GalacticGuide>) -> Unit = {
        for ((_, _, _, distance) in guideList) {
            print("$place: Distance from Earth is $distance. ")
            if (distance > 1) println("It's rather far from Earth") else println("It's close to Earth")
        }
    }
    showPlaceDistanceInfoIn(guideList)
}