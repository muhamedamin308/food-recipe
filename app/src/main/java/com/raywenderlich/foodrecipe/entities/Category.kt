package com.raywenderlich.foodrecipe.entities

import androidx.room.*
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.raywenderlich.foodrecipe.entities.converter.CategoryListConverter

@Entity(tableName = "Category")
data class Category(
    @PrimaryKey(autoGenerate = true)
    var id:Int,

    @ColumnInfo(name = "categorieitems")
    @Expose
    @SerializedName("categories")
    @TypeConverters(CategoryListConverter::class)
    var categorieitems: List<CategoryItems>? = null
)