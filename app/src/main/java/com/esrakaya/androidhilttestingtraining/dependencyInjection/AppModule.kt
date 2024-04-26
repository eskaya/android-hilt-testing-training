package com.esrakaya.androidhilttestingtraining.dependencyInjection

import android.content.Context
import androidx.room.Room
import com.esrakaya.androidhilttestingtraining.data.Services
import com.esrakaya.androidhilttestingtraining.room.ArtDataBase
import com.esrakaya.androidhilttestingtraining.util.Constants.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
@InstallIn
//@InstallIn(ApplicationComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun injectDatabase(@ApplicationContext context: Context) =
        Room.databaseBuilder(context, ArtDataBase::class.java, "ArtBookDb").build()

    @Singleton
    @Provides
    fun injectionDao(dataBase: ArtDataBase) = dataBase.artDao()

    @Singleton
    @Provides
    fun injectRetrofitAPI(): Services {
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()
            .create(Services::class.java)
    }
}