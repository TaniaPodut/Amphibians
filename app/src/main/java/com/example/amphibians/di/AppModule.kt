package com.example.amphibians.di

import android.app.Application
import com.example.amphibians.data.AmphibiansRepository
import com.example.amphibians.data.DefaultAmphibiansRepository
import com.example.amphibians.network.AmphibiansApiService
import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideMyApi(): AmphibiansApiService {
        return Retrofit.Builder()
            .addConverterFactory(Json.asConverterFactory("application/json".toMediaType()))
            .baseUrl("https://android-kotlin-fun-mars-server.appspot.com/")
            .build()
            .create(AmphibiansApiService::class.java)
    }

    @Provides
    @Singleton
    fun provideMyRepository(amphibiansApiService: AmphibiansApiService, app: Application): AmphibiansRepository {
        return DefaultAmphibiansRepository(amphibiansApiService, app)
    }
}