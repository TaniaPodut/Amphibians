package com.example.amphibians.fake

import com.example.amphibians.model.Amphibian

object FakeDataSource {

    private const val nameOne = "name1"
    private const val nameTwo = "name2"
    private const val typeOne = "type1"
    private const val typeTwo = "type2"
    private const val descriptionOne = "description1"
    private const val descriptionTwo = "description2"
    private const val imgOne = "url.1"
    private const val imgTwo = "url.2"
    val photosList = listOf(
       Amphibian(
            name = nameOne,
            type = typeOne,
            description = descriptionOne,
            imgSrc = imgOne
        ),
        Amphibian(
            name = nameTwo,
            type = typeTwo,
            description = descriptionTwo,
            imgSrc = imgTwo
    )
    )
}