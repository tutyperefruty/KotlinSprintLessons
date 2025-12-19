package org.example.lesson_19

const val LISTING_SIZE = 5
const val MALE = "male"
const val FEMALE = "female"

enum class Sex {
    MALE,
    FEMALE,
    UNKNOWN
}

class PersonFile(
    private val name: String,
    private val sex: Sex = Sex.UNKNOWN
) {
    companion object {
        fun displayFilesList(personFilesList: MutableList<PersonFile>) {
            if (personFilesList.size == LISTING_SIZE) {
                personFilesList.forEachIndexed { index, file ->
                    println("${index + 1}: ${file.name} - ${file.sex}")
                }
            }
        }
    }
}

fun main() {
    val personFilesList: MutableList<PersonFile> = mutableListOf()

    while (personFilesList.size < LISTING_SIZE) {
        println("Enter Name how you want. Blank does mean 'No-named':")
        val inputName: String = readln().ifBlank {"NO_NAME"}

        println(
            "Enter the gender [Instructions: Enter only in English in all cases, e.g., mAle, FemalE. " +
                    "If you enter anything else or nothing, your sex will be set as 'UNKNOWN']: "
        )
        val inputSex: String = readln().lowercase()
        val sex = when (inputSex) {
            MALE -> Sex.MALE
            FEMALE -> Sex.FEMALE
            else -> Sex.UNKNOWN
        }

        personFilesList.add(PersonFile(name = inputName, sex = sex))

        PersonFile.displayFilesList(personFilesList)
    }
}