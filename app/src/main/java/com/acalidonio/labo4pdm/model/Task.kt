package com.acalidonio.labo4pdm.model

import androidx.room3.Entity
import androidx.room3.PrimaryKey
import java.util.Date

@Entity(tableName = "tasks")
data class Task (
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val title: String,
    val description: String,
    val endDate: Date = Date(),
    val isCompleted: Boolean = false
)