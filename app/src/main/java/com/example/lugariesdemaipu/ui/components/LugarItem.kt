package com.example.lugariesdemaipu.ui.components
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward // <-- Asegúrate que sea ArrowForward
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.lugariesdemaipu.data.model.Lugar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LugarItem(
    lugar: Lugar,
    onItemClick: () -> Unit, // La acción al pinchar
    modifier: Modifier = Modifier // <-- ¡AQUÍ ESTÁ EL ARREGLO 1!
) {
    Card(
        onClick = onItemClick,
        modifier = modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp)
    ) {
        Row(
            modifier = Modifier.padding(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = lugar.imagen),
                contentDescription = lugar.nombre,
                modifier = Modifier
                    .size(50.dp)
                    .clip(CircleShape)
            )

            Spacer(modifier = Modifier.width(20.dp)) // Espacio

            // Columna para el texto
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = lugar.nombre,
                    style = MaterialTheme.typography.titleMedium
                )
                Text(
                    text = lugar.subcategoria, // O puedes poner lugar.direccion
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }

            Spacer(modifier = Modifier.width(16.dp))

            // Flechita
            Icon(
                imageVector = Icons.Default.ArrowForward,
                contentDescription = null,
                modifier = Modifier.size(16.dp),
                tint = MaterialTheme.colorScheme.onSurfaceVariant
            )
        }
    }
}