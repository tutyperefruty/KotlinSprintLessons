package org.example.lesson_2

fun main() {

    val buff = 0.2
    val cristal = 7
    val rawFe = 11

    val extraCristal = cristal * buff
    val extraRawFe = rawFe * buff

    val intCristal = String.format("%.0f", extraCristal)
    val intRawFe = String.format("%.0f", extraRawFe)

    println(intCristal)
    println(intRawFe)

}