package com.example.lugariesdemaipu.ui.screens.detail

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.lugariesdemaipu.ui.screens.detail.DetailViewModel
import com.example.lugariesdemaipu.Lugar
import com.example.lugariesdemaipu.R

@Composable
fun DetailScreen(viewModel: DetailViewModel = viewModel(), lugarId: Int) {
    viewModel.getLugar(lugarId)
    val uiState by viewModel.uiState.collectAsState()

    DetailContent(lugar = uiState.lugar)
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailContent(lugar: Lugar?) {
    lugar?.let { 
        Column(modifier = Modifier.fillMaxSize()) {
            Image(
                painter = painterResource(id = R.drawable.placeholder_image),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp),
                contentScale = ContentScale.Crop
            )

            Column(modifier = Modifier.padding(16.dp)) {
                Text(text = it.nombre, style = MaterialTheme.typography.headlineMedium)
                Text(text = it.categoria, style = MaterialTheme.typography.bodyMedium)

                Spacer(modifier = Modifier.height(16.dp))

                Card(modifier = Modifier.fillMaxWidth()) {
                    Column(modifier = Modifier.padding(16.dp)) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Icon(painter = painterResource(id = R.drawable.ic_clock), contentDescription = null)
                            Spacer(modifier = Modifier.width(8.dp))
                            Text(text = it.horario)
                        }
                        Spacer(modifier = Modifier.height(8.dp))
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Icon(painter = painterResource(id = R.drawable.ic_location), contentDescription = null)
                            Spacer(modifier = Modifier.width(8.dp))
                            Text(text = it.direccion)
                        }
                    }
                }

                Spacer(modifier = Modifier.height(16.dp))

                Text(text = "About", style = MaterialTheme.typography.headlineSmall)
                Text(text = it.descripcion, style = MaterialTheme.typography.bodyMedium)

                Spacer(modifier = Modifier.height(16.dp))

                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceAround) {
                    Button(onClick = { /*TODO*/ }) {
                        Text(text = "Call")
                    }
                    Button(onClick = { /*TODO*/ }) {
                        Text(text = "Website")
                    }
                }

                Spacer(modifier = Modifier.height(16.dp))

                Text(text = "Gallery", style = MaterialTheme.typography.headlineSmall)
                // Aquí puedes agregar una galería de imágenes
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DetailScreenPreview() {
    val dummyLugar = Lugar(
        id = 1,
        nombre = "Bodega Tempus Alba",
        categoria = "Winery",
        subcategoria = "",
        horario = "Open now, Closes 5:00 PM",
        direccion = "Perito Moreno 572, M5543 Maipú, Mendoza",
        descripcion = "A family winery with a long tradition in Maipú. Tempus Alba is known for its high-quality Malbec and Cabernet Sauvignon. Visitors can enjoy guided tours, wine tastings, and a restaurant with stunning views of the Andes. The modern architecture blends seamlessly with the surrounding vineyards, offering a unique and memorable experience.",
        imagen = ""
    )
    DetailContent(lugar = dummyLugar)
}
