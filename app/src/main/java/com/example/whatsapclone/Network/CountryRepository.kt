package com.example.whatsapclone.Network

import android.util.Log
import com.example.whatsapclone.Model.CountryResponse
import io.ktor.client.request.*
import io.ktor.http.*
import io.ktor.client.call.*

suspend fun fetchCountry(): List<Pair<String, String>> {
    return try {
        val response: List<CountryResponse> = KtorClient.client.get("https://restcountries.com/v3.1/all") {
            contentType(ContentType.Application.Json)
        }.body()

        Log.d("API", "Fetched ${response.size} countries")

        response.take(5).forEach { c ->
            Log.d("API", "Country: ${c.name.common}, code=${c.idd?.root}${c.idd?.suffixes?.firstOrNull()}")
        }

        response.mapNotNull { country ->
            val code = country.idd?.root
            val suffix = country.idd?.suffixes?.firstOrNull()
            if (code != null && suffix != null) {
                country.name.common to (code + suffix)
            } else null
        }.sortedBy { it.first } //sort alphabetically
    } catch (e:Exception){
        Log.e("API", "Error fetching countries", e)
        emptyList()
    }
}
