package org.example.lesson_19

enum class Bullet(val power: Int) {
    BLUE(5),
    GREEN(10),
    RED(20),
    EMPTY(0) {
        override fun showInfo() = println("Need Bullet!")
    };

    open fun showInfo() = println("Loaded ${this.name} Bullet with power of ${this.power} points")
}

class Tank {
    private var loadedBullet: Bullet = Bullet.EMPTY

    fun chargeBullet(color: String? = loadedBullet.toString()) {
        loadedBullet = when (color) {
            Bullet.BLUE.name -> Bullet.BLUE
            Bullet.GREEN.name -> Bullet.GREEN
            Bullet.RED.name -> Bullet.RED
            Bullet.EMPTY.name -> Bullet.EMPTY
            else -> {
                println("Unknown Bullet. Can't load")
                Bullet.EMPTY
            }
        }
        loadedBullet.showInfo()
    }

    fun shoot() {
        when (loadedBullet) {
            Bullet.BLUE -> println("You have inflicted ${Bullet.BLUE.power} damage points")
            Bullet.GREEN -> println("You have inflicted ${Bullet.GREEN.power} damage points")
            Bullet.RED -> println("You have inflicted ${Bullet.RED.power} damage points")
            Bullet.EMPTY -> println("No Bullet loaded!")
        }
    }
}

fun main() {
    val tank = Tank()
    with(tank) {
        chargeBullet()
        shoot()
        chargeBullet("GREEN")
        chargeBullet("RED")
        shoot()
        chargeBullet("NUCLEAR")
        shoot()
    }
}