package com.raywenderlich.foodrecipe.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.raywenderlich.foodrecipe.dao.RecipeDao
import com.raywenderlich.foodrecipe.entities.*
import com.raywenderlich.foodrecipe.entities.converter.CategoryListConverter
import com.raywenderlich.foodrecipe.entities.converter.MealListConverter


@Database(entities = [Recipes::class, CategoryItems::class, Category::class, Meal::class, MealsItems::class],version = 1,exportSchema = false)
@TypeConverters(CategoryListConverter::class, MealListConverter::class)
abstract class RecipeDatabase: RoomDatabase() {

    companion object{

         private var recipesDatabase:RecipeDatabase? = null

        @Synchronized
        fun getDatabase(context: Context): RecipeDatabase{
            if (recipesDatabase == null){
                recipesDatabase = Room.databaseBuilder(
                    context,
                    RecipeDatabase::class.java,
                    "recipe.db"
                ).allowMainThreadQueries()
                    .build()
            }
            return recipesDatabase!!
        }
    }

    abstract fun recipeDao(): RecipeDao
}