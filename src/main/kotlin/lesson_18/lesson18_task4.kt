package org.example.lesson_18

const val DOUBLE = 2

abstract class Box(
    private val length: Int,
    private val width: Int,
    private val height: Int,
) {
    fun calculateSidesArea(): Int = DOUBLE * (length * width + length * height + height * width)
}

open class RectangleBox(
    length: Int,
    width: Int,
    height: Int,
) : Box(length, width, height)

class Cube(
    cubeLength: Int,
) : RectangleBox(length = cubeLength, width = cubeLength, height = cubeLength)

fun main() {
    val boxList: List<Box> = listOf(
        RectangleBox(2, 3, 4),
        Cube(3),
        RectangleBox(1, 4, 5),
    )
    boxList.forEach { println(it.calculateSidesArea()) }
}