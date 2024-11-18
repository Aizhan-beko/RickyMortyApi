package com.geeks.rickymortyapi.ui.p.screen.character.detail

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import com.geeks.rickymortyapi.ui.p.screen.character.viewmodel.CharactersViewModel
import org.koin.androidx.compose.get

@Composable
fun CharacterDetailScreen(characterId: Int, viewModel: CharactersViewModel = get()) {

    LaunchedEffect(characterId) {
        viewModel.getCharacterById(characterId)
    }
    val character by viewModel.selectedCharacter.collectAsState()

    if (character == null) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            CircularProgressIndicator()
        }
    } else {
        character?.let {
            Column(modifier = Modifier.padding(16.dp)) {
                Text(text = "Name: ${it.name}", style = MaterialTheme.typography.h6)
                Text(text = "Status: ${it.status}")
                Text(text = "Species: ${it.species}")
                Text(text = "Gender: ${it.gender}")
                Text(text = "Origin: ${it.origin.name}")
                Text(text = "Location: ${it.location.name}")
                Image(
                    painter = rememberImagePainter(it.image),
                    contentDescription = "Image of ${it.name}",
                    modifier = Modifier.fillMaxWidth()
                )
            }
        }
    }
}
