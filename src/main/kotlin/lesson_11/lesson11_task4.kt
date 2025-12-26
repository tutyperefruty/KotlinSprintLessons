package org.example.lesson_11

class Ingredient(
    val ingredientName: String,
    val ingredientQuantity: Int,
    val ingredientUnit: String,
    var portions: Int = 1
)

class Recipe(
    val recipeName: String,
    val recipeCover: String,
    val inFavorites: Boolean = false,
    val ingredListForRecipe: MutableList<Ingredient> = mutableListOf(),
    val description: String = "",
)

class Category(
    val categoryTitle: String,
    val categoryCover: String,
    val recipeList: MutableList<Recipe> = mutableListOf(),
    val categoryDescription: String,
)