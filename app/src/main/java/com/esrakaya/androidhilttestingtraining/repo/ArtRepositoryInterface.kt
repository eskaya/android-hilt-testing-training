package com.esrakaya.androidhilttestingtraining.repo

import androidx.lifecycle.LiveData
import com.esrakaya.androidhilttestingtraining.model.ImageResponse
import com.esrakaya.androidhilttestingtraining.room.model.Art
import com.esrakaya.androidhilttestingtraining.util.Resource

interface ArtRepositoryInterface {

    suspend fun insertArt(art: Art)

    suspend fun deleteArt(art: Art)

    fun getArt(): LiveData<List<Art>>

    //retrofit test için, artık dönen veriler bir rResource tipinin içerisinde olacak
    suspend fun searchImage(key: String): Resource<ImageResponse>

}