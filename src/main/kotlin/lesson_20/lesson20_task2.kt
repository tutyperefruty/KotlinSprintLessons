package org.example.lesson_20

const val MAX_HEALTH = 100

class Player(
    private val _name: String,
    private var _currentHealth: Int,
    private val _maxHealth: Int = MAX_HEALTH
) {
    val name: String
        get() = _name
    var currentHealth: Int
        get() = _currentHealth
        set(value) {
            _currentHealth = value
        }
    val maxHealth: Int
        get() = _maxHealth

}

fun main() {
    val alya = Player("Alya", 33)
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