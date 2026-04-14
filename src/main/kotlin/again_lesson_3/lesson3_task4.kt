package org.example.again_lesson_3

fun main() {

    var startPoint = "E2"
    var destinationPoint = "E4"
    var moveNumber = 1

    var server = "$startPoint-$destinationPoint;$moveNumber"
    println(server)

    startPoint = "D2"
    destinationPoint = "D3"
    moveNumber += 1

    server = "$startPoint-$destinationPoint;$moveNumber"
    println(server)
}