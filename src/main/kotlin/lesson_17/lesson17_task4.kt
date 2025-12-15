package org.example.lesson_17

const val POSITION_COUNT_FROM = 0
const val FIRST_POSITION = "Factory"

data class Package(private val packageNumber: Int, private var _currentPosition: String = FIRST_POSITION) {

    var positionCount: Int = POSITION_COUNT_FROM

    var currentPosition: String
        get() = _currentPosition
        set(value) {
            _currentPosition = value
            positionCount++
        }
}

fun main() {

    val package1: Package = Package(333)
    with(package1) {
        currentPosition = "Station 7"
        currentPosition = "Station 99"
        currentPosition = "Client"
        println("Position was changed $positionCount times")
    }

}