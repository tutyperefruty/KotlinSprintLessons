package org.example.lesson_19

enum class Category {
    CLOTHING,
    STATIONERY,
    OTHERS;

    fun showCategory() =
        when (this) {
            CLOTHING -> "Clothing"
            STATIONERY -> "Stationary"
            OTHERS -> "Others"
        }
}

class Product(
    private val name: String,
    private val category: Category,
) {
    companion object {
        var nextId = 1
    }
    var id = nextId++

    fun showInfo() {
        println("$name (id:$id) [${category.showCategory()}]")
    }
}

fun main() {
    val skirt = Product("Skirt", Category.CLOTHING)
    val pen = Product("Pen", Category.STATIONERY)
    val hatuba = Product("Hatuba", Category.OTHERS)

    val list: List<Product> = listOf(skirt, pen, hatuba)
    for (product in list) {
        product.showInfo()
    }
}