package com.example.parcial.infrastructure.api

import com.google.gson.annotations.SerializedName

//API (https://rickandmortyapi.com/api/character)

data class CharactersResponse<T>(

    @SerializedName(value = "results")
    val results: List<T>,

    @SerializedName(value = "info")
    val paginate: Paginado
){

    //convierte la respuesta en un model (crea un modelo Character, que funciona en la capa de )
/*    fun toModel() = results.map {
        Character(
            name = it.name,
            status it.status,
            imageUrl it.imageUrl,
        )
    }*/

}
