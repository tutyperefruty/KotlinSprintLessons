package org.example.lesson_18

class Order(val number: Int) {

    fun displayProduct(product: String) {
        println("Ordered product: [${product}]")
    }

    fun displayProduct(product: List<String>) {
        println("Ordered next products: ${product}")
    }

}

fun main() {
    val order1 = Order(1)
    val order2 = Order(2)
    order1.displayProduct("Milk")
    order2.displayProduct(listOf("Milk", "Butter", "Egg", "Sugar", "Powder"))
}