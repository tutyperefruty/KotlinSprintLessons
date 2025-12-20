package org.example.lesson_20

class Player(
    private val _name: String = "Player-#",
    private var _keyPresence: Boolean = false,
) {
    val name: String
        get() = _name
    var keyPresence: Boolean
        get() = _keyPresence
        set(value) {
            _keyPresence = value
        }
}

val checkKey: (Player) -> Unit = { gamer: Player ->
    if (gamer.keyPresence) {
        println("${gamer.name} opened the door")
    } else {
        println("The door is locked")
    }
}

fun getKey(player: Player) {
    player.keyPresence = true
}

fun main() {
    val player1 = Player()
    with(player1) {
        checkKey(this)
        getKey(this)
        checkKey(this)
    }
}