package org.example.lesson_20

class Player {
    val name: String = "Player-#"
        get() = field
    var keyPresence: Boolean = false
        get() = field
        set(value) {
            field = value
        }
}


fun isKey(player: Player) {
    player.keyPresence = true
}

fun main() {
    val checkKey: (Player) -> Unit = { gamer: Player ->
        if (gamer.keyPresence) {
            println("${gamer.name} opened the door")
        } else {
            println("The door is locked")
        }
    }

    val player1 = Player()
    with(player1) {
        checkKey(this)
        isKey(this)
        checkKey(this)
    }
}