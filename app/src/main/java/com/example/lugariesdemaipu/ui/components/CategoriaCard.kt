package com.example.lugariesdemaipu.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

// Este es el "Composable" para un solo botón de la grilla
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CategoriaCard(
    nombre: String,
    icono: Int,
    onClick: () -> Unit
) {
    Card(
        onClick = onClick,
        modifier = Modifier
            .height(50.dp) // Mantenemos la altura
            .width(140.dp), // <-- ¡Lo hacemos un poco más angosto! (ajusta este valor)
        shape = RoundedCornerShape(16.dp)
    ) {
        Column(
            // ... (el resto del Column queda igual)
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Icon(
                painter = painterResource(id = icono),
                contentDescription = nombre,
                modifier = Modifier.size(20.dp)
            )
            Text(
                text = nombre,
                style = MaterialTheme.typography.titleMedium
            )
        }
    }
}