package org.example.lesson_19

enum class Bullet(val power: Int) { BLUE(5), GREEN(10), RED(20) }

class Tank {
    private var loadedBullet: Bullet? = null

    fun chargeBullet(bullet: Bullet) {
        loadedBullet = bullet
        println("Got $loadedBullet bullet")
    }

    fun shoot() {
        loadedBullet?.power?.let { println("Shoooot! Damage -$it") } ?: println("Can't shoot by nothing!")
        loadedBullet = null
    }
}

fun main() {
    val tank = Tank()
    with(tank) {
        println()
        chargeBullet(Bullet.BLUE)
        Thread.sleep(1500L)
        shoot()
        Thread.sleep(1500L)
        chargeBullet(Bullet.RED)
        Thread.sleep(1500L)
        shoot()
        Thread.sleep(1500L)
        shoot()
        Thread.sleep(1500L)
        chargeBullet(Bullet.GREEN)
        Thread.sleep(1500L)
        shoot()
        Thread.sleep(1000L)
    }
}