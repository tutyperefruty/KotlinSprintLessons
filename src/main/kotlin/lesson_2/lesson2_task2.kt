package org.example.lesson_2

fun main() {

    val employee = 50
    val empSalary = 30000
    val intern = 30
    val internSalary = 20000

    val empTotalSalary = employee*empSalary
    println(empTotalSalary)

    val totalSalary = empTotalSalary+(intern*internSalary)
    println(totalSalary)

    val averageSalaryOfAll = totalSalary/(employee+intern)
    println(averageSalaryOfAll)

}