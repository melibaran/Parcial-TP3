package com.example.clase5.infrastructure.api

import com.google.gson.annotations.SerializedName

//mapeo los atributos importantes del JSON q recibi/los q necesito
data class CharacterDTO(
    @SerializedName("id") val id: Int,
    @SerializedName("name") val name: String,
    @SerializedName( "status") val status: String,
    @SerializedName("image") val imageUrl: String,
)
