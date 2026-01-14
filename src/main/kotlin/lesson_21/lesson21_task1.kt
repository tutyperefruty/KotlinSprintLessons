package org.example.lesson_21

fun main() {

    fun String.countVowel(): Int {
        return this.count { vowel -> vowel in "aeiouyAEIOUY"}
    }

    val hello = "Hello"
    println(hello.countVowel())
}