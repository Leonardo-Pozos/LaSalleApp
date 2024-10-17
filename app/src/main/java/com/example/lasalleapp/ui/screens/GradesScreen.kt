package com.example.lasalleapp.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.lasalleapp.R
import com.example.lasalleapp.ui.theme.LaSalleAppTheme

@Composable
fun GradesScreen(innerPadding : PaddingValues){
    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding)
    ){
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(MaterialTheme.colorScheme.primary)
        ){
            Image(
                painter = painterResource(id = R.drawable.logo), contentDescription = "logo",
                modifier = Modifier
                    .height(80.dp)
                    .padding(start = 10.dp)
            )
        }
        Text("Cristiano Ronaldo dos Santos Aveiro")
        Text("Carrera: Ingenieria de Software")
        Text("Semestre: 5to Semestre")
        Text(text = "Promedio: 9.7")
        Text(text = "Materias cursadas:")
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun GradesScreenPreview(){
    LaSalleAppTheme {
        GradesScreen(innerPadding = PaddingValues(0.dp))
    }
}