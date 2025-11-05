package com.example.lugariesdemaipu

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.lugariesdemaipu.ui.AppNavigation // <-- ¡IMPORTA TU MAPA!

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
                AppNavigation()
        }
    }
}