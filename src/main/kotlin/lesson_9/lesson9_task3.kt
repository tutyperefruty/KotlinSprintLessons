package org.example.lesson_9

const val EGG_PORTION = 2
const val MILK_PORTION = 50
const val BUTTER_PORTION = 15

fun main() {

    val index0 = "eggs"
    val index1 = "milk"
    val index2 = "butter"
    val omeletteOneUnit = listOf(EGG_PORTION, MILK_PORTION, BUTTER_PORTION)
    println("Enter the number of servings: ")
    val servingsNums = readln().toInt()
    val listForServNums = omeletteOneUnit.map { it * servingsNums }
    println("For ${servingsNums} servings of omelette you you will need: ${index0} - ${listForServNums[0]} pcs., ${index1} - ${listForServNums[1]} ml., ${index2} - ${listForServNums[2]} gr..")

}