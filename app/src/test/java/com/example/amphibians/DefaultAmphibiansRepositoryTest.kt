package com.example.amphibians

import com.example.amphibians.fake.FakeAmphibiansApiService
import com.example.amphibians.fake.FakeDataSource
import com.example.amphibians.data.DefaultAmphibiansRepository
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Test

class DefaultAmphibiansRepositoryTest {

    @Test
    fun networkMarsPhotosRepository_getMarsPhotos_verifyPhotoList() =
        runTest {
            val repository = DefaultAmphibiansRepository(
                amphibiansApiService = FakeAmphibiansApiService()
            )
            assertEquals(FakeDataSource.photosList, repository.getAmphibians())
        }
}