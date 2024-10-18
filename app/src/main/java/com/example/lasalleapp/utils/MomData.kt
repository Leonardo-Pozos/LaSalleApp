package com.example.lasalleapp.utils

import com.example.lasalleapp.models.Colegiatura
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
    Materia(1, "Matematicas", 9.6, 10.0, 10.0, 10.0, "Luis Miguel Lugo Martínez"),
    Materia(2, "Quimica", 9.8, 10.0, 9.5, 10.0, "Laura Paulina Badillo Canchola"),
    Materia(3, "Fisica", 5.0, 5.0, 5.0, 5.0, "Josué Edgar Caro Flores"),
    Materia(4, "Geografia", 9.7, 9.9, 9.8, 10.0, "Luis Enríque Cuellar Vivia"),
    Materia(5, "Historia", 6.9, 6.4, 8.1, 8.0, "Francisco Barrón Macías"),
    Materia(6, "Español", 9.7, 9.5, 10.0, 10.0, "Andrea Regalado Páramo"),
    Materia(7, "Civica y Etica", 7.5, 9.8, 9.4, 9.0, "Franca Luz López Rodríguez"),
    Materia(8, "Ingles", 6.0, 6.0, 5.9, 5.9, "Israel Milton Vázquez Flores"),
    Materia(9, "Frances", 10.0, 10.0, 10.0, 10.0, "Georgina Adalberta Cruz Hernández"),
    Materia(10, "Calculo", 9.5, 9.4, 10.0, 10.0, "Ricardo Miguel Sánchez Durán"),
)

val pagos = listOf(
    Colegiatura(1, "Enero", 2024, true),
    Colegiatura(2, "Febrero", 2024, true),
    Colegiatura(3, "Marzo", 2024, true),
    Colegiatura(4, "Abril", 2024, true),
    Colegiatura(5, "Mayo", 2024, true),
    Colegiatura(6, "Junio", 2024, true),
    Colegiatura(7, "Julio", 2024, true),
    Colegiatura(8, "Agosto", 2024, true),
    Colegiatura(9, "Septiembre", 2024, true),
    Colegiatura(10, "Octubre", 2024, true),
    Colegiatura(11, "Noviembre", 2024, false)
)

