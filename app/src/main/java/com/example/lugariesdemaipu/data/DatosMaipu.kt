package com.example.lugariesdemaipu.data

import com.example.lugariesdemaipu.data.model.Categoria
import com.example.lugariesdemaipu.data.model.Lugar
// Importa tu R para acceder a las imágenes
import com.example.lugariesdemaipu.R

object DatosMaipu {
    val listaCategorias: List<Categoria> = listOf(
        Categoria(nombre = "Deporte", icono = R.drawable.ic_sports),
        Categoria(nombre = "Comida", icono = R.drawable.ic_food),
        Categoria(nombre = "Ferias", icono = R.drawable.ic_events),
        Categoria(nombre = "Comercio", icono = R.drawable.ic_commerce),
        Categoria(nombre = "Cultura", icono = R.drawable.ic_culture),
        Categoria(nombre = "Entretenimiento", icono = R.drawable.ic_entertainment)
    )

    // Este es tu "array" principal de locales
    val listaDeLugares: List<Lugar> = listOf(

        // ====================================================================
        // --- 1. DATOS DE EUGENIO (COMIDA Y FERIAS) ---
        // ====================================================================

        // --- Categoría: Ferias -> Sub: Feria libre ---
        Lugar(
            id = "f1",
            nombre = "Feria Libre Maipu Poniente",
            categoria = "Ferias",
            subcategoria = "Feria libre",
            direccion = "Av. El Conquistador, Maipú",
            horario = "Martes y Viernes 9:00 am - 5:00 pm",
            descripcion = "Feria grande de barrio, productos varios de alimentación y comercio local",
            imagen = R.drawable.templo_maipu,
            latitud = 0.0,
            longitud = 0.0
        ),
        Lugar(
            id = "f2",
            nombre = "Feria 3 Poniente",
            categoria = "Ferias",
            subcategoria = "Feria libre",
            direccion = "Av. 3 Pte Entre Campanario y Av",
            horario = "Miercoles y Sabado",
            descripcion = "Feria tradicional del sector, productos agrícolas, alimentos frescos",
            imagen = R.drawable.templo_maipu,
            latitud = 0.0,
            longitud = 0.0
        ),
        Lugar(
            id = "f3",
            nombre = "Feria Las Parcelas",
            categoria = "Ferias",
            subcategoria = "Feria libre",
            direccion = "Maipu Av. las Parcelas 4273, maipú",
            horario = "Jueves de 9:00 16:00 y domingo de 9:00 - 17:00",
            descripcion = "Feria de barrio, productos de uso cotidiano.",
            imagen = R.drawable.templo_maipu,
            latitud = 0.0,
            longitud = 0.0
        ),
        Lugar(
            id = "f4",
            nombre = "Feria Las Naciones",
            categoria = "Ferias",
            subcategoria = "Feria libre",
            direccion = "En Las Naciones entre Av. Portales y cam. A Rinconada Huáscar, Maipú",
            horario = "?", // "Domingos por ver"
            descripcion = "Feria grande de barrio productos agrícolas, alimentos frescos, herramientas, etc.",
            imagen = R.drawable.templo_maipu,
            latitud = 0.0,
            longitud = 0.0
        ),
        Lugar(
            id = "f5",
            nombre = "Feria Padre Hurtado",
            categoria = "Ferias",
            subcategoria = "Feria libre",
            direccion = "Sta. María, Maipú, Región Metropolitana",
            horario = "martes, viernes",
            descripcion = "Feria donde se comercializan principalmente frutas y verduras, con alrededor de 221 puestos.",
            imagen = R.drawable.templo_maipu,
            latitud = 0.0,
            longitud = 0.0
        ),
        Lugar(
            id = "f6",
            nombre = "Feria Cuatro Álamos",
            categoria = "Ferias",
            subcategoria = "Feria libre",
            direccion = "Región Metropolitana", // Dirección genérica
            horario = "martes, viernes",
            descripcion = "Feria de barrio con venta de alimentos y productos de primera necesidad.",
            imagen = R.drawable.templo_maipu,
            latitud = 0.0,
            longitud = 0.0
        ),
        Lugar(
            id = "f7",
            nombre = "Feria Los Héroes",
            categoria = "Ferias",
            subcategoria = "Feria libre",
            direccion = "Hermógenes Pérez de Arce, 9275270 Maipú, Región Metropolitana",
            horario = "miercoles, sabado",
            descripcion = "Tradicional feria de barrio con productos frescos y abarrotes.",
            imagen = R.drawable.templo_maipu,
            latitud = 0.0,
            longitud = 0.0
        ),
        Lugar(
            id = "f8",
            nombre = "Feria Libertador Gral. Bernardo O'Higgins",
            categoria = "Ferias",
            subcategoria = "Feria libre",
            direccion = "En Libertador Gral. Bernardo O'Higgins entre El Olimpo y Av. de las Victoria",
            horario = "?", // "por ver"
            descripcion = "Feria de barrio, productos de uso cotidiano, agrícola, medicamentos, etc.",
            imagen = R.drawable.templo_maipu,
            latitud = 0.0,
            longitud = 0.0
        ),
        Lugar(
            id = "f9",
            nombre = "Feria La Gruta",
            categoria = "Ferias",
            subcategoria = "Feria libre",
            direccion = "En Gabriel Gonzalez Videla hasta Virgen de Guadalupe",
            horario = "?",
            descripcion = "Feria pequeña, productos de uso cotidiano, agrícola.",
            imagen = R.drawable.templo_maipu,
            latitud = 0.0,
            longitud = 0.0
        ),

        // --- Categoría: Ferias -> Sub: Feria artesanal ---
        Lugar(
            id = "f10",
            nombre = "Centro Artesanal Maipú",
            categoria = "Ferias",
            subcategoria = "Feria artesanal",
            direccion = "Av. 5 de Abril #273, Maipú",
            horario = "?", // "por ver"
            descripcion = "Feria permanente de locales artesanales, más de 30 puestos distintos.",
            imagen = R.drawable.templo_maipu,
            latitud = 0.0,
            longitud = 0.0
        ),
        Lugar(
            id = "f11",
            nombre = "Feria de las Artes",
            categoria = "Ferias",
            subcategoria = "Feria artesanal",
            direccion = "Plaza de Maipú",
            horario = "?",
            descripcion = "Feria temporal/artesanal con foodtrucks, música, puestos artesanales.",
            imagen = R.drawable.templo_maipu,
            latitud = 0.0,
            longitud = 0.0
        ),
        Lugar(
            id = "f12",
            nombre = "Feria de Emprendedores / Feria artesanal municipal",
            categoria = "Ferias",
            subcategoria = "Feria artesanal",
            direccion = "Plaza Maipu",
            horario = "Una vez al mes",
            descripcion = "Para productos hechos por artesanos locales / emprendedores. Feria con música, puestos artesanales y gastronómicos.",
            imagen = R.drawable.templo_maipu,
            latitud = 0.0,
            longitud = 0.0
        ),
        Lugar(
            id = "f13",
            nombre = "Feria Artesanal Maipú 4 Esquinas",
            categoria = "Ferias",
            subcategoria = "Feria artesanal",
            direccion = "Plaza 12 de Febrero, Maipú",
            horario = "?",
            descripcion = "Feria con música, puestos artesanales y gastronómicos.",
            imagen = R.drawable.templo_maipu,
            latitud = 0.0,
            longitud = 0.0
        ),
        Lugar(
            id = "f14",
            nombre = "Feria de artesanos La Farfana",
            categoria = "Ferias",
            subcategoria = "Feria artesanal",
            direccion = "Sector Villa La Farfana, Maipú",
            horario = "?",
            descripcion = "Feria local de artesanos, productos hechos a mano, ambiente de barrio.",
            imagen = R.drawable.templo_maipu,
            latitud = 0.0,
            longitud = 0.0
        ),

        // --- Categoría: Comida -> Sub: Picadas ---
        Lugar(
            id = "c1",
            nombre = "La Fuente Pajaritos",
            categoria = "Comida",
            subcategoria = "Picadas",
            direccion = "Av. Los Pajaritos 1433, 9250000 Maipú, Región Metropolitana",
            horario = "?", // "Por ver parece cerrado"
            descripcion = "una fuente de soda al estilo tradicional chileno, con platos caseros, sándwiches, carnes, pescá, etc.",
            imagen = R.drawable.templo_maipu,
            latitud = 0.0,
            longitud = 0.0
        ),
        Lugar(
            id = "c2",
            nombre = "Tía Lucy",
            categoria = "Comida",
            subcategoria = "Picadas",
            direccion = "StaElena 320, Maipú, Región Metropolitana",
            horario = "Lunes a sabado de 12:30pm a 2:00 Am",
            descripcion = "picada clásica muy reconocida en la comuna, con sandwiches, churrascos y comida casera abundante",
            imagen = R.drawable.templo_maipu,
            latitud = 0.0,
            longitud = 0.0
        ),
        Lugar(
            id = "c3",
            nombre = "Veneno Sudaka",
            categoria = "Comida",
            subcategoria = "Picadas",
            direccion = "Av. Los Pajaritos 2045, 9251495 Maipú, Región Metropolitana",
            horario = "Lunes a sábado de 12-8 p.m.",
            descripcion = "tacos callejeros con opciones interesantes como la especial de semana, ambiente informal.",
            imagen = R.drawable.templo_maipu,
            latitud = 0.0,
            longitud = 0.0
        ),
        Lugar(
            id = "c4",
            nombre = "CeaCHei",
            categoria = "Comida",
            subcategoria = "Picadas",
            direccion = "?", // "Por ver"
            horario = "?", // "por ver"
            descripcion = "local de comida al paso, famoso por sus completos, ventas tanto local como por delivery.",
            imagen = R.drawable.templo_maipu,
            latitud = 0.0,
            longitud = 0.0
        ),
        Lugar(
            id = "c5",
            nombre = "Carrito de 4 Álamos",
            categoria = "Comida",
            subcategoria = "Picadas",
            direccion = "Av. Segunda Transversal 899, Maipú, Región Metropolitana",
            horario = "?", // "por ver"
            descripcion = "carrito clásico de completos, con tradición en la comuna, característico por su orden particular de ingredientes",
            imagen = R.drawable.templo_maipu,
            latitud = 0.0,
            longitud = 0.0
        ),
        Lugar(
            id = "c6",
            nombre = "Sol & Sabor - Comida rapida",
            categoria = "Comida",
            subcategoria = "Picadas", // Lo clasifico como picada por la descripción
            direccion = "Av. 4 Pte. 214, 9274155 Maipú, Región Metropolitana",
            horario = "Lunes a jueves entre 5 pm a 12:30, viernes de 1 pm a 1 am, sábado 5 pm a 1 am, domingo 6 pm a 12 am",
            descripcion = "Local de comida rápida con variedad de sándwiches, completos y papas fritas.",
            imagen = R.drawable.templo_maipu,
            latitud = 0.0,
            longitud = 0.0
        ),
        Lugar(
            id = "c7",
            nombre = "LA FUENTE MAIPU P&H",
            categoria = "Comida",
            subcategoria = "Picadas",
            direccion = "Av. Los Pajaritos 404, 9253788 Maipú, Región Metropolitana",
            horario = "lunes a jueves de 12:30-11:30 p.m. viernes a sábado 12:30 p.m - 2:30 a.m. domingo, 1-11:30 p.m.",
            descripcion = "Fuente de soda con una amplia carta de sándwiches, chorrillanas y platos caseros.",
            imagen = R.drawable.templo_maipu,
            latitud = 0.0,
            longitud = 0.0
        ),
        Lugar(
            id = "c8",
            nombre = "Bajon donde el taz",
            categoria = "Comida",
            subcategoria = "Picadas",
            direccion = "Av. 3 Pte. 661, 9250000 Maipú, Región Metropolitana",
            horario = "lunes 11:30 a.m.-6 p.m. martes a jueves 11:30 a.m.-11 p.m. viernes, 11:30 a.m.-2 a.m. sábado, 1 p.m.-2 a.m. domingo, 4-10 p.m.",
            descripcion = "Picada conocida por sus contundentes preparaciones de comida rápida y sándwiches.",
            imagen = R.drawable.templo_maipu,
            latitud = 0.0,
            longitud = 0.0
        ),
        Lugar(
            id = "c9",
            nombre = "Picada Los Tejada",
            categoria = "Comida",
            subcategoria = "Picadas",
            direccion = "El Olimpo 1871, 9274573 Maipú, Región Metropolitana",
            horario = "lunes a sábado 2 p.m.-12 a.m. domingo, Cerrado",
            descripcion = "Picada familiar que ofrece comida casera chilena, ideal para almuerzos y cenas.",
            imagen = R.drawable.templo_maipu,
            latitud = 0.0,
            longitud = 0.0
        ),
        Lugar(
            id = "c10",
            nombre = "Rincón Alemán",
            categoria = "Comida",
            subcategoria = "Picadas",
            direccion = "Av. 5 de Abril 91, 9253776 Maipú, Región Metropolitana",
            horario = "lunes a sábado 10 a.m.-9 p.m. domingo, 10 a.m.-5 p.m.",
            descripcion = "Tradicional local maipucino, famoso por sus completos y sándwiches al estilo alemán.",
            imagen = R.drawable.templo_maipu,
            latitud = 0.0,
            longitud = 0.0
        ),

        // --- Categoría: Comida -> Sub: Restaurante ---
        Lugar(
            id = "c11",
            nombre = "Amaia restaurante",
            categoria = "Comida",
            subcategoria = "Restaurante",
            direccion = "Central Gonzalo Pérez Llona 348, 9250592 Maipú, Región Metropolitana",
            horario = "lunes a sábado 10 a.m.-11 p.m. domingo, 10 a.m.-8 p.m.",
            descripcion = "cocina chilena / latinoamericana, ambiente formal/moderado.",
            imagen = R.drawable.templo_maipu,
            latitud = 0.0,
            longitud = 0.0
        ),
        Lugar(
            id = "c12",
            nombre = "Parrilladas El Castillo",
            categoria = "Comida",
            subcategoria = "Restaurante",
            direccion = "Av. Coronel Santiago Bueras N° 182, 9250186 Maipú",
            horario = "Lunes a domingo",
            descripcion = "restaurante familiar con especialidad en carnes, ambiente amistoso y local accesible.",
            imagen = R.drawable.templo_maipu,
            latitud = 0.0,
            longitud = 0.0
        ),
        Lugar(
            id = "c13",
            nombre = "La Excedida",
            categoria = "Comida",
            subcategoria = "Restaurante",
            direccion = "Av. Portales 296, 9250000 Maipú, Región Metropolitana",
            horario = "lunes a jueves 12-9 p.m. viernes a sábado 12 p.m.-12 a.m. domingo, 12-5 p.m.",
            descripcion = "Restaurant de comida chilena conocido por sus platos abundantes y ambiente familiar.",
            imagen = R.drawable.templo_maipu,
            latitud = 0.0,
            longitud = 0.0
        ),
        Lugar(
            id = "c14",
            nombre = "Restaurants Adobos",
            categoria = "Comida",
            subcategoria = "Restaurante",
            direccion = "Av. Portales 1899, 5641235 Maipú, Región Metropolitana",
            horario = "lunes, martes, jueves 9 a.m.-9:30 p.m. viernes a sábado 9 a.m.-10:30 p.m. domingo, 9 a.m.-5 p.m. miércoles Cerrado",
            descripcion = "Especialidad en comida peruana, destacando sus adobos y platos típicos del país vecino.",
            imagen = R.drawable.templo_maipu,
            latitud = 0.0,
            longitud = 0.0
        ),
        Lugar(
            id = "c15",
            nombre = "Palmas Peruanas",
            categoria = "Comida",
            subcategoria = "Restaurante",
            direccion = "Arturo Moya Grau 326, 9273870 Maipú, Región Metropolitana",
            horario = "lunes a domingo 12-8:30 p.m.",
            descripcion = "Ofrece una variada carta de la gastronomía peruana, con ceviches, lomo saltado y otros clásicos.",
            imagen = R.drawable.templo_maipu,
            latitud = 0.0,
            longitud = 0.0
        ),
        Lugar(
            id = "c16",
            nombre = "Tao Restaurante",
            categoria = "Comida",
            subcategoria = "Restaurante",
            direccion = "Av. Los Pajaritos 2601, 9250749 Maipú, Región Metropolitana",
            horario = "lunes a sábado 12-10 p.m. domingo, 12-6:30 p.m.",
            descripcion = "Restaurant de comida china con una amplia variedad de platos para servir y llevar.",
            imagen = R.drawable.templo_maipu,
            latitud = 0.0,
            longitud = 0.0
        ),
        Lugar(
            id = "c17",
            nombre = "Chilenazo (Maipú)",
            categoria = "Comida",
            subcategoria = "Restaurante",
            direccion = "San Ramón 276, 9253065 Maipú, Región Metropolitana",
            horario = "Lunes a domingo",
            descripcion = "restaurante / parrillada con ambiente relajado, carnes, parrilla, terraza, modo de delivery y retiro.",
            imagen = R.drawable.templo_maipu,
            latitud = 0.0,
            longitud = 0.0
        ),
        Lugar(
            id = "c18",
            nombre = "Almuerzos Marysol",
            categoria = "Comida",
            subcategoria = "Restaurante",
            direccion = "El Carmen 1579, 9252022 Maipú, Región Metropolitana",
            horario = "lunes a viernes 12-4 p.m.",
            descripcion = "Local enfocado en menús de almuerzo caseros, ideal para una comida económica y sabrosa.",
            imagen = R.drawable.templo_maipu,
            latitud = 0.0,
            longitud = 0.0
        ),
        Lugar(
            id = "c19",
            nombre = "Ají Seco Maipú",
            categoria = "Comida",
            subcategoria = "Restaurante",
            direccion = "Manuel Rodríguez 1773, 9251812 Maipú, Región Metropolitana",
            horario = "lunes a sábado 12-10 p.m. domingo, 12-8 p.m.",
            descripcion = "Reconocido restaurante de comida peruana, con una carta que incluye desde ceviches hasta anticuchos.",
            imagen = R.drawable.templo_maipu,
            latitud = 0.0,
            longitud = 0.0
        ),

        // --- Categoría: Comida -> Sub: Comida rápida ---
        Lugar(
            id = "c20",
            nombre = "Kami Sushi 4 Poniente",
            categoria = "Comida",
            subcategoria = "Comida rápida",
            direccion = "Av. 4 Pte. 01253, Maipú, Región Metropolitana",
            horario = "Lunes a domingo de 12 pm 12 am",
            descripcion = "Local de sushi con una amplia variedad de rolls, promociones y opciones para compartir.",
            imagen = R.drawable.templo_maipu,
            latitud = 0.0,
            longitud = 0.0
        ),
        Lugar(
            id = "c21",
            nombre = "Ying Huang - Comida China y Sushi",
            categoria = "Comida",
            subcategoria = "Comida rápida",
            direccion = "Av. 4 Pte. 01392, 9275516 Maipú, Región Metropolitana",
            horario = "Lunes a domingo de 12 pm 12 am",
            descripcion = "Ofrece una fusión de comida china y sushi, ideal para quienes buscan variedad en un mismo lugar.",
            imagen = R.drawable.templo_maipu,
            latitud = 0.0,
            longitud = 0.0
        ),
        Lugar(
            id = "c22",
            nombre = "Wan Fu, Comida China",
            categoria = "Comida",
            subcategoria = "Comida rápida",
            direccion = "Av. 4 Pte. 01576, 9275449 Maipú, Región Metropolitana",
            horario = "Lunes a domingo de 12 am a 8 pm",
            descripcion = "Restaurant de comida china tradicional, con platos clásicos para llevar o consumir en el local.",
            imagen = R.drawable.templo_maipu,
            latitud = 0.0,
            longitud = 0.0
        ),
        Lugar(
            id = "c23",
            nombre = "Sandwicheria El maipucino",
            categoria = "Comida",
            subcategoria = "Comida rápida",
            direccion = "Nueva San Martín 1212, 9250000 Maipú, Región Metropolitana",
            horario = "lunes a jueves 12-11:30 p.m. viernes a sábado 12 p.m.-12:30 a.m",
            descripcion = "Especialistas en sándwiches chilenos, como churrascos y mechadas, en un ambiente informal.",
            imagen = R.drawable.templo_maipu,
            latitud = 0.0,
            longitud = 0.0
        ),
        Lugar(
            id = "c24",
            nombre = "Turbo Burger",
            categoria = "Comida",
            subcategoria = "Comida rápida",
            direccion = "Av. Portales 1329, 9271338 Maipú, Región Metropolitana",
            horario = "lunes a viernes 1 p.m.-12 a.m. sábado a domingo 2 p.m.-12 a.m.",
            descripcion = "Hamburguesería con opciones gourmet y clásicas, además de papas fritas y bebestibles.",
            imagen = R.drawable.templo_maipu,
            latitud = 0.0,
            longitud = 0.0
        ),
        Lugar(
            id = "c25",
            nombre = "El Maestro",
            categoria = "Comida",
            subcategoria = "Comida rápida",
            direccion = "Nueva San Martín 661, 9252999 Santiago, Maipú",
            horario = "lunes a sabado 11:30 a.m.-2 a.m. domingo 5:30 p.m.-1 a.m.",
            descripcion = "Famoso por sus sándwiches y completos, un clásico de la comida rápida en la comuna.",
            imagen = R.drawable.templo_maipu,
            latitud = 0.0,
            longitud = 0.0
        ),
        Lugar(
            id = "c26",
            nombre = "La Playa",
            categoria = "Comida",
            subcategoria = "Comida rápida",
            direccion = "Cuatro Alamos 393, 9250000 Maipú, Región Metropolitana",
            horario = "lunes a jueves 12 p.m.-2 a.m. viernes a sábado 12 p.m.-3 a.m. domingo, Cerrado",
            descripcion = "Local de comida rápida con una variada carta que incluye sandwiches, completos y chorrillanas.",
            imagen = R.drawable.templo_maipu,
            latitud = 0.0,
            longitud = 0.0
        ),
        Lugar(
            id = "c27",
            nombre = "Papalovers Chile",
            categoria = "Comida",
            subcategoria = "Comida rápida",
            direccion = "Alberto Llona 1383, Local 2, 9250000 Maipú",
            horario = "lunes a sábado 12-8 p.m. domingo, Cerrado",
            descripcion = "Especializados en papas fritas con diversas salsas y agregados, una opción diferente de comida rápida.",
            imagen = R.drawable.templo_maipu,
            latitud = 0.0,
            longitud = 0.0
        ),
        Lugar(
            id = "c28",
            nombre = "DOSPOR Comida Rapida",
            categoria = "Comida",
            subcategoria = "Comida rápida",
            direccion = "Av. Segunda Transversal 1585, 9251888 Maipú",
            horario = "lunes a sábado 8 a.m.-1 a.m. domingo, 2 p.m.-12 a.m.",
            descripcion = "Ofrecen una amplia variedad de comida rápida, desde sándwiches hasta platos preparados.",
            imagen = R.drawable.templo_maipu,
            latitud = 0.0,
            longitud = 0.0
        ),
        Lugar(
            id = "c29",
            nombre = "El Carrito de Cuatro Alamos",
            categoria = "Comida",
            subcategoria = "Comida rápida",
            direccion = "Av. Segunda Transversal 899, Maipú, Región Metropolitana",
            horario = "lunes a viernes 12-2 a.m sábado a domingo 12-6 a.m",
            descripcion = "Un ícono de Maipú, este carrito es famoso por sus completos y el sabor tradicional que lo caracteriza.",
            imagen = R.drawable.templo_maipu,
            latitud = 0.0,
            longitud = 0.0
        ),

        // --- Categoría: Comida -> Sub: Cafetería ---
        Lugar(
            id = "c30",
            nombre = "Auténtico Coffee Home",
            categoria = "Comida",
            subcategoria = "Cafetería",
            direccion = "Primera Transversal 1953, 9251682 Maipú",
            horario = "?", // "Por ver"
            descripcion = "café y té, ambiente tranquilo para comenzar el día.",
            imagen = R.drawable.templo_maipu,
            latitud = 0.0,
            longitud = 0.0
        ),
        Lugar(
            id = "c31",
            nombre = "Sabores Con Alma",
            categoria = "Comida",
            subcategoria = "Cafetería",
            direccion = "General Ordóñez 205, Maipú, Santiago",
            horario = "Lunes a sabado",
            descripcion = "cafetería / local de té, buen ambiente para reuniones ligeras.",
            imagen = R.drawable.templo_maipu,
            latitud = 0.0,
            longitud = 0.0
        ),
        Lugar(
            id = "c32",
            nombre = "Cafetería Madre Luna",
            categoria = "Comida",
            subcategoria = "Cafetería",
            direccion = "Carmen Luisa Correa 234, 9251809 Maipú",
            horario = "Lunes a sabado", // "(por ver)"
            descripcion = "cafetería petfriendly, ofrecen antojos dulces y salados.",
            imagen = R.drawable.templo_maipu,
            latitud = 0.0,
            longitud = 0.0
        ),
        Lugar(
            id = "c33",
            nombre = "Cafetería Indómito",
            categoria = "Comida",
            subcategoria = "Cafetería",
            direccion = "Central Gonzalo Pérez Llona 76, 9250586 Maipú",
            horario = "Lunes a domingo",
            descripcion = "cafetería / pastelería, distribuidora de productos de Pastelería Holz, ambiente acogedor.",
            imagen = R.drawable.templo_maipu,
            latitud = 0.0,
            longitud = 0.0
        ),
        Lugar(
            id = "c34",
            nombre = "Cafetería Cahve",
            categoria = "Comida",
            subcategoria = "Cafetería",
            direccion = "Primera Transversal 2227, Maipú, Región Metropolitana",
            horario = "lunes a viernes 9 a.m.-8 p.m. sábado a domingo 9:30 a.m.-1:30 p.m.",
            descripcion = "Cafetería de especialidad que ofrece una selección de granos y métodos de preparación.",
            imagen = R.drawable.templo_maipu,
            latitud = 0.0,
            longitud = 0.0
        ),
        Lugar(
            id = "c35",
            nombre = "Dulces Momentos caffé",
            categoria = "Comida",
            subcategoria = "Cafetería",
            direccion = "El Olimpo 355, 9271502 Maipú, Región Metropolitana",
            horario = "lunes a jueves 9 a.m.-9:30 p.m. viernes a domingo 10 a.m.-9 p.m.",
            descripcion = "Un lugar ideal para disfrutar de un café acompañado de pasteles, tortas y otros dulces.",
            imagen = R.drawable.templo_maipu,
            latitud = 0.0,
            longitud = 0.0
        ),
        Lugar(
            id = "c36",
            nombre = "Coffee on wheels",
            categoria = "Comida",
            subcategoria = "Cafetería",
            direccion = "Chacabuco 100, 8320000 Maipú, Región Metropolitana",
            horario = "lunes a viernes 9 a.m.-8 p.m. sábado, 10 a.m.-6 p.m.",
            descripcion = "Cafetería móvil que ofrece café de grano y otras bebidas calientes y frías para llevar.",
            imagen = R.drawable.templo_maipu,
            latitud = 0.0,
            longitud = 0.0
        ),
        Lugar(
            id = "c37",
            nombre = "Cafeteria La Canela",
            categoria = "Comida",
            subcategoria = "Cafetería",
            direccion = "Espacio urbano, 9251861 Maipú, Región Metropolitana",
            horario = "lunes a sábado 8:30 a.m.-8:30 p.m. domingo, 10 a.m.-7 p.m.",
            descripcion = "Ubicada en un centro comercial, es una opción cómoda para una pausa con café y algo dulce.",
            imagen = R.drawable.templo_maipu,
            latitud = 0.0,
            longitud = 0.0
        ),
        Lugar(
            id = "c38",
            nombre = "Coffee Culture Coffee Roasters",
            categoria = "Comida",
            subcategoria = "Cafetería",
            direccion = "Gral. Ordóñez 199, 9251542 Maipú, Región Metropolitana",
            horario = "lunes a viernes 10:30 a.m.-9 p.m. sábado, 4-9:30 p.m. domingo, Cerrado",
            descripcion = "Tostaduría y cafetería de especialidad, para los amantes del buen café.",
            imagen = R.drawable.templo_maipu,
            latitud = 0.0,
            longitud = 0.0
        ),
        Lugar(
            id = "c39",
            nombre = "Coffee Cure",
            categoria = "Comida",
            subcategoria = "Cafetería",
            direccion = "Primera Transversal 1953, 9251682 Maipú",
            horario = "lunes a viernes 8:30 a.m.-8 p.m. sábado, 9 a.m.-4 p.m. domingo, Cerrado",
            descripcion = "Ofrecen café de grano de alta calidad y una variedad de preparaciones para disfrutar en un ambiente moderno.",
            imagen = R.drawable.templo_maipu,
            latitud = 0.0,
            longitud = 0.0
        ),

        // --- Categoría: Comida -> Sub: Heladería ---
        Lugar(
            id = "c40",
            nombre = "frut",
            categoria = "Comida",
            subcategoria = "Heladería",
            direccion = "Manuel Rodríguez 2955, 9250689 Maipú, Región Metropolitana",
            horario = "Lunes a domingo de 11 am a 8:30 pm",
            descripcion = "lugar de dulces, waffles y helados, ambiente acogedor para postres.",
            imagen = R.drawable.templo_maipu,
            latitud = 0.0,
            longitud = 0.0
        ),
        Lugar(
            id = "c41",
            nombre = "Heladería Grido Rafael Riesco",
            categoria = "Comida",
            subcategoria = "Heladería",
            direccion = "Rafael Riesco Bernales 370, 9250220 Maipú",
            horario = "Lunes a domingo De 12 a 7:30 pm",
            descripcion = "cadena bastante conocida que ofrece helados tipo franquicia: variedad de sabores clásicos, opciones de pote grande, etc.",
            imagen = R.drawable.templo_maipu,
            latitud = 0.0,
            longitud = 0.0
        ),
        Lugar(
            id = "c42",
            nombre = "Máximo Helados Heladería y Pastelería",
            categoria = "Comida",
            subcategoria = "Heladería",
            direccion = "Av. Portales 2070, 9271375 Maipú, Región Metropolitana",
            horario = "Lunes a domingo de 12 a 8 pm",
            descripcion = "Heladería artesanal con una interesante variedad de sabores y también opciones de pastelería.",
            imagen = R.drawable.templo_maipu,
            latitud = 0.0,
            longitud = 0.0
        ),
        Lugar(
            id = "c43",
            nombre = "Teo Gelatos",
            categoria = "Comida",
            subcategoria = "Heladería",
            direccion = "Av. El Conquistador 803, 9273822 Maipú, Región Metropolitana",
            horario = "Lunes a domingo de 1 a 8 pm",
            descripcion = "los helados son buenos, sabor cuidado, variedad de sabores. Ambiente más relajado.",
            imagen = R.drawable.templo_maipu,
            latitud = 0.0,
            longitud = 0.0
        ),
        Lugar(
            id = "c44",
            nombre = "María Heladería y Comedor",
            categoria = "Comida",
            subcategoria = "Heladería",
            direccion = "Central Gonzalo Pérez Llona 300, Local A, 9250000 Maipú",
            horario = "martes a viernes 12:30-8 p.m. sábado a domingo 12:30-8 p.m.",
            descripcion = "Además de helados artesanales, ofrecen opciones de almuerzo y onces en un ambiente acogedor.",
            imagen = R.drawable.templo_maipu,
            latitud = 0.0,
            longitud = 0.0
        ),
        Lugar(
            id = "c45",
            nombre = "Heladeria SEBASTIÁN",
            categoria = "Comida",
            subcategoria = "Heladería",
            direccion = "9271703 Maipú, Región Metropolitana",
            horario = "lunes a domingo 12-7 p.m.",
            descripcion = "Heladería de barrio con sabores tradicionales y atención personalizada.",
            imagen = R.drawable.templo_maipu,
            latitud = 0.0,
            longitud = 0.0
        ),
        Lugar(
            id = "c46",
            nombre = "Dolce Delicia",
            categoria = "Comida",
            subcategoria = "Heladería",
            direccion = "Avenida Bosque Alto, Valle de Los Reyes &, Maipú",
            horario = "lunes a domingo 4:15-9 p.m.",
            descripcion = "Heladería y pastelería que ofrece productos artesanales, ideal para un postre o una once.",
            imagen = R.drawable.templo_maipu,
            latitud = 0.0,
            longitud = 0.0
        ),
        Lugar(
            id = "c47",
            nombre = "Chiro's",
            categoria = "Comida",
            subcategoria = "Heladería",
            direccion = "Chacabuco 226, local 2, Maipú, Región Metropolitana",
            horario = "lunes a viernes 11 a.m.-8 p.m. sábado, 12-6 p.m. domingo, Cerrado",
            descripcion = "Helados y paletas artesanales con sabores innovadores y de alta calidad.",
            imagen = R.drawable.templo_maipu,
            latitud = 0.0,
            longitud = 0.0
        ),
        Lugar(
            id = "c48",
            nombre = "Heladería Las Dulzuras de Eva Rosa",
            categoria = "Comida",
            subcategoria = "Heladería",
            direccion = "Av. 4 Pte. 2027, 9250000 Maipú, Región Metropolitana",
            horario = "lunes a domingo 2-10 p.m.",
            descripcion = "Heladería de barrio con una propuesta de sabores caseros y ambiente familiar.",
            imagen = R.drawable.templo_maipu,
            latitud = 0.0,
            longitud = 0.0
        ),
        Lugar(
            id = "c49",
            nombre = "La Aurora Heladeria y Pasteleria",
            categoria = "Comida",
            subcategoria = "Heladería",
            direccion = "Aurora de Chile 2486, 9276181 Maipú, Región Metropolitana",
            horario = "lunes a domingo 12-9 p.m.",
            descripcion = "Ofrecen una combinación de helados artesanales y una selección de productos de pastelería.",
            imagen = R.drawable.templo_maipu,
            latitud = 0.0,
            longitud = 0.0
        ),

        // ====================================================================
        // --- 2. DATOS DE JOAQUÍN (DEPORTES Y COMERCIO) ---
        // ====================================================================

        // --- Categoría: Deportes y Zonas verdes -> Sub: Plazas y parques ---
        Lugar(
            id = "d1",
            nombre = "Parque Municipal de maipú",
            categoria = "Deportes y Zonas verdes",
            subcategoria = "Plazas y parques",
            direccion = "Av. Pajaritos con Camino a Rinconada",
            horario = "Horario variado, Sáb 24h, Dom/Lun Cerrado", // Simplificado
            descripcion = "Cuenta con laguna artificial, anfiteatro al aire libre, juegos infantiles, canchas de fútbol y tenis, pistas de skate y áreas para picnic y asados,",
            imagen = R.drawable.templo_maipu,
            latitud = 0.0,
            longitud = 0.0
        ),
        Lugar(
            id = "d2",
            nombre = "Parque tres poniente",
            categoria = "Deportes y Zonas verdes",
            subcategoria = "Plazas y parques",
            direccion = "Av. Tres Poniente entre 3 y 4 Norte",
            horario = "abierto al público 24/7",
            descripcion = "Gran avenida que cuenta con áreas verdes extensas, juegos infantiles, pista de trote, canchas deportivas y estacionamiento",
            imagen = R.drawable.templo_maipu,
            latitud = 0.0,
            longitud = 0.0
        ),
        Lugar(
            id = "d3",
            nombre = "Parque el rosal",
            categoria = "Deportes y Zonas verdes",
            subcategoria = "Plazas y parques",
            direccion = "Referencia Parque el rosal con Isabel Riquelme",
            horario = "?", // "por investigar"
            descripcion = "Parque con 5 hectáreas de zona verde, cuenta con árboles nativos, plaza de juegos, mesas para picnic e iluminación nocturna",
            imagen = R.drawable.templo_maipu,
            latitud = 0.0,
            longitud = 0.0
        ),
        Lugar(
            id = "d4",
            nombre = "Plaza de armas de maipú",
            categoria = "Deportes y Zonas verdes",
            subcategoria = "Plazas y parques",
            direccion = "Centro de Maipú referencia metro Maipú",
            horario = "Abierto 24/7",
            descripcion = "Zona verde ubicada en el centro de maipú, recientemente con iluminación led y cercana a una gran cantidad de zonas comerciales y metro",
            imagen = R.drawable.templo_maipu,
            latitud = 0.0,
            longitud = 0.0
        ),
        Lugar(
            id = "d5",
            nombre = "Bandejón 5 de Abril",
            categoria = "Deportes y Zonas verdes",
            subcategoria = "Plazas y parques",
            direccion = "5 de abril a altura de Avenida Segunda transversal",
            horario = "Abierto 24/7",
            descripcion = "Plaza de área verde que cuenta con juegos para recreación infantil, espacio con implementos para realizar ejercicio físico, con estacionamiento, ideal para una salida familiar, disponible para mascotas",
            imagen = R.drawable.templo_maipu,
            latitud = 0.0,
            longitud = 0.0
        ),
        Lugar(
            id = "d6",
            nombre = "Parque Lineal - Las Torres, Maipú",
            categoria = "Deportes y Zonas verdes",
            subcategoria = "Plazas y parques",
            direccion = "Av. Las Torres 830, 9291106 Maipú, Región Metropolitana",
            horario = "Abierto 24/7",
            descripcion = "Extensión de área verde amplia ideal para caminatas, paseos y salidas con mascotas, cercano a esta existen distintas tiendas comerciales y lugares para comer o tomar cafe",
            imagen = R.drawable.templo_maipu,
            latitud = 0.0,
            longitud = 0.0
        ),
        Lugar(
            id = "d7",
            nombre = "Fuente de Agua Parque Pajaritos",
            categoria = "Deportes y Zonas verdes",
            subcategoria = "Plazas y parques",
            direccion = "Av. Los Pajaritos, Maipú, cercano a metro El Sol",
            horario = "Abierto 24/7",
            descripcion = "Zona de juegos infantiles con una pileta que se activa en el clima de verano, acceso con silla de ruedas y disponibilidad para mascotas",
            imagen = R.drawable.templo_maipu,
            latitud = 0.0,
            longitud = 0.0
        ),
        Lugar(
            id = "d8",
            nombre = "Parque El Rosal", // Nota: Nombre duplicado en doc, pero distinta info
            categoria = "Deportes y Zonas verdes",
            subcategoria = "Plazas y parques",
            direccion = "Desde el rosal con Av. presidente Jorge alessandri hasta el rosal con camino la farfana",
            horario = "Abierto 24/7",
            descripcion = "Extensa zona de parque que cuenta con juegos infantiles, zonas de deporte, canchas de basketball, skatepark, ciclovias, mesas de picnic, toboganes y zona comercial próxima...",
            imagen = R.drawable.templo_maipu,
            latitud = 0.0,
            longitud = 0.0
        ),
        Lugar(
            id = "d9",
            nombre = "Parque Pajaritos",
            categoria = "Deportes y Zonas verdes",
            subcategoria = "Plazas y parques",
            direccion = "Av. Los Pajaritos 87, Maipú, Región Metropolitana",
            horario = "Abierto 24/7",
            descripcion = "Zona verde extensa ubicada bajo línea de metro... cuenta con una ciclovía extensa, zonas de deporte y comercio próximo",
            imagen = R.drawable.templo_maipu,
            latitud = 0.0,
            longitud = 0.0
        ),

        // --- Categoría: Deportes y Zonas verdes -> Sub: Gimnasios ---
        Lugar(
            id = "d10",
            nombre = "Gimnasio Olímpico Fernando González",
            categoria = "Deportes y Zonas verdes",
            subcategoria = "Gimnasios",
            direccion = "Av. 5 de Abril 816, Maipú, Región Metropolitana",
            horario = "lunes a sábado 10 a. m.-9 p. m., domingo 9 a. m.-8:15 p. m.",
            descripcion = "Recinto dedicado al deporte y salud de la comuna, cuenta multicancha y talleres...",
            imagen = R.drawable.templo_maipu,
            latitud = 0.0,
            longitud = 0.0
        ),
        Lugar(
            id = "d11",
            nombre = "Gimnasio Santiago Bueras",
            categoria = "Deportes y Zonas verdes",
            subcategoria = "Gimnasios",
            direccion = "Av. 5 de Abril 0700",
            horario = "?", // "La disponibilidad dependerá..."
            descripcion = "Estadio de fútbol, atletismo y rugby, ofrece talleres como KICKBOXING YOGA PILATES...",
            imagen = R.drawable.templo_maipu,
            latitud = 0.0,
            longitud = 0.0
        ),
        Lugar(
            id = "d12",
            nombre = "Gimnasio Los Héroes",
            categoria = "Deportes y Zonas verdes",
            subcategoria = "Gimnasios",
            direccion = "Héctor Fuenzalida 2400",
            horario = "Talleres sujetos a disponibilidad horaria",
            descripcion = "KUN FU ZUMBA TENIS DE MESA KARATE KENPO Talleres: Futbolito, gimnasia adulto mayor...",
            imagen = R.drawable.templo_maipu,
            latitud = 0.0,
            longitud = 0.0
        ),

        // --- Categoría: Deportes y Zonas verdes -> Sub: Canchas deportivas ---
        Lugar(
            id = "d13",
            nombre = "Canchas Tres Poniente",
            categoria = "Deportes y Zonas verdes",
            subcategoria = "Canchas deportivas",
            direccion = "Tres Poniente / Rinconada",
            horario = "Disponible 24/7",
            descripcion = "Multicanchas para la realización de deportes como futbol, basketball, handball, volleyball, tenis, entradas liberadas abiertas a todo público",
            imagen = R.drawable.templo_maipu,
            latitud = 0.0,
            longitud = 0.0
        ),
        Lugar(
            id = "d14",
            nombre = "Piscina Municipal",
            categoria = "Deportes y Zonas verdes",
            subcategoria = "Canchas deportivas", // Se asimila
            direccion = "Maipú con Calle Bailén",
            horario = "Habilitada en periodo de verano comenzando a principios de diciembre de 2025",
            descripcion = "Espacio municipal que cuenta con una piscina olímpica y otra para menores de edad, cuenta con camarines y estacionamiento.",
            imagen = R.drawable.templo_maipu,
            latitud = 0.0,
            longitud = 0.0
        ),
        Lugar(
            id = "d15",
            nombre = "Pista de Patinaje y Centro de Eventos Los Toros",
            categoria = "Deportes y Zonas verdes",
            subcategoria = "Canchas deportivas", // Se asimila
            direccion = "Alberto Llona 1899",
            horario = "lunes a domingo de 10:00 a 22:00 durante las vacaciones de invierno",
            descripcion = "Pista de patinaje con iluminación LED y diámetro de 40 metros. Gradas con una capacidad aproximada de 1000 personas.",
            imagen = R.drawable.templo_maipu,
            latitud = 0.0,
            longitud = 0.0
        ),

        // --- Categoría: Deportes y Zonas verdes -> Sub: Zonas de tracking ---
        Lugar(
            id = "d16",
            nombre = "Cerro Primo de Rivera",
            categoria = "Deportes y Zonas verdes",
            subcategoria = "Zonas de tracking",
            direccion = "Anunciación, Maipú, Región Metropolitana",
            horario = "Lunes a Sabado de 7am a 20pm Domingos de 7am a 20:30pm",
            descripcion = "Parque tranquilo en una colina con vista al área de Maipú, jardines, senderos arbolados y una cruz grande.",
            imagen = R.drawable.templo_maipu,
            latitud = 0.0,
            longitud = 0.0
        ),

        // --- Categoría: Comercio local y Tramites -> Sub: Artesanía ---
        Lugar(
            id = "co1",
            nombre = "Centro de Artesanía Kunza",
            categoria = "Comercio local y Tramites",
            subcategoria = "Artesanía",
            direccion = "El Carmen 1985, 9251808 Maipú, Región Metropolitana",
            horario = "?", // "A investigacion"
            descripcion = "Trabajos de arte retratos, paisajes y pinturas al oleo clases de arte etc",
            imagen = R.drawable.templo_maipu,
            latitud = 0.0,
            longitud = 0.0
        ),
        Lugar(
            id = "co2",
            nombre = "Boulevard Insumos con Amor",
            categoria = "Comercio local y Tramites",
            subcategoria = "Artesanía",
            direccion = "Av. Los Pajaritos 2897, Local 5, 9250749 Maipú, Región Metropolitana",
            horario = "sábado 9 a.m.-9 p.m. domingo 9 a.m.-9 p.m. lunes 9 a.m.-9 p.m. martes 9 a.m.-9 p.m. miércoles 9 a.m.-9 p.m. jueves 9 a.m.-9 p.m. viernes 9 a.m.-9 p.m.",
            descripcion = "Tienda de insumos varios para manualidades",
            imagen = R.drawable.templo_maipu,
            latitud = 0.0,
            longitud = 0.0
        ),
        Lugar(
            id = "co3",
            nombre = "Figuras De Yeso y Cemento y Artículos Decorativos",
            categoria = "Comercio local y Tramites",
            subcategoria = "Artesanía",
            direccion = "Longitudinal 4487, 9292012 Maipú, Región Metropolitana",
            horario = "sábado 9 a.m.-7 p.m. domingo Cerrado lunes 9 a.m.-7 p.m. martes 9 a.m.-7 p.m. miércoles 9 a.m.-7 p.m. jueves 9 a.m.-7 p.m. viernes 9 a.m.-7 p.m.",
            descripcion = "Tienda de figuras variadas de yeso y cemento para decoraciones",
            imagen = R.drawable.templo_maipu,
            latitud = 0.0,
            longitud = 0.0
        ),
        Lugar(
            id = "co4",
            nombre = "Arterik",
            categoria = "Comercio local y Tramites",
            subcategoria = "Artesanía",
            direccion = "Alberto Llona 1724, L.35, 9251818 Maipú, Región Metropolitana",
            horario = "sábado Cerrado domingo Cerrado lunes 11 a.m.-6:30 p.m. martes 11 a.m.-6:30 p.m. miércoles 11 a.m.-6:30 p.m. jueves 11 a.m.-6:30 p.m. viernes 11 a.m.-6:30 p.m.",
            descripcion = "Tienda de artesania variada, esculturas, pinturas y otros",
            imagen = R.drawable.templo_maipu,
            latitud = 0.0,
            longitud = 0.0
        ),

        // --- Categoría: Comercio local y Tramites -> Sub: Notarias ---
        Lugar(
            id = "co5",
            nombre = "Primera Notaría Maipú - Santiago",
            categoria = "Comercio local y Tramites",
            subcategoria = "Notarias",
            direccion = "Gral. Ordóñez 155, Of 203, 9251545 Maipú, Región Metropolitana",
            horario = "sábado 9 a.m.-12:30 p.m. ... lunes 8:30 a.m.-4:30 p.m. ... viernes 8:30 a.m.-4:30 p.m.",
            descripcion = "Oficio ubicado a pasos de la Plaza de Maipú, con profesionales capacitados para prestar la asesoría...",
            imagen = R.drawable.templo_maipu,
            latitud = 0.0,
            longitud = 0.0
        ),
        Lugar(
            id = "co6",
            nombre = "Notaria 24 Sergio Martel",
            categoria = "Comercio local y Tramites",
            subcategoria = "Notarias",
            direccion = "Av. Esq. Blanca 0211, 9251819 Maipú, Región Metropolitana",
            horario = "sábado Abierto las 24 horas domingo Cerrado lunes 9 a.m.-4:30 p.m. ... viernes 9 a.m.-4:30 p.m.",
            descripcion = "Con años de experiencia y un equipo de profesionales altamente calificados...",
            imagen = R.drawable.templo_maipu,
            latitud = 0.0,
            longitud = 0.0
        ),
        Lugar(
            id = "co7",
            nombre = "Notaría Urenda",
            categoria = "Comercio local y Tramites",
            subcategoria = "Notarias",
            direccion = "Av. Los Pajaritos 4444, 9292236 Maipú, Región Metropolitana",
            horario = "sábado Cerrado domingo Cerrado lunes 8:30 a.m.-4:30 p.m. ... viernes 8:30 a.m.-3 p.m.",
            descripcion = "Don Marco Urenda Bilicic, Notario Titular... da la bienvenida a sus usuarios. Compraventas de vehiculos, Declaraciones Juradas, Certificados...",
            imagen = R.drawable.templo_maipu,
            latitud = 0.0,
            longitud = 0.0
        ),

        // ====================================================================
        // --- 3. DATOS DE JONATHAN (ENTRETENIMIENTO Y CULTURA) ---
        // ====================================================================

        // --- Categoría: Entretenimiento ---
        Lugar(
            id = "e1",
            nombre = "Monos climbing",
            categoria = "Entretenimiento",
            subcategoria = "Recreación familiar", // Asimilado
            direccion = "Bailén 2223, 9251451 Maipú, Región Metropolitana",
            horario = "Lunes a sábado 9 AM - 9PM",
            descripcion = "Centro deportivo, con muro de escalar",
            imagen = R.drawable.monos_climbing,
            latitud = 0.0,
            longitud = 0.0
        ),
        Lugar(
            id = "e2",
            nombre = "NitroXR GameCenter",
            categoria = "Entretenimiento",
            subcategoria = "centro de juegos",
            direccion = "Av. 5 de Abril 33, Local 34-8. 3er Piso, Maipú",
            horario = "Lunes a domingo 10 AM-6 PM",
            descripcion = "Centro de juegos con realidad y arriendo de PC Gamers",
            imagen = R.drawable.nitro_xr,
            latitud = 0.0,
            longitud = 0.0
        ),
        Lugar(
            id = "e3",
            nombre = "Salon de Pool jumoje",
            categoria = "Entretenimiento",
            subcategoria = "Vida nocturna", // Asimilado
            direccion = "Primera Transversal 2884, Maipú, Región Metropolitana",
            horario = "Lunes a sábado 10:30 am a 1:30 p.m., 4:30 a 11 p.m.",
            descripcion = "Salon de Pool",
            imagen = R.drawable.pool_jumoje,
            latitud = 0.0,
            longitud = 0.0
        ),
        Lugar(
            id = "e4",
            nombre = "Family Park",
            categoria = "Entretenimiento",
            subcategoria = "Recreación familiar",
            direccion = "San Juan de Chena 7, 9281442 Maipú, Región Metropolitana",
            horario = "Lunes a domingo 12 a 8 p.m.",
            descripcion = "Juegos electrónicos, juegos mecánicos, camas saltarinas, kinder parks y salas de cumpleaños",
            imagen = R.drawable.family_park,
            latitud = 0.0,
            longitud = 0.0
        ),
        Lugar(
            id = "e5",
            nombre = "Rally Kart",
            categoria = "Entretenimiento",
            subcategoria = "Recreación familiar",
            direccion = "Cmo. a Melipilla 15900, Maipú, Región Metropolitana",
            horario = "Lunes a domingo 10 a 7 p.m.",
            descripcion = "Pista de karting",
            imagen = R.drawable.rally_kart,
            latitud = 0.0,
            longitud = 0.0
        ),

        // --- Categoría: Cultura y turismo ---
        Lugar(
            id = "ct1",
            nombre = "Santuario Nacional de Maipú (Basílica de Nuestra Señora del Carmen)",
            categoria = "Cultura y turismo",
            subcategoria = "Monumentos",
            direccion = "El Carmen 1750, Maipú, Región Metropolitana",
            horario = "Lunes a domingo de 9:00 a 20:00 hrs.",
            descripcion = "Un monumento histórico y religioso que conmemora la Batalla de Maipú...",
            imagen = R.drawable.santuario_acional_de_maipu,
            latitud = 0.0,
            longitud = 0.0
        ),
        Lugar(
            id = "ct2",
            nombre = "Teatro Municipal de Maipú",
            categoria = "Cultura y turismo",
            subcategoria = "Cines y teatros",
            direccion = "Avenida Los Pajaritos # 2045",
            horario = "Lunes a jueves de 9:00 a 17:30 hrs. Viernes, de 9:00 a 16:00 hrs.",
            descripcion = "Teatro municipal, cuenta con variada cartelera mensual rotativa",
            imagen = R.drawable.teatro_municipal_de_maipu,
            latitud = 0.0,
            longitud = 0.0
        ),
        Lugar(
            id = "ct3",
            nombre = "Casa de la Cultura",
            categoria = "Cultura y turismo",
            subcategoria = "Museos", // Asimilado
            direccion = "Camino a Rinconada N° 2000",
            horario = "Lunes a jueves de 9:00 a 17:30 hrs. Viernes, de 9:00 a 16:00 hrs.",
            descripcion = "Casa cultural con diferentes actividades y eventos temporales",
            imagen = R.drawable.casa_de_la_cultura,
            latitud = 0.0,
            longitud = 0.0
        ),
        Lugar(
            id = "ct4",
            nombre = "Microcine Sala K Maipú",
            categoria = "Cultura y turismo",
            subcategoria = "Cines y teatros",
            direccion = "Avenida Los Pajaritos #2045",
            horario = "jueves a las 19:00 horas y sábado a las 16:00 y 19:00 horas",
            descripcion = "Sala de cine pública, cuenta con diferentes proyecciones y cartelera mensual",
            imagen = R.drawable.microcine_sala_k_maipu,
            latitud = 0.0,
            longitud = 0.0
        ),
        Lugar(
            id = "ct5",
            nombre = "Mirador del Santuario Nacional de Maipú",
            categoria = "Cultura y turismo",
            subcategoria = "Miradores",
            direccion = "El Carmen 1750, Maipú, Región Metropolitana",
            horario = "De martes a domingo Mañana: 10:00, 11:00 y 12:00 hrs Tarde: 15:00, 16:00 y 17:00 hrs",
            descripcion = "Mirador panorámico en la cúpula del Templo de Maipú",
            imagen = R.drawable.mirador_del_santuario_nacional_de_maipu,
            latitud = 0.0,
            longitud = 0.0
        ),
        Lugar(
            id = "ct6",
            nombre = "Museo del Carmen de Maipú",
            categoria = "Cultura y turismo",
            subcategoria = "Museos",
            direccion = "Cam. A Rinconada 700, Maipú, Región Metropolitana",
            horario = "Martes a sábado Ingreso: 10:00 a 14:00 h y 15:00 a 18:00 h",
            descripcion = "Museo conmemorativo de la batalla de Maipú y su contexto social, religioso-militar",
            imagen = R.drawable.museo_del_carmen_de_maipu,
            latitud = 0.0,
            longitud = 0.0
        ),
        Lugar(
            id = "ct7",
            nombre = "Biblioteca Municipal de Maipú",
            categoria = "Cultura y turismo",
            subcategoria = "Museos", // Asimilado
            direccion = "Alberto Llona 1921, Maipú, Región Metropolitana",
            horario = "lunes a viernes 8:30 am a 2 pm, 3-5:30 p.m. sábado, 10 a.m.-2 p.m.",
            descripcion = "Préstamos de libros y diversas actividades culturales",
            imagen = R.drawable.biblioteca_municipal_de_maipu,
            latitud = 0.0,
            longitud = 0.0
        )
    )

}