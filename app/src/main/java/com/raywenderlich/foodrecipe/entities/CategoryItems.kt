package com.raywenderlich.foodrecipe.entities


import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

@Entity(tableName = "CategoryItems")
data class CategoryItems(
    @PrimaryKey(autoGenerate = true)
    var id:Int,

    @Expose
    @SerializedName("idCategory")
    @ColumnInfo(name = "idcategory")
    val idcategory: String,

    @Expose
    @SerializedName("strCategory")
    @ColumnInfo(name = "strcategory")
    val strcategory: String,

    @Expose
    @SerializedName("strCategoryThumb")
    @ColumnInfo(name = "strcategorythumb")
    val strcategorythumb: String,

    @Expose
    @SerializedName("strCategoryDescription")
    @ColumnInfo(name = "strcategorydescription")
    val strcategorydescription: String
)
