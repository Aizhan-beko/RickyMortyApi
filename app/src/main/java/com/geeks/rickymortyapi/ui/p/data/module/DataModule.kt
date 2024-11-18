package com.geeks.rickymortyapi.ui.p.data.module


import com.geeks.rickymortyapi.ui.p.network.RickAndMortyApi
import com.geeks.rickymortyapi.ui.p.repository.RickAndMortyRepository
import com.geeks.rickymortyapi.ui.p.screen.character.viewmodel.CharactersViewModel
import com.geeks.rickymortyapi.ui.p.screen.episode.viewmodel.EpisodesViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val appModule = module {

    single { Retrofit.Builder()
        .baseUrl("https://rickandmortyapi.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(RickAndMortyApi::class.java)
    }

    single { RickAndMortyRepository(get()) }

    viewModel { CharactersViewModel(get()) }

    viewModel { EpisodesViewModel(get()) }
}