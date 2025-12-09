package org.example.lesson_15

interface Movable {
    val name: String
    fun startsMove() {
        println("$name starts move.")
    }
}

interface PassengerTransportable {
    val name: String
    val passengers: Int

    fun transportsPassenger() {
        println("$name transports $passengers passenger(s).")
    }
}

interface CargoTransportable {
    val name: String
    val passengers: Int
    val cargo: Int

    fun transportsPassenger() {
        println("$name transports $passengers passenger(s).")
    }

    fun transportsCargo() {
        println("$name transports cargo in the amount of $cargo ton(s)")
    }
}

class PassengerCar(override val name: String = "PassengerCar", override val passengers: Int = 3) : Movable,
    PassengerTransportable

class Truck(override val name: String = "Truck", override val passengers: Int = 1, override val cargo: Int = 2) :
    Movable,
    CargoTransportable

fun main() {

    val truck1 = Truck()
    val car1 = PassengerCar()
    truck1.apply {
        startsMove()
        transportsPassenger()
        transportsCargo()
    }
    car1.apply {
        startsMove()
        transportsPassenger()
    }
    val car2 = PassengerCar("PassengerCar-02", 2)
    car2.apply {
        startsMove()
        transportsPassenger()
    }

}