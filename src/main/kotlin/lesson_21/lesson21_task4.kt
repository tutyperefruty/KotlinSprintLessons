package org.example.lesson_21

import java.io.File
import kotlin.io.readText

fun main() {
    val file = File("existingFile.txt")
    file.writeWordToFileAtBeginning("abracadabra")
    println(file.readText())
}

fun File.writeWordToFileAtBeginning(word: String) {
    val oldContent = readText()
    val wordInLowerCase = word.lowercase()
    return this.writeText("$wordInLowerCase - $oldContent")
}
