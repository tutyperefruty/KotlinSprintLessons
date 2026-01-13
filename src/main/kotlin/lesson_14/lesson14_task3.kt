package org.example.lesson_14

import kotlin.math.PI

abstract class Figure(val name: String, val color: String) {
    abstract fun calculateArea(): Double
    abstract fun calculatePerimeter(): Double
}

class Rectangle(
    name: String,
    color: String,
    val sideA: Double,
    val sideB: Double,
) : Figure(name, color) {
    override fun calculateArea(): Double = sideA * sideB
    override fun calculatePerimeter(): Double = sideA * 2 + sideB * 2
}

class Circle(
    name: String,
    color: String,
    val radius: Int,
) : Figure(name, color) {
    override fun calculateArea(): Double = PI * (radius * radius)
    override fun calculatePerimeter(): Double = 2 * PI * radius
}

fun main() {

    val figuresList: MutableList<Figure> = mutableListOf()

    figuresList.apply {
        add(Rectangle("R-01", "White", 1.0, 3.0))
        add(Rectangle("R-02", "Black", 2.0, 4.0))
        add(Rectangle("R-03", "Black", 2.0, 1.0))
        add(Circle("C-01", "White", 2))
        add(Circle("C-02", "Black", 3))
        add(Circle("C-03", "White", 1))
    }
        .filter { it.color.lowercase() == "black" }
        .sumOf { it.calculatePerimeter() }.toBigDecimal().setScale(2, java.math.RoundingMode.HALF_UP)
        .also { println("\nTotal perimeter of Blacks: $it units") }

        .also {
            figuresList
                .filter { it.color.lowercase() == "white" }
                .sumOf { it.calculateArea() }.toBigDecimal().setScale(2, java.math.RoundingMode.HALF_UP)
                .also { println("Total аrea of Whites: $it units squared") }
        }

}