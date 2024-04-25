package com.esrakaya.androidhilttestingtraining.room.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "arts")
data class Art(
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null,

    @ColumnInfo(name = "art_name")
    var artName: String,

    @ColumnInfo(name = "artist_name")
    var artistName: String,

    @ColumnInfo(name = "year")
    var year: Int,

    @ColumnInfo(name = "art_image_url")
    var artImageUrl: String
)