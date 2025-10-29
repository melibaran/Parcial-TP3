package com.example.clase5.infrastructure.api

import retrofit2.Response
import retrofit2.http.GET
import com.example.clase5.infrastructure.api.CharactersResponse

//Interface que se debe crear para consumir una API con Retrofit
interface CharactersApi {
    @GET(value = "character")
    suspend fun getCharacters(): Response<CharactersResponse<CharacterDTO>>

   /* @GET(value = "location")
    suspend fun getLocation(): Response<LocationResponse<LocationDTO>*/

    /* @GET(value = "location")
    suspend fun getEpisode(): Response<EpisodeResponse<EpisodeDTO>*/
}