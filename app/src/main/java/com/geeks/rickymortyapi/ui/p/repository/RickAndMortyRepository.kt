package com.geeks.rickymortyapi.ui.p.repository

import com.geeks.rickymortyapi.ui.p.data.characters.SingleCharacter
import com.geeks.rickymortyapi.ui.p.data.episodes.Episode
import com.geeks.rickymortyapi.ui.p.network.RickAndMortyApi

class RickAndMortyRepository(private val api: RickAndMortyApi) {


    suspend fun getCharacters(): List<SingleCharacter> {
        return api.getCharacters()
    }


    suspend fun getCharacterById(id: Int): SingleCharacter {
        return api.getCharacterById(id)
    }

    suspend fun getEpisodes(): List<Episode> {
        return api.getEpisodes()
    }


    suspend fun getEpisodeById(id: Int): Episode {
        return api.getEpisode(id)
    }
}