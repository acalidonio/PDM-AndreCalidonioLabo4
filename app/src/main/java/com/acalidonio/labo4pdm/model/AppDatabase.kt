package com.acalidonio.labo4pdm.model

import androidx.room3.Database
import androidx.room3.RoomDatabase
import androidx.room3.TypeConverters

@Database(entities = [Task::class], version = 1)
@TypeConverters(DateConverter::class)
abstract class AppDatabase : RoomDatabase() {
    abstract fun taskDao(): TaskDao
}
