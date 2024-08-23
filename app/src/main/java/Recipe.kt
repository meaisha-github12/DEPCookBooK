package com.example.racipyaplication

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "recipe")
data class Recipe(
    @PrimaryKey(autoGenerate = true) val uid: Int = 0,
    val img: String,
    val title: String,
    val des: String,
    val ing: String,
    val category: String
)
