package com.geeks.rickymortyapi.ui.p.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.geeks.rickymortyapi.ui.p.screen.CharacterScreen
import com.geeks.rickymortyapi.ui.p.screen.EpisodeScreen


sealed class BottomBarItem(val route: String, val label: String) {
    data object Characters : BottomBarItem("character_screen", "Characters")
    data object Episodes : BottomBarItem("episode_screen", "Episodes")
}

@Composable
    fun NavHostSetup(navController: NavController) {
        NavHost(navController = navController as NavHostController, startDestination = BottomBarItem.Characters.route) {
            composable(BottomBarItem.Characters.route) { CharacterScreen() }
            composable(BottomBarItem.Episodes.route) { EpisodeScreen() }
        }
    }


