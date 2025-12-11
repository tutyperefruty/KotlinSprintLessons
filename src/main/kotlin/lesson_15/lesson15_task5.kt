package org.example.lesson_15

interface Transportable {

    fun move() = println("${this::class.simpleName} moves")
    fun moveBack() = println("${this::class.simpleName} returns")
}

interface PassengerTransport : Transportable {

    val maxPassengers: Int
    var currentPassengers: Int
    fun loadPassengers(value: Int? = maxPassengers) {
        currentPassengers = (currentPassengers + value!!).coerceAtMost(value)
        println("$currentPassengers Passenger(s) was loaded to ${this::class.simpleName}")
    }

    fun unloadPassengers(value: Int? = maxPassengers) {
        currentPassengers = (currentPassengers + value!!).coerceAtMost(value)
        println("$currentPassengers Passenger(s) was unloaded to ${this::class.simpleName}")
    }
}

interface CargoTransport : Transportable {

    val maxCargo: Int
    var currentCargo: Int
    fun loadCargo(value: Int? = maxCargo) {
        currentCargo = (currentCargo + value!!).coerceAtMost(value)
        println("$currentCargo ton(s) was loaded to ${this::class.simpleName}")
    }

    fun unloadCargo(value: Int? = maxCargo) {
        currentCargo = (currentCargo + value!!).coerceAtMost(value)
        println("$currentCargo ton(s) was unloaded to ${this::class.simpleName}")
    }
}

class Truck(
    override var currentPassengers: Int = 0, override val maxPassengers: Int = 1,
    override var currentCargo: Int = 0, override val maxCargo: Int = 2
) : PassengerTransport, CargoTransport

class Car(override var currentPassengers: Int = 0, override val maxPassengers: Int = 3) : PassengerTransport

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
        unloadPassengers(2)
    }
}