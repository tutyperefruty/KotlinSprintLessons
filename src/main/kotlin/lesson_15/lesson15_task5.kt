package org.example.lesson_15

interface Transportable {

    fun move() = println("${this::class.simpleName} moves")
    fun moveBack() = println("${this::class.simpleName} returns")
}

interface PassengerTransport : Transportable {

    fun loadPassengers(value: Int? = null) {println("$value Passenger(s) was loaded to ${this::class.simpleName}")}
    fun unloadPassengers(value: Int? = null) = println("$value Passenger(s) was unloaded to ${this::class.simpleName}")
}

interface CargoTransport : Transportable {

    fun loadCargo(value: Int? = null) = println("$value ton(s) was loaded to ${this::class.simpleName}")
    fun unloadCargo(value: Int? = null) = println("$value ton(s) was unloaded to ${this::class.simpleName}")
}

class Truck : PassengerTransport, CargoTransport

class Car : PassengerTransport

fun main() {

    val truck01: Truck = Truck()
    val car01: Car = Car()

    truck01.apply {
        loadCargo(3)
        loadPassengers(1)
        move()
        unloadPassengers(1)
        unloadCargo(3)
    }
    car01.apply {
        loadPassengers(3)
        move()
        unloadPassengers(3)
        moveBack()
        loadPassengers(2)
        move()
        unloadPassengers(2)
    }
}