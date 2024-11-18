package com.geeks.rickymortyapi.ui.p.network
import com.geeks.rickymortyapi.ui.p.data.characters.SingleCharacter
import com.geeks.rickymortyapi.ui.p.data.episodes.Episode
import retrofit2.http.GET
import retrofit2.http.Path


interface RickAndMortyApi {

    @GET("api/character")
    suspend fun getCharacters(): List<SingleCharacter>


    @GET("api/character/{id}")
    suspend fun getCharacterById(@Path("id") id: Int): SingleCharacter


    @GET("api/episode/{id}")
    suspend fun getEpisode(@Path("id") id: Int): Episode

    @GET("api/episode")
    suspend fun getEpisodes(): List<Episode>
}