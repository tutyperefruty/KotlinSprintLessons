package org.example.lesson_15

const val NAME = "01"
const val CURRENT = 0
const val MAX_PASS_TRUCK = 1
const val MAX_CARGO_TRUCK = 2
const val MAX_PASS_CAR = 3

interface Transportable {
    fun move()
    fun moveBack()
}

interface PassengerTransport : Transportable {
    fun loadPassengers(value: Int? = null)
    fun unloadPassengers()
}

interface CargoTransport : Transportable {
    fun loadCargo(value: Int? = null)
    fun unloadCargo()
}

class Truck(
    private val name: String = NAME,
    private var currentPassengers: Int = CURRENT,
    private var currentCargo: Int = CURRENT
) : PassengerTransport, CargoTransport {

    private var maxPassengers = MAX_PASS_TRUCK
    private var maxCargo = MAX_CARGO_TRUCK

    override fun move() = println("Truck-$name moves")

    override fun moveBack() = println("Truck-$name returns back")

    override fun loadPassengers(value: Int?) {
        if (value != null) {
            this.maxPassengers = value
        }
        while (currentPassengers < maxPassengers) {
            currentPassengers++
            println("1 Passenger was loaded to truck-$name")
        }
    }

    override fun unloadPassengers() {
        while (currentPassengers > CURRENT) {
            currentPassengers--
            println("1 Passenger was unloaded from truck-$name")
        }
    }

    override fun loadCargo(value: Int?) {
        if (value != null) {
            this.maxCargo = value
        }
        while (currentCargo < maxCargo) {
            currentCargo++
            println("Loaded 1 ton to truck-$name")
        }
    }

    override fun unloadCargo() {
        while (currentCargo > CURRENT) {
            currentCargo--
            println("Unloaded 1 ton from truck-$name")
        }
    }
}

class Car(private val name: String = NAME, private var currentPassengers: Int = CURRENT) : PassengerTransport {

    private var maxPassengers = MAX_PASS_CAR

    override fun move() = println("Car-$name moves")

    override fun moveBack() = println("Car-$name returns")

    override fun loadPassengers(value: Int?) {
        if (value != null) {
            this.maxPassengers = value
        }
        while (currentPassengers < maxPassengers) {
            currentPassengers++
            println("1 Passenger was loaded to Car-$name")
        }
    }

    override fun unloadPassengers() {
        while (currentPassengers > CURRENT) {
            currentPassengers--
            println("1 Passenger was unloaded from car-$name")
        }
    }
}

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
}