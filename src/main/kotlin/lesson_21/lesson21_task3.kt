package org.example.lesson_21

const val MAX_HEALTH = 100

class Player {
    val name: String = "Alya"
    var currentHealth: Int = 33
    val maxHealth: Int = MAX_HEALTH
}

fun Player.isHealthy(): Boolean {
    return if (this.currentHealth == this.maxHealth) true else false
}

fun main() {
    val alya = Player()

    println(alya.isHealthy())
    alya.currentHealth = 100
    println(alya.isHealthy())
}