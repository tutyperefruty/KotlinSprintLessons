package org.example.lesson_17

data class Folder(private val _name: String, private val _files: Int, private val _isSecret: Boolean) {

    val isSecret: Boolean
        get() = _isSecret

    val name: String
        get() = if (isSecret) "Hidden folder" else _name

    val files: Int
        get() = if (isSecret) 0 else _files

}

fun main() {

    val hiddenFolder: Folder = Folder("drivers", 9, true)
    with(hiddenFolder) {
        println(name)
        println("Files: $files")
    }
}