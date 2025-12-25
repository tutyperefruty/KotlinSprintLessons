package org.example.lesson_21

fun Map<String, Int>.maxCategory(): String {
    return this.maxByOrNull { it.value }?.run { key ?: "Empty key" } ?: "Empty map"
}

fun main() {

    val experience: Map<String, Int> = mapOf(
        "Breath" to 900,
        "Smile" to 1000,
        "Jump" to 1200,
        "Roll" to 800,
        "Speak" to 300,
        "Write" to 1200,
        "Fly" to 0
    )

    println(experience.maxCategory())

}