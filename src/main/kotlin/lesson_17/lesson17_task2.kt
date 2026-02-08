package org.example.lesson_17

class Vessel(private var _name: String, private var _averageSpeed: Int, private var _homePort: String) {

    var name: String
        get() = _name
        set(value) {
            if (value.isNotEmpty()) {
                return println("Trying to change the ship's name. Denied.")
            } else {
                return println("Trying to set no-name. Denied.")
            }
        }
}

fun main() {

    val cometa: Vessel = Vessel("Cometa", 25, "Luna")
    with(cometa) {
        println(name)
        name = "Stimorol"
        println(name)
        name = ""
        println(name)
    }

}