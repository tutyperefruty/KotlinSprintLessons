package org.example.again_lesson_3

fun main() {

    var startPoint = "E2"
    var destinationPoint = "E4"
    var nos = 1

    var server = "[$startPoint-$destinationPoint;$nos]"
    displayMovement(server)

    startPoint = "D2"
    destinationPoint = "D3"
    nos += 1

    server = "[$startPoint-$destinationPoint;$nos]"
    displayMovement(server)
}

fun displayMovement(server: String) = println(server.replace("-", "->"))