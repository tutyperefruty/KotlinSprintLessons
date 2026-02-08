package org.example.lesson_15

interface Transportable {

    fun move() = println("${this::class.simpleName} moves")
    fun moveBack() = println("${this::class.simpleName} returns")
}

interface PassengerTransport : Transportable {

    val maxPassengers: Int
    var currentPassengers: Int
    var movedPassengers: Int
    fun loadPassengers(value: Int = maxPassengers) {
        currentPassengers = (currentPassengers + value).coerceAtMost(maxPassengers)
        println("$currentPassengers Passenger(s) was loaded to ${this::class.simpleName}")
    }

    fun unloadPassengers(value: Int = currentPassengers) {
        println("${value} Passenger(s) was unloaded from ${this::class.simpleName}")
        currentPassengers = (currentPassengers - value).coerceAtLeast(0)
        movedPassengers += value
    }

    fun getTotalMovedPassengers(): Int {
        return movedPassengers
    }

}

interface CargoTransport : Transportable {

    val maxCargo: Int
    var currentCargo: Int
    fun loadCargo(value: Int = maxCargo) {
        currentCargo = (currentCargo + value).coerceAtMost(maxCargo)
        println("$value ton(s) was loaded to ${this::class.simpleName}")
    }

    fun unloadCargo(value: Int = currentCargo) {
        currentCargo = (currentCargo - value).coerceAtLeast(0)
        println("${value} ton(s) was unloaded from ${this::class.simpleName}")
    }
}

class Truck(
    override var currentPassengers: Int = 0,
    override val maxPassengers: Int = 1,
    override var currentCargo: Int = 0,
    override val maxCargo: Int = 2,
    override var movedPassengers: Int = 0,
) : PassengerTransport, CargoTransport

class Car(
    override var currentPassengers: Int = 0,
    override val maxPassengers: Int = 3,
    override var movedPassengers: Int = 0,
) : PassengerTransport

fun main() {

    val truck01: Truck = Truck()
    val car01: Car = Car()

    truck01.apply {
        loadCargo()
        loadPassengers()
        move()
        unloadPassengers()
        unloadCargo()
    }
    car01.apply {
        loadPassengers()
        move()
        unloadPassengers()
        moveBack()
        loadPassengers(2)
        move()
        unloadPassengers()
    }

    println("Total passengers moved: ${truck01.getTotalMovedPassengers() + car01.getTotalMovedPassengers()}")
}