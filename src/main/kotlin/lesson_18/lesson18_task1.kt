package org.example.lesson_18

open class Order(val number: Int) {

    fun product(product: String) {
        println("Ordered product: [${product}]")
    }

    fun product(product: List<String>) {
        println("Ordered next products: ${product}")
    }

}

fun main() {

    val order1: Order = Order(1)
    val order2: Order = Order(2)
    order1.product("Milk")
    order2.product(listOf("Milk", "Butter", "Egg", "Sugar", "Powder"))
}