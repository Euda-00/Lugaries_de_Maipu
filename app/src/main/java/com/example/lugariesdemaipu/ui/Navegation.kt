package com.example.lugariesdemaipu.ui

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.lugariesdemaipu.ui.screens.home.HomeScreen

@Composable
fun AppNavigation() {
    // Esto crea el controlador que maneja el cambio de pantallas
    val navController = rememberNavController()

    // NavHost es el "mapa" que define todas las rutas (pantallas)
    NavHost(
        navController = navController,
        startDestination = "home" // <-- ¡AQUÍ LE DICES CUAL ES EL INICIO!
    ) {

        // Define la "ruta" para la pantalla Home
        composable(route = "home") {
            HomeScreen(navController = navController)
        }

        // --- MÁS ADELANTE AGREGAREMOS LAS OTRAS PANTALLAS ---

        // composable(route = "locales/{categoria}") { ... }
        // composable(route = "detalle/{lugarId}") { ... }
    }
}