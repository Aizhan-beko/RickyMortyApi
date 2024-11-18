package com.geeks.rickymortyapi.ui.p.screen.episode.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.geeks.rickymortyapi.ui.p.data.episodes.Episode
import com.geeks.rickymortyapi.ui.p.repository.RickAndMortyRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class EpisodesViewModel(private val repository: RickAndMortyRepository) : ViewModel() {

    private val _episodes = MutableStateFlow<List<Episode>>(emptyList())
    val episodes: StateFlow<List<Episode>> = _episodes

    private val _selectedEpisode = MutableStateFlow<Episode?>(null)
    val selectedEpisode: StateFlow<Episode?> = _selectedEpisode


    fun getEpisodes() {
        viewModelScope.launch {
            _episodes.value = repository.getEpisodes()
        }
    }

    fun getEpisodeById(id: Int) {
        viewModelScope.launch {
            _selectedEpisode.value = repository.getEpisodeById(id)
        }
    }
}