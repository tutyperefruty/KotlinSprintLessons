package org.example.lesson_14

open class LinerType(
    val name: String = "Liner",
    val speed: Int = 40,
    val passengerCap: Int = 120,
    val cargoCap: Int = 1000,
)

class CargoVessel(
    name: String,
    speed: Int,
    passengerCap: Int,
    cargoCap: Int,
) : LinerType(name, speed, passengerCap, cargoCap)

class IceBreaker(
    name: String,
    speed: Int,
    passengerCap: Int,
    cargoCap: Int,
    val iceBreakCap: Boolean = true,
) : LinerType(name, speed, passengerCap, cargoCap)

fun main() {

    val liner1: LinerType = LinerType("Liner-01")
    val cargo1: LinerType = CargoVessel("Cargo-01", 20, 30, 3000)
    val iceBreaker1: LinerType = IceBreaker("Cargo-01", 15, 30, 700)

}