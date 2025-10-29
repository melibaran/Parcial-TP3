package com.example.parcial.infrastructure.api

/*
class CharacterImpl {

    private val retrofit: Retrofit = Retrofit
        .Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl(baseUrl = "https://rickandmortyapi.com/api/")
        .build()

    private val api = retrofit.create(CharactersApi::class.java)

    //Funcion suspend/async q permite llamar a la API y q se haga a la vez otra cosa (no bloquea)
    //le pide a la API los personajes y se devuelve una lista
    override suspend fun getAll(): List<Character>? {
        val response = api.getCharacters()

        return if (response.isSuccessful) {
        //si esta todoo bien, convertime la respuesta en model (toModel())
            val result response.body()?.toModel()
            if (result != null) {
                result
            } else {
                listof(Character("Not Found character", status = "Dead", imageUrl = ""))
            }
        } else {
            null

        }
    }
}*/
