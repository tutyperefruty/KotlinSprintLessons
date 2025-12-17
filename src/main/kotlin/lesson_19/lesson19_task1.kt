package org.example.lesson_19

enum class FishType(val fishName: String) {
    GUPPY("Guppy"),
    ANGELFISH("Skalyariya"),
    GOLDFISH("Zolotaya ribka"),
    SIAMESE_FIGHTING_FISH("Petushok");
}

fun main() {
    println("You can add next fish to aquarium:")
    FishType.entries.forEach { println("${it.name} - ${it.fishName}") }
}