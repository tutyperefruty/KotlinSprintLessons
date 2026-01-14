package org.example.lesson_16

const val ZERO = 0
const val FULL = 100
const val HI_KICK = 50
const val LOW_KICK = 33
const val TREATMENT = 77

class Player {

    val name: String = "Player"
    private var health: Int = FULL
    private var hitStrength: Int = 33

    private var isDead: Boolean = false

    fun takeDamage(damage: Int): Int {
        if (isDead) return health
        health -= damage
        println("${name} got damage: $damage. Health: ${health.coerceAtLeast(ZERO)}")
        if (health <= ZERO) gotDeath()
        return health
    }

    fun getHealth(treatment: Int): Int {
        if (isDead) {
            println("$name is dead. Can't receive treatment.")
            return health
        }
        health = (health + treatment).coerceAtMost(FULL)
        println("Got treatment: $treatment. Health: $health")
        return health
    }


    private fun gotDeath() {
        hitStrength = ZERO
        health = ZERO
        isDead = true
        println("$name is finaly dead.")
    }
}

fun main() {

    val player: Player = Player()
    with(player){
        takeDamage(HI_KICK)
        getHealth(TREATMENT)
        takeDamage(LOW_KICK)
        takeDamage(HI_KICK * 2)
        getHealth(TREATMENT)
        takeDamage(LOW_KICK)
    }

}