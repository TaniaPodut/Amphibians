package com.example.amphibians.fake

import com.example.amphibians.data.AmphibiansRepository
import com.example.amphibians.model.Amphibian

class FakeDefaultAmphibiansRepository: AmphibiansRepository {
    override suspend fun getAmphibians(): List<Amphibian> {
        return FakeDataSource.photosList
    }
}