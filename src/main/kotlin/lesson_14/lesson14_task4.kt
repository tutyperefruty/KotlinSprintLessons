package org.example.lesson_14

open class Celestial(val name: String, val hasAtmosphere: Boolean, val suitableForLanding: Boolean)

class Planet(
    name: String,
    hasAtmosphere: Boolean = false,
    suitableForLanding: Boolean = false,
    val satellitesList: MutableList<Satellite> = mutableListOf(),
) : Celestial(name, hasAtmosphere, suitableForLanding) {
    fun addSatelliteWith(name: String, hasAtmosphere: Boolean, suitableForLanding: Boolean) =
        satellitesList.add(Satellite(name, hasAtmosphere, suitableForLanding))

    fun addSatelliteDefault() = satellitesList.add(Satellite())
}

class Satellite(
    name: String = "Satel",
    hasAtmosphere: Boolean = false,
    suitableForLanding: Boolean = true,
) : Celestial(name, hasAtmosphere, suitableForLanding)

fun main() {

    val rosePlanet: Planet = Planet("ROSA")
        .apply {
            addSatelliteWith("MIR", true, true)
            addSatelliteDefault()
        }.also { println("Planet ${it.name} with Satellites:") }

    rosePlanet.satellitesList.forEachIndexed { index, satel ->
        println("${index+1}: ${satel.name}, has atmosphere - ${satel.hasAtmosphere}, " +
                "suitable for landing - ${satel.suitableForLanding}")
    }
}