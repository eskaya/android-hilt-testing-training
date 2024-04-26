package com.esrakaya.androidhilttestingtraining.api

import com.esrakaya.androidhilttestingtraining.model.ImageResponse
import com.esrakaya.androidhilttestingtraining.util.Const.API_KEY
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface Services {

    @GET("api/")
    suspend fun imageSearch(
        @Query("q") searchKey: String,
        @Query("key") apiKey: String = API_KEY
    ):Response<ImageResponse>

}