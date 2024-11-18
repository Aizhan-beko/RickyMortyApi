package com.geeks.rickymortyapi.ui.p.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.geeks.rickymortyapi.ui.p.screen.main.MainScreen
import com.geeks.rickymortyapi.ui.p.theme.RickyMortyApiTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RickyMortyApiTheme {
                MainScreen()

            }
        }
    }
}