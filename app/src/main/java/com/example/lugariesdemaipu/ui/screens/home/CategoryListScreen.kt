package com.example.lugariesdemaipu.ui.screens.home

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.lugariesdemaipu.data.DatosMaipu
import com.example.lugariesdemaipu.data.model.Lugar

@Composable
fun CategoryListScreen(
    navController: NavController,
    categoryName: String
) {
    // 1) Palabras clave por categoría "top" (en inglés, visibles en Home)
    val categoryMap = mapOf(
        "Sports" to listOf(
            "Deportes", "Canchas", "Gimnasios", "Plazas", "Parques",
            "Senderos", "Zonas verdes", "Piscina", "Skate", "Recreación"
        ),
        "Food" to listOf(
            "Comida", "Restaurante", "Picadas", "Comida rápida",
            "Cafetería", "Heladería"
        ),
        "Events" to listOf(
            "Eventos", "Feria", "Feria libre", "Feria artesanal", "Conciertos", "Fiestas"
        ),
        "Commerce" to listOf(
            "Comercio", "Comercio local", "Tramites", "Notarias", "Artesanía", "Mercado"
        ),
        "Culture" to listOf(
            "Cultura", "Museos", "Monumentos", "Iglesias", "Patrimonio", "Turismo"
        ),
        "Entertainment" to listOf(
            "Entretenimiento", "Cine", "Teatro", "Vida nocturna", "Juegos"
        )
    )

    // 2) Obtén claves para la categoría tocada
    val keys = categoryMap[categoryName] ?: listOf(categoryName)

    // 3) Filtra lugares por coincidencia en categoría o subcategoría
    val lugaresDeCategoria = remember(categoryName) {
        DatosMaipu.listaDeLugares.filter { lugar ->
            val cat = lugar.categoria.lowercase()
            val sub = lugar.subcategoria.lowercase()
            keys.any { k ->
                val key = k.lowercase()
                cat.contains(key) || sub.contains(key)
            }
        }
    }

    // 4) Subcategorías únicas + "All"
    val subcats = remember(lugaresDeCategoria) {
        val uniques = lugaresDeCategoria.map { it.subcategoria }.toSet().toList().sorted()
        listOf("All") + uniques
    }

    var subcatSeleccionada by remember { mutableStateOf("All") }

    // 5) Lista filtrada según chip activo
    val listaFiltrada: List<Lugar> = remember(lugaresDeCategoria, subcatSeleccionada) {
        if (subcatSeleccionada == "All") lugaresDeCategoria
        else lugaresDeCategoria.filter { it.subcategoria.equals(subcatSeleccionada, ignoreCase = true) }
    }

    // 6) UI
    Scaffold(
        topBar = {
            Column(Modifier.fillMaxWidth().padding(16.dp)) {
                Text(
                    text = categoryName,
                    style = MaterialTheme.typography.titleLarge
                )
                Spacer(Modifier.height(8.dp))
                LazyRow(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    items(subcats) { label ->
                        FilterChip(
                            selected = subcatSeleccionada == label,
                            onClick = { subcatSeleccionada = label },
                            label = { Text(label) }
                        )
                    }
                }
            }
        }
    ) { inner ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(inner)
                .padding(horizontal = 16.dp, vertical = 8.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(listaFiltrada) { lugar ->
                // Usa tu componente existente
                com.example.lugariesdemaipu.ui.components.LugarItem(
                    lugar = lugar,
                    onItemClick = { navController.navigate("detail/${lugar.id.toString()}") },
                    modifier = Modifier.fillMaxWidth()
                )
            }
            if (listaFiltrada.isEmpty()) {
                item {
                    Text(
                        "No hay lugares para “$subcatSeleccionada”.",
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
            }
        }
    }
}
