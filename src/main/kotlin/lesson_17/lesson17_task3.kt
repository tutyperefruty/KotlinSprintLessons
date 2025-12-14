package org.example.lesson_17

data class Folder(private val _name: String, private var _files: Int, private var _isSecret: Boolean) {

    val isSecret: Boolean
        get() = _isSecret

    val name: String
        get() {
            if (isSecret) {
                _files = 0
                return "Hidden folder with $files files"
            } else {
                return "Folder name: '$_name' ($files files)"
            }
        }

    val files: Int
        get() = _files

}

fun main() {

    val hiddenFolder: Folder = Folder("drivers", 9, true)
    with(hiddenFolder) {
        println(name)
    }
}