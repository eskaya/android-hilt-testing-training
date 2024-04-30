package com.esrakaya.androidhilttestingtraining.repo

import androidx.lifecycle.LiveData
import com.esrakaya.androidhilttestingtraining.data.Services
import com.esrakaya.androidhilttestingtraining.model.ImageResponse
import com.esrakaya.androidhilttestingtraining.room.dao.ArtDao
import com.esrakaya.androidhilttestingtraining.room.model.Art
import com.esrakaya.androidhilttestingtraining.util.Resource
import java.lang.Exception
import javax.inject.Inject

class ArtRepository @Inject constructor(
    private val artDao: ArtDao,
    private val retrofitAPI: Services
) : ArtRepositoryInterface {
    override suspend fun insertArt(art: Art) {
        artDao.insertAt(art)
    }

    override suspend fun deleteArt(art: Art) {
        artDao.delete(art)
    }

    override fun getArt(): LiveData<List<Art>> {
        return artDao.observeArts()
    }

    override suspend fun searchImage(key: String): Resource<ImageResponse> {
       return try {

           val response = retrofitAPI.imageSearch(key)
           if(response.isSuccessful){
               response.body()?.let {
                   return@let Resource.success(it)
               }?: Resource.error("Error", null)
           }else{
               Resource.error("Error", null)
           }

       }catch (e:Exception){
           Resource.error("Error", null)
       }
    }
}