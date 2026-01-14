package org.example.lesson_19

interface TakeOffAble {
    fun takeOff()
}

interface Landable {
    fun land()
}

interface Shootable {
    fun shoot()
}

class StarShip : TakeOffAble, Landable, Shootable {
    override fun takeOff() {
        println("Starship is taking off")
    }

    override fun shoot() {
//        TODO add when() for each 3 guns using enum
    }

    override fun land() {
        TODO("Not yet implemented")
    }
}

fun main() {
    val novichok = StarShip()
    novichok.shoot()
    novichok.land()
}