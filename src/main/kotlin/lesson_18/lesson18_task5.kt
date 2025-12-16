package org.example.lesson_18

const val WAS_DRAWN_IN = "was drawn in coordinates"

enum class Figure {
    SQUARE,
    CIRCLE,
    POINT
}

fun showForInt(figure: Figure, x: Int, y: Int) = println("${figure.name} $WAS_DRAWN_IN ($x, $y)")
fun showForInt(figure: Figure, x: Float, y: Float) = println("${figure.name} $WAS_DRAWN_IN ($x, $y)")

class Screen {
    fun draw(figure: Figure, x: Int, y: Int): String {
        when (figure) {
            Figure.SQUARE -> showForInt(figure, x, y)
            Figure.CIRCLE -> showForInt(figure, x, y)
            Figure.POINT -> showForInt(figure, x, y)
        }
        return ""
    }
    fun draw(figure: Figure, x: Float, y: Float): String {
        when (figure) {
            Figure.SQUARE -> showForInt(figure, x, y)
            Figure.CIRCLE -> showForInt(figure, x, y)
            Figure.POINT -> showForInt(figure, x, y)
        }
        return ""
    }
}

fun main() {
    val myScreen: Screen = Screen()
    with(myScreen) {
        draw(Figure.SQUARE, 2, 3)
        draw(Figure.CIRCLE, 3, 4)
        draw(Figure.POINT, 1, 0)
        draw(Figure.SQUARE, 2.3f, 3.5f)
        draw(Figure.CIRCLE, 3.9f, 1.3f)
        draw(Figure.POINT, 5.1f, 7.3f)
    }
}