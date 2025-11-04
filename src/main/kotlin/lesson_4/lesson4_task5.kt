package org.example.lesson_4

const val CREW_MIN = 55
const val CREW_MAX = 70
const val STD_CREW = CREW_MAX
const val STD_PROV_BOX = 50
const val IS_DAMAGES = true
const val NO_WEATHER = false
const val OK = true
const val IS_SMALL_DAMAGE = true

fun main() {

    print("Input: is Damage (yes or no): ")
    val damageYesOrNoToBool: String? = readLine()
    val damageYesOrNo = if (damageYesOrNoToBool == "yes") "true" else "false"
    val damage: Boolean = damageYesOrNo.toBoolean()

    print("Input: number of crew: ")
    val crewNum: Int = readLine()!!.toInt()

    print("Input: number of provision box: ")
    val provisionBoxNum: Int = readln().toInt()

    print("Input: is weather (yes or no): ")
    val weatherYesOrNoToBool: String? = readln()
    val weatherYesOrNo = if (weatherYesOrNoToBool == "yes") "true" else "false"
    val weather: Boolean = weatherYesOrNo.toBoolean()

    val result = (damage != IS_DAMAGES) and (crewNum >= CREW_MIN && crewNum <= CREW_MAX) and (provisionBoxNum > STD_PROV_BOX) and (if (weather == NO_WEATHER) OK else OK)
    println("The ship can set sail: ${(damage != IS_DAMAGES) and (crewNum >= CREW_MIN && crewNum <= CREW_MAX) and (provisionBoxNum > STD_PROV_BOX) and (if (weather == NO_WEATHER) OK else OK)}")

    val forIf = "\n\nAlternativa:"
    val continued = if (((damage != IS_DAMAGES) and (crewNum == STD_CREW) and (provisionBoxNum >= STD_PROV_BOX) and (weather != NO_WEATHER)) != OK) {
        println(forIf)
    } else {
        println("")
    }

    if (forIf == "\n\nAlternativa:" && result != true) {
            print("Input: is it small Damage (yes or no): ")
            val smallDamageYesOrNoToBool: String? = readln()
            val smallDamageYesOrNo = if (smallDamageYesOrNoToBool == "yes") "true" else "false"
            val smallDamage: Boolean = smallDamageYesOrNo.toBoolean()

            println("The ship can set sail by alternative: ${(smallDamage == IS_SMALL_DAMAGE) and (crewNum == STD_CREW) and (provisionBoxNum >= STD_PROV_BOX) and (weather != NO_WEATHER)}")
    }
}