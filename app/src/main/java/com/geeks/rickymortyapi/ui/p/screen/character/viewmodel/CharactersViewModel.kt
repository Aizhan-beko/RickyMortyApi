package com.geeks.rickymortyapi.ui.p.screen.character.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.geeks.rickymortyapi.ui.p.data.characters.SingleCharacter
import com.geeks.rickymortyapi.ui.p.repository.RickAndMortyRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch


class CharactersViewModel(private val repository: RickAndMortyRepository) : ViewModel() {

    private val _characters = MutableStateFlow<List<SingleCharacter>>(emptyList())
    val characters: StateFlow<List<SingleCharacter>> = _characters

    private val _selectedCharacter = MutableStateFlow<SingleCharacter?>(null)
    val selectedCharacter: StateFlow<SingleCharacter?> = _selectedCharacter


    fun getCharacters() {
        viewModelScope.launch {
            _characters.value = repository.getCharacters()
        }
    }

    fun getCharacterById(id: Int) {
        viewModelScope.launch {
            _selectedCharacter.value = repository.getCharacterById(id)
        }
    }
}