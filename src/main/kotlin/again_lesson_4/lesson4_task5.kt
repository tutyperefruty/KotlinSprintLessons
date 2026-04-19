package org.example.again_lesson_4

const val CREW_MIN = 55
const val CREW_MAX = 70
const val STD_CREW = CREW_MAX
const val STD_PROVISION_BOX = 50
const val TRUE = "true"
const val FALSE = "false"
const val POSSIBLE_FOR_DEPARTURE = "The ship can depart"
const val IMPOSSIBLE_FOR_DEPARTURE = "The ship can't depart"

fun main() {

    println("Input: the ship has damage (yes or no): ")
    val hasDamageString: String = if (readln().lowercase() == "yes") TRUE else FALSE
    val hasDamage: Boolean = hasDamageString.toBoolean()

    println("Input: are there favorable weather conditions (yes or no): ")
    val isWeatherCondition = if (readln().lowercase() == "yes") TRUE else FALSE
    val isFavorableWeatherCondition: Boolean = isWeatherCondition.toBoolean()

    println("Input: number of crew: ")
    val currentCrewNumber: Int = readln().toInt()

    println("Input: number of provision box: ")
    val currentProvisionBoxNumber: Int = readln().toInt()

    val canDepartForLong: Boolean = !hasDamage &&
            currentCrewNumber in CREW_MIN..CREW_MAX && currentProvisionBoxNumber > STD_PROVISION_BOX
    val canDepartAlternative: Boolean = isFavorableWeatherCondition &&
            currentCrewNumber == STD_CREW && currentProvisionBoxNumber >= STD_PROVISION_BOX
    val canDepart: Boolean = canDepartForLong || canDepartAlternative

    if (canDepart) println(POSSIBLE_FOR_DEPARTURE) else println(IMPOSSIBLE_FOR_DEPARTURE)
}