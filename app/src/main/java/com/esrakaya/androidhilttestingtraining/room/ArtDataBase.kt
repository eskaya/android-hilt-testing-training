package com.esrakaya.androidhilttestingtraining.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.esrakaya.androidhilttestingtraining.room.dao.ArtDao
import com.esrakaya.androidhilttestingtraining.room.model.Art


@Database(entities = [Art::class], version = 1)
abstract class ArtDataBase : RoomDatabase() {
    abstract fun artDao(): ArtDao
}