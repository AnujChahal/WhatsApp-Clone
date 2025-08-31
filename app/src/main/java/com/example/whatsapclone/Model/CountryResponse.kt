package com.example.whatsapclone.Model

import kotlinx.serialization.Serializable

//my API model(data) here
@Serializable
data class CountryResponse(
    val name: CountryName,
    val idd: CountryIdd? = null
)
@Serializable
data class CountryName(
    val common: String
)

@Serializable
data class CountryIdd(
    val root: String? = null,
    val suffixes: List<String>? = null
)