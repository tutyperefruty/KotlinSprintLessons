package org.example.lesson_21

import java.io.File

fun main() {
    val file = File("wordToBegin.txt")
    file.writeWordToFileAtBeginning("abracadabra")
}

fun File.writeWordToFileAtBeginning(word: String) {
    createNewFile()
    writeText("Zachyotniy smailik")
    val oldContent = readText()
    val wordInLowerCase = word.lowercase()
    writeText("$wordInLowerCase - $oldContent")
    println(readText())
}
