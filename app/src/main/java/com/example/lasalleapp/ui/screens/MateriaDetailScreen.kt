package com.example.lasalleapp.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.lasalleapp.utils.materias

@Composable
fun MateriaDetailScreen(paddingValues: PaddingValues, materiaId: Int){
    val materia = materias.first{ it.id == materiaId}
    Column (
        modifier = Modifier.fillMaxSize().padding(paddingValues)
    ){
        Text(text = materia.nombre)
    }
}