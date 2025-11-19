package com.example.lugariesdemaipu.ui.screens.detail

import android.content.Intent
import android.net.Uri
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.lugariesdemaipu.data.DatosMaipu
import com.example.lugariesdemaipu.data.model.Lugar
import com.example.lugariesdemaipu.R

@Composable
fun DetailScreen(viewModel: DetailViewModel = viewModel(), lugarId: String) {
    viewModel.getLugar(lugarId)
    val uiState by viewModel.uiState.collectAsState()

    DetailContent(lugar = uiState.lugar)
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailContent(lugar: Lugar?) {
    val context = LocalContext.current
    lugar?.let {
        Column(modifier = Modifier.fillMaxSize()) {
            Image(
                painter = painterResource(id = it.imagen),
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

                Spacer(modifier = Modifier.height(64.dp))

                Text(text = "Descripción", style = MaterialTheme.typography.headlineSmall)
                Text(text = it.descripcion, style = MaterialTheme.typography.bodyMedium)

                Spacer(modifier = Modifier.height(128.dp))

                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceAround) {

                    Button(onClick = {
                        val gmmIntentUri = Uri.parse("geo:0,0?q=${it.direccion}")
                        val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
                        mapIntent.setPackage("com.google.android.apps.maps")
                        context.startActivity(mapIntent)
                    }) {
                        Text(text = "Ir a Google Maps")
                    }
                }

                Spacer(modifier = Modifier.height(16.dp))


            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DetailScreenPreview() {
    val dummyLugar = DatosMaipu.listaDeLugares.first()
    DetailContent(lugar = dummyLugar)
}
