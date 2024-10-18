package com.example.lasalleapp.utils

import com.example.lasalleapp.models.Community
import com.example.lasalleapp.models.Materia
import com.example.lasalleapp.models.News

val newsList = listOf(
    News(
        id = 1,
        title = "Evento de Construcción de la Paz",
        description = "La Salle Bajío realiza un foro para fomentar la construcción de la paz en la comunidad estudiantil.",
        image = "https://www.lasallebajio.edu.mx/noticias/images/4701_1.jpg"
    ),
    News(
        id = 2,
        title = "Conferencia de Liderazgo",
        description = "Una conferencia que destaca la importancia del liderazgo en la comunidad universitaria.",
        image = "https://www.lasallebajio.edu.mx/noticias/images/4701_2.jpg"
    ),
    News(
        id = 3,
        title = "Semana Cultural 2024",
        description = "Celebración anual de la Semana Cultural con diversas actividades artísticas y deportivas.",
        image = "https://www.lasallebajio.edu.mx/noticias/images/4701_3.jpg"
    )
)

val communities = listOf(
    Community(1,"https://www.lasallebajio.edu.mx/comunidad/images/tile_documentos_inspiradores.jpg"),
    Community(2, "https://www.lasallebajio.edu.mx/comunidad/images/tile_boletin.jpg"),
    Community(3, "https://www.lasallebajio.edu.mx/comunidad/images/tile_cat_souv_22.jpg"),
    Community(4, "https://www.lasallebajio.edu.mx/comunidad/images/tile_tramites.jpg"),
    Community(5, "https://www.lasallebajio.edu.mx/comunidad/images/tile_blog.jpg"),
)

val materias = listOf(
    Materia(1, "Matematicas", 9.6, 10.0, 10.0, 10.0),
    Materia(2, "Quimica", 9.8, 10.0, 9.5, 10.0),
    Materia(3, "Fisica", 10.0, 10.0, 10.0, 10.0),
    Materia(4, "Geografia", 9.7, 9.9, 9.8, 10.0),
    Materia(5, "Historia", 6.9, 6.4, 8.1, 8.0),
    Materia(6, "Español", 9.7, 9.5, 10.0, 10.0),
    Materia(7, "Civica y Etica", 7.5, 9.8, 9.4, 9.0),
    Materia(8, "Ingles", 9.0, 8.6, 8.3, 9.0),
    Materia(9, "Frances", 10.0, 10.0, 10.0, 10.0),
    Materia(10, "Calculo", 9.5, 9.4, 10.0, 10.0),
)

