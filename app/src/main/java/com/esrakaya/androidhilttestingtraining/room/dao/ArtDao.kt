package com.esrakaya.androidhilttestingtraining.room.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.esrakaya.androidhilttestingtraining.room.model.Art

@Dao
interface ArtDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAt(art: Art)

    @Delete
    suspend fun delete(art: Art)

    @Query("SELECT * from arts")
    fun observeArts(): LiveData<List<Art>>
}