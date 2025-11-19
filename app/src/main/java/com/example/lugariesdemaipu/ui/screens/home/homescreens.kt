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
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.lugariesdemaipu.R
import com.example.lugariesdemaipu.data.DatosMaipu
import com.example.lugariesdemaipu.ui.components.CategoriaCard
import com.example.lugariesdemaipu.ui.components.LugarItem
import com.example.lugariesdemaipu.ui.screens.home.HomeViewModel

@Composable
fun HomeScreen(
    navController: NavController,
    viewModel: HomeViewModel = viewModel()
) {
    val localesDestacados = viewModel.localesDestacados

    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Título
        item {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 24.dp, bottom = 16.dp),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.logo_maipu),
                    contentDescription = "Logo Lugares de Maipú",
                    modifier = Modifier
                        .height(60.dp)
                        .fillMaxWidth(),
                    contentScale = ContentScale.Fit
                )
            }
        }

        // Imagen grande
        item {
            Image(
                painter = painterResource(id = R.drawable.templo_maipu),
                contentDescription = "Templo Votivo de Maipú",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(400.dp)
                    .padding(horizontal = 16.dp)
                    .clip(RoundedCornerShape(16.dp))
            )
        }

        // Título categorías
        item {
            Text(
                text = "Categorías",
                style = MaterialTheme.typography.headlineMedium,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, top = 24.dp, bottom = 8.dp)
            )
        }

        // Carrusel de categorías
        item {
            Spacer(modifier = Modifier.padding(8.dp))
            LazyRow(
                modifier = Modifier.fillMaxWidth(),
                contentPadding = PaddingValues(horizontal = 8.dp),
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                items(DatosMaipu.listaCategorias) { categoria ->
                    CategoriaCard(
                        nombre = categoria.nombre,
                        icono = categoria.icono,
                        onClick = {
                            // 👉 Navega a la pantalla de lista por categoría
                            navController.navigate("locales/${categoria.nombre}")
                        }
                    )
                }
            }
        }

        // Título destacados
        item {
            Text(
                text = "Destacados de la Comuna",
                style = MaterialTheme.typography.headlineMedium,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, top = 24.dp, bottom = 8.dp)
            )
        }

        // Lista de destacados
        items(localesDestacados) { lugar ->
            LugarItem(
                lugar = lugar,
                onItemClick = { navController.navigate("detail/${lugar.id.toString()}") },
                modifier = Modifier.padding(5.dp)
            )
        }

        item { Spacer(modifier = Modifier.height(12.dp)) }
    }
}
