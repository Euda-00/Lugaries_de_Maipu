package com.example.lugariesdemaipu.ui.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.lugariesdemaipu.R
import com.example.lugariesdemaipu.data.DatosMaipu
import com.example.lugariesdemaipu.ui.components.CategoriaCard
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.lugariesdemaipu.ui.screens.home.HomeViewModel
import com.example.lugariesdemaipu.ui.components.LugarItem

@Composable
fun HomeScreen(
    navController: NavController,
    // --- ARREGLO 1: Inyectar el ViewModel ---
    viewModel: HomeViewModel = viewModel()
) {
    // --- ARREGLO 2: Obtener la lista desde el ViewModel ---
    val localesDestacados = viewModel.localesDestacados

    // Usamos LazyColumn para que toda la pantalla tenga scroll
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        // --- 1. Nombre del Proyecto ---
        item {
            Text(
                text = "LOS LUGARES DE MAIPÚ",
                style = MaterialTheme.typography.headlineLarge,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            )
        }

        // --- 2. Imagen (Templo) ---
        item {
            Image(
                painter = painterResource(id = R.drawable.templo_maipu),
                contentDescription = "Templo Votivo de Maipú",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(400.dp)
                    .padding(horizontal = 16.dp) // Padding solo a los lados
                    .clip(RoundedCornerShape(16.dp))
            )
        }

        item {
            Text(
                text = "Categorías",
                style = MaterialTheme.typography.headlineMedium,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, top = 24.dp, bottom = 8.dp)
            )
        }

        // --- 3. ¡AQUÍ VA LA FILA HORIZONTAL DE CATEGORÍAS! ---
        item {

            Spacer(modifier = Modifier.padding(8.dp))
            LazyRow(
                modifier = Modifier.fillMaxWidth(),
                contentPadding = PaddingValues(horizontal = 8.dp),
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ) {

                items(DatosMaipu.listaCategorias) { categoria ->
                    // se usa el mismo CategoriaCard
                    CategoriaCard(
                        nombre = categoria.nombre,
                        icono = categoria.icono,
                        onClick = {
                            navController.navigate("locales/${categoria.nombre}")
                        }
                    )
                }
            }
        }

        // --- 4. ¡AQUÍ VA LOS LOCALES DESTACADOS! ---
        item {
            Text(
                text = "Destacados de la Comuna",
                style = MaterialTheme.typography.headlineMedium,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, top = 24.dp, bottom = 8.dp)
            )
        }

        items(localesDestacados) { lugar ->
            LugarItem(
                lugar = lugar,
                onItemClick = {
                    navController.navigate("detalle/${lugar.id}")
                },
                    modifier = Modifier.padding(5.dp)
            )
        }

        item {
            Spacer(modifier = Modifier.height(12.dp))
        }
    }
}