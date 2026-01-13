package org.example.lesson_2

import kotlin.math.pow

fun main() {

    val amountAtStart = 70000
    val annualRate: Double = 16.7
    val numOfAccrualsPerYear = 1
    val periodYears: Double = 20.0

    val powBase = 1 + (annualRate * 0.01)/ numOfAccrualsPerYear
    val powExp = numOfAccrualsPerYear * periodYears
    val powResult = powBase.pow(powExp)

    val totalDepositAmount = amountAtStart * powResult
    val threeDigtotal = String.format("%.3f", totalDepositAmount)
    println(threeDigtotal)

}