package org.example.lesson_18

const val SQUARE = "Square"
const val CIRCLE = "Circle"
const val POINT = "Point"
const val WAS_DRAWN_IN = "was drawn in coordinates"

class Screen {
    fun drawSquare(x: Int, y: Int) = "$SQUARE ${showInfo(x, y)}"
    fun drawSquare(x: Float, y: Float) = "$SQUARE ${showInfo(x, y)}"

    fun drawCircle(x: Int, y: Int) = "$CIRCLE ${showInfo(x, y)}"
    fun drawCircle(x: Float, y: Float) = "$CIRCLE ${showInfo(x, y)}"

    fun drawPoint(x: Int, y: Int) = "$POINT ${showInfo(x, y)}"
    fun drawPoint(x: Float, y: Float) = "$POINT ${showInfo(x, y)}"
}

fun showInfo(x: Int, y: Int) = "$WAS_DRAWN_IN x = $x, y = $y"
fun showInfo(x: Float, y: Float) = "$WAS_DRAWN_IN x = $x, y = $y"

fun main() {
    val myScreen: Screen = Screen()
    with(myScreen) {
        println(drawSquare(2, 3))
        println(drawSquare(2.3f, 3.5f))
        println(drawCircle(3, 4))
        println(drawCircle(3.9f, 1.3f))
        println(drawPoint(1, 0))
        println(drawPoint(5.1f, 7.3f))
    }
}