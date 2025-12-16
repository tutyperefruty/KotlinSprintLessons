package org.example.lesson_18

abstract class Box {
    abstract fun calculateSidesArea(): Int
}

class RectangleBox(
    private val length: Int,
    val width: Int,
    val height: Int,
) : Box() {
    override fun calculateSidesArea(): Int = 2 * (length * width + length * height + height * width)
}

class Cube(
    private val length: Int,
) : Box() {
    override fun calculateSidesArea(): Int = 6 * length * length
}

fun main() {
    val boxList: List<Box> = listOf(
        RectangleBox(2, 3, 4),
        Cube(3),
        RectangleBox(1, 4, 5),
    )
        .also { boxes -> boxes.forEach { box -> println(box.calculateSidesArea()) } }
}