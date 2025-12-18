package org.example.lesson_18

const val WAS_DROWN_IN = "was drawn in coordinates"

class Screen {
    fun drawSquare(name: String, x: Int, y: Int) = println(showInfo(name, x, y))
    fun drawSquare(name: String, x: Float, y: Float) = println(showInfo(name, x, y))

    fun drawCircle(name: String, x: Int, y: Int) = println(showInfo(name, x, y))
    fun drawCircle(name: String, x: Float, y: Float) = println(showInfo(name, x, y))

    fun drawPoint(name: String, x: Int, y: Int) = println(showInfo(name, x, y))
    fun drawPoint(name: String, x: Float, y: Float) = println(showInfo(name, x, y))
}

fun showInfo(name: String, x: Int, y: Int) = "$name $WAS_DROWN_IN x = $x, y = $y"
fun showInfo(name: String, x: Float, y: Float) = "$name $WAS_DROWN_IN x = $x, y = $y"

fun main() {
    val myScreen: Screen = Screen()
    with(myScreen) {
        drawSquare("Square", 2, 3)
        drawSquare("Square", 2.3f, 3.5f)
        println()
        drawCircle("Circle", 3, 4)
        drawCircle("Circle", 3.9f, 1.3f)
        println()
        drawPoint("Point",1, 0)
        drawPoint("Point", 5.1f, 7.3f)
    }
}