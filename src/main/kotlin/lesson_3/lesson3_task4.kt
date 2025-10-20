package org.example.lesson_3

fun main() {

    var startPoint = "E2"
    var destPoint = "E4"
    var nos = 1

    var server = "[$startPoint-$destPoint;$nos]"
    println(server)

    startPoint = "D2"
    destPoint = "D3"
    nos+=1

    server = "[$startPoint-$destPoint;$nos]"
    println(server)

}