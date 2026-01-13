package org.example.lesson_14

open class LinerTypeVessel(
    val name: String = "Liner",
    val speed: Int = 40,
    val passengerCap: Int = 120,
    val cargoCap: Int = 1000,
) {
    open fun setupLoading() {
        println("${name}: Extends the loading ramp from shavot")
    }
}

class CargoType(
    name: String,
    speed: Int,
    passengerCap: Int,
    cargoCap: Int,
) : LinerTypeVessel(name, speed, passengerCap, cargoCap) {
    override fun setupLoading() {
        println("${name}: Activates the loading crane")
    }
}

class IceBreakerType(
    name: String,
    speed: Int,
    passengerCap: Int,
    cargoCap: Int,
    val iceBreakCap: Boolean = true,
) : LinerTypeVessel(name, speed, passengerCap, cargoCap) {
    override fun setupLoading() {
        println("${name}: Opens the gate on the stern")
    }
}

fun main() {

    val liner1: LinerTypeVessel = LinerTypeVessel("Liner-01")
    val cargo1: LinerTypeVessel = CargoType("Cargo-01", 20, 30, 3000)
    val iceBreaker1: LinerTypeVessel = IceBreakerType("Cargo-01", 15, 30, 700)

    liner1.setupLoading()
    cargo1.setupLoading()
    iceBreaker1.setupLoading()

}