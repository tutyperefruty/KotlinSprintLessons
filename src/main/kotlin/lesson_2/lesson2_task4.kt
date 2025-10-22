package org.example.lesson_2

fun main() {

    val buff = 20
    val cristal = 7
    val rawFe = 11

    val extraCristal = cristal * buff * PERCENT
    val extraRawFe = rawFe * buff * PERCENT

    val intCristal = String.format("%.0f", extraCristal)
    val intRawFe = String.format("%.0f", extraRawFe)

    println(intCristal)
    println(intRawFe)

}

const val PERCENT = 0.01