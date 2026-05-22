package com.acalidonio.labo4pdm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.acalidonio.labo4pdm.navigation.MainNavigation
import com.acalidonio.labo4pdm.ui.theme.Labo4PDMTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Labo4PDMTheme {
                MainNavigation()
            }
        }
    }
}