package org.example.lesson_22

class MainScreenViewModel {
    var mainScreenState = MainScreenState()

    data class MainScreenState(
        val data: String? = null,
        val isLoading: Boolean = false
    )

    fun loadData() {
        println("Current state: $mainScreenState")
        mainScreenState = mainScreenState.copy(isLoading = true)
        println("Current state: $mainScreenState")
        mainScreenState = mainScreenState.copy(data = "Here's loaded data", isLoading = false)
        println("Current state: $mainScreenState")
    }
}

fun main() {
    val viewModel = MainScreenViewModel()
    viewModel.loadData()
}