package org.example.lesson_19

enum class Category {
    CLOTHING,
    STATIONERY,
    OTHERS;

    fun showCategory(): String = name
}

data class Product(
    private val name: String,
    private val category: Category,
) {
    companion object {
        var nextID = 1
    }
    var iD = nextID++

    fun showInfo() {
        println("$name (id:$iD) [${category.showCategory()}]")
    }
}

fun main() {
    val skirt = Product("Skirt", Category.CLOTHING)
    val pen = Product("Pen", Category.STATIONERY)
    val hatuba = Product("Hatuba", Category.OTHERS)

    skirt.showInfo()
    pen.showInfo()
    hatuba.showInfo()
}