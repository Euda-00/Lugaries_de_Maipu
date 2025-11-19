package com.example.lugariesdemaipu.ui

// 1. AGREGAMOS ESTOS IMPORTS PARA LA ANIMACIÓN
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.scaleIn
import androidx.compose.animation.scaleOut
import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.lugariesdemaipu.ui.screens.detail.DetailScreen
import com.example.lugariesdemaipu.ui.screens.home.CategoryListScreen
import com.example.lugariesdemaipu.ui.screens.home.HomeScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "home"
    ) {

        // --- HOME ---
        composable(route = "home") {
            HomeScreen(navController = navController)
        }

        // --- LISTA DE LOCALES (Con Animación Zoom) ---
        composable(
            route = "locales/{categoria}",
            arguments = listOf(
                navArgument("categoria") { type = NavType.StringType }
            ),
            // Animación al entrar: Crece del 80% al 100%
            enterTransition = {
                scaleIn(initialScale = 0.5f, animationSpec = tween(800)) + fadeIn(tween(800))
            },
            // Animación al salir: Se achica
            popExitTransition = {
                scaleOut(targetScale = 0.5f, animationSpec = tween(800)) + fadeOut(tween(800))
            }
        ) { backStackEntry ->
            val categoria = backStackEntry.arguments?.getString("categoria").orEmpty()
            CategoryListScreen(
                navController = navController,
                categoryName = categoria
            )
        }

        // --- DETALLE (Con Animación Zoom) ---
        composable(
            route = "detail/{lugarId}", // Coincide con el código de tus compañeros
            arguments = listOf(navArgument("lugarId") { type = NavType.StringType }),

            // Misma animación de Zoom
            enterTransition = {
                scaleIn(initialScale = 0.5f, animationSpec = tween(800)) + fadeIn(tween(800))
            },
            popExitTransition = {
                scaleOut(targetScale = 0.5f, animationSpec = tween(800)) + fadeOut(tween(800))
            }
        ) { backStackEntry ->
            val lugarId = backStackEntry.arguments?.getString("lugarId")
            requireNotNull(lugarId) { "lugarId parameter wasn't found." }

            // Llamamos a la pantalla de detalle
            DetailScreen(lugarId = lugarId)
        }
    }
}