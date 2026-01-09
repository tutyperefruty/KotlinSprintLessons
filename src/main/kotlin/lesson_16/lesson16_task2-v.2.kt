package org.example.lesson_16

class Circle(private val radius: Double) {

    private val Pi = 3.14

    fun circumference() = println("Circumference of Circle with radius ${radius} is ${"%.1f".format(2 * Pi * radius)}")

    fun area() = println("Area of Circle with radius ${radius} is ${"%.1f".format(Pi * Pi * radius)}")
}

fun main() {

    with(Circle(5.0)) {
        circumference()
        area()
    }
}