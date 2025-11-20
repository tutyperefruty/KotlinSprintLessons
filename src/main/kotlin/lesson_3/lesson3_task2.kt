package org.example.lesson_3

fun main() {

    var family = "Андреева"
    val name = "Татьяна"
    val patron = "Сергеевна"
    var age = 20

    var fullName = "$family $name $patron"

    println("$fullName, $age")

    family = "Сидорова"
    age = 22

    println("$fullName, $age")

}