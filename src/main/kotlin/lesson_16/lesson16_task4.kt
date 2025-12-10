package org.example.lesson_16

data class Order(val orderNumber: Int, private var status: String) {

    private fun updateStatus(newStatus: String) {
        status = newStatus
    }

    fun requestStatusChange(request: String) {
        println("Approving process for setting up to '$request'")
        if (true) request else return
        updateStatus(request)
    }
}

fun main() {

    val ordersList: MutableList<Order> = mutableListOf()
    val order1 = Order(1, "add to cart").also { ordersList.add(it) }
    println(ordersList[0])

    order1.requestStatusChange("delivering")
    println(ordersList[0])

}