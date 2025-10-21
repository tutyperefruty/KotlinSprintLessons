package org.example.lesson_4

fun main() {

    print("Input: is Damage (yes or no): ")
    val damageYesOrNoToBool: String? = readLine()
    val damageYesOrNo = if (damageYesOrNoToBool == "yes") "true" else "false"
    val damage: Boolean = damageYesOrNo.toBoolean()
//    println("OK by Damages? ${damage != true}")

    print("Input: number of crew: ")
    val crewNum: Int = readLine()!!.toInt()
//    println("OK by number of crew? ${crewNum >= 55 && crewNum <= 70}")

    print("Input: number of provision box: ")
    val provisionBoxNum: Int = readLine()!!.toInt()
//    println("OK by number of crew? ${provisionBoxNum >= 50}")

    print("Input: is weather (yes or no): ")
    val weatherYesOrNoToBool: String? = readLine()
    val weatherYesOrNo = if (weatherYesOrNoToBool == "yes") "true" else "false"
    val weather: Boolean = weatherYesOrNo.toBoolean()
//    println("OK by Weather? ${if (weather == false) "true" else "true"}")

    val result = (damage != true) and (crewNum >= 55 && crewNum <= 70) and (provisionBoxNum >= 50) and (if (weather == false) true else true)
    println("\n - Can the ship set sail?\n - Answer: ${(damage != true) and (crewNum >= 55 && crewNum <= 70) and (provisionBoxNum >= 50) and (if (weather == false) true else true)}")

    val forIf = "\n\nAlternativa:"
    val continued = if (((damage != true) and (crewNum >= 55 && crewNum <= 70) and (provisionBoxNum >= 50) and (if (weather == false) true else true)) != true) {
        println(forIf)
    } else {
        println("")
    }

    if (forIf == "\n\nAlternativa:" && result != true) {
            print("Input: is it small Damage (yes or no): ")
            val smallDamageYesOrNoToBool: String? = readLine()
            val smallDamageYesOrNo = if (smallDamageYesOrNoToBool == "yes") "true" else "false"
            val smallDamage: Boolean = smallDamageYesOrNo.toBoolean()
//            println("OK by Damages? ${smallDamage == true}")
            println("\n - Can the ship set sail by alternative?\n - Answer: ${(smallDamage == true) and (crewNum == 70) and (provisionBoxNum >= 50) and (weather == true)}")
    }
}