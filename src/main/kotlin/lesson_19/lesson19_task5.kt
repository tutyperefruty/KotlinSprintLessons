package org.example.lesson_19

const val LISTING_SIZE = 5

enum class Sex { MALE, FEMALE }

class PersonFile(
    private val _name: String,
    private val _sex: Sex
) {
    val name: String
        get() = _name
    val sex: Sex
        get() = _sex
}

fun readSex(): Sex {
    while (true) {
        println(
            "Enter the gender [Instructions: Enter only in English in all cases, e.g., mAle, FemalE. " +
                    "You will reenter gender until it correct]: "
        )
        val inputSex: String = readln().lowercase()
        val sex = when (inputSex) {
            Sex.MALE.name.lowercase() -> Sex.MALE
            Sex.FEMALE.name.lowercase() -> Sex.FEMALE
            else -> null
        }
        if (sex != null) return sex
    }
}

fun displayFilesList(personFilesList: MutableList<PersonFile>) {
    personFilesList.forEachIndexed { index, file ->
        println("${index + 1}: ${file.name} - ${file.sex}")
    }
}

fun main() {
    val personFilesList: MutableList<PersonFile> = mutableListOf()

    while (personFilesList.size < LISTING_SIZE) {
        println("Enter Name how you want. Blank does mean 'No-named':")
        val inputName: String = readln().ifBlank { "NO_NAME" }

        val finalSex = readSex()

        personFilesList.add(PersonFile(_name = inputName, _sex = finalSex))
    }

    displayFilesList(personFilesList)
}

