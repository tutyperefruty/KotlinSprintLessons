package org.example.lesson_19

enum class Bullet(val power: Int? = null) { BLUE(5), GREEN(10), RED(20) }

class Tank {
    private var loadedBullet: Bullet? = null

    fun chargeBullet(bullet: Bullet? = null) {
        loadedBullet = when (bullet) {
            Bullet.BLUE -> {
                println("Got ${Bullet.BLUE}"); Bullet.BLUE
            }
            Bullet.GREEN -> {
                println("Got ${Bullet.GREEN}"); Bullet.GREEN
            }
            Bullet.RED -> {
                println("Got ${Bullet.RED}"); Bullet.RED
            }
            else -> {
                println("Nothing loaded!")
                null
            }
        }
    }

    fun shoot() {
        if (loadedBullet?.power != null) println("Shoooot! Damage -${loadedBullet!!.power}")
        else println("Can't shoot by nothing!")
    }
}

fun main() {
    val tank = Tank()
    with(tank) {
        println()
        chargeBullet()
        Thread.sleep(1500L)
        shoot()
        Thread.sleep(1500L)
        chargeBullet(Bullet.BLUE)
        Thread.sleep(1500L)
        shoot()
        Thread.sleep(1500L)
        chargeBullet(Bullet.RED)
        Thread.sleep(1500L)
        shoot()
        Thread.sleep(1500L)
        chargeBullet(Bullet.GREEN)
        Thread.sleep(1500L)
        shoot()
        Thread.sleep(1000L)
    }
}