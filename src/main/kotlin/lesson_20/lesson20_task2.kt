package org.example.lesson_20

const val MAX_HEALTH = 100

class Player {
    val name: String = "Alya"
        get() = field
    var currentHealth: Int = 33
        get() = field
        set(value) {
            field = value
        }
    val maxHealth: Int
        get() = MAX_HEALTH

}

fun main() {
    val alya = Player()
    val getFullHealthWithLambda: (Player) -> Unit = { player: Player ->
        player.currentHealth = player.maxHealth
        println("The player '${player.name}' has been restored to health," +
                " and is now completely healthy: ${player.currentHealth} units.")
    }

    println(alya.currentHealth)
    getFullHealthWithLambda(alya)

    alya.currentHealth = 50
    println(alya.currentHealth);
    getFullHealthWithLambda(alya)
    println(alya.currentHealth)

}