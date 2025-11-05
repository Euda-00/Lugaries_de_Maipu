package com.example.lugariesdemaipu.ui.screens.home

// Importa el ViewModel de AndroidX
import androidx.lifecycle.ViewModel
// Importa tu "array" de datos
import com.example.lugariesdemaipu.data.DatosMaipu
// Importa tu molde de Lugar
import com.example.lugariesdemaipu.data.model.Lugar

class HomeViewModel : ViewModel() {

    // 1. Declaramos la lista de locales destacados
    val localesDestacados: List<Lugar>

    // 2. 'init' es un bloque que se ejecuta apenas se crea el ViewModel
    init {
        // 3. Llamamos a nuestra función para que llene la lista
        localesDestacados = obtenerDestacadosAleatorios()
    }

    // 4. ESTA ES LA LÓGICA
    private fun obtenerDestacadosAleatorios(): List<Lugar> {

        // Agrupa todos los locales por su categoría (ej. "Food" -> [Local1, Local2], etc.)
        val localesAgrupados = DatosMaipu.listaDeLugares.groupBy { it.categoria }

        // De cada grupo (de cada categoría)...
        val localesAleatorios = localesAgrupados.mapNotNull { (categoria, listaDeLocales) ->
            // ...¡saca uno al azar! (.randomOrNull)
            listaDeLocales.randomOrNull()
        }

        return localesAleatorios
    }
}