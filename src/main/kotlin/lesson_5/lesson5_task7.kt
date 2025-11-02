package org.example.lesson_5

const val DIV_BY_HUNDRED = 100

fun main() {

    println("Input trip range (kilometers): ")
    val range: Double = readln().toDouble()
    println("Input fuel consumption per 100 km (liters): ")
    val fuelConsump: Double = readln().toDouble()
    println("Input fuel present price: ")
    val fuelPrice: Double = readln().toDouble()

    val totalLiters = (range * fuelConsump) / DIV_BY_HUNDRED
    val totalCost = totalLiters * fuelPrice

    println(
        """Total amoun of fuel required: ${String.format("%.02f", totalLiters)} liters,
        |Total cost of the trip: ${String.format("%.02f", totalCost)} dollars.
    """.trimMargin()
    )

}