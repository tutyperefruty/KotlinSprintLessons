package org.example.lesson_6

const val FROM_NUM = 1
const val TO_NUM = 9

fun main() {

    var attempt: Int = 3

    do {
        val firstSlag = ((FROM_NUM..TO_NUM)).random()
        val secondSlag = ((FROM_NUM..TO_NUM)).random()
        println("Reshi primer na slozheniye: ${firstSlag} + ${secondSlag} = ")
        val result = readln().toInt()
        if (result == (firstSlag + secondSlag)) {
            println("Dobro pozhalovat'")
            break
        } else {
            attempt--
            if (attempt == 0) println("Dostup zapreshyon")
        }
    } while (attempt > 0)

}