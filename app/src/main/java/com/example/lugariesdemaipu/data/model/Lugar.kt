package com.example.lugariesdemaipu.data.model

// Importamos esto para que sepa que 'imagen' es un ID de /res/drawable
import androidx.annotation.DrawableRes

// Esta es tu "data class" (el molde)
data class Lugar(
    val id: String,
    val nombre: String,
    val categoria: String, // "Comida", "Deportes", etc.
    val subcategoria: String, // "Picadas", "Canchas", etc.
    val direccion: String,
    val horario: String,
    val descripcion: String,
    @DrawableRes val imagen: Int, // El ID de la imagen en /res/drawable
    val latitud: Double,
    val longitud: Double
)