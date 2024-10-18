package com.example.lasalleapp.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.lasalleapp.R
import com.example.lasalleapp.ui.theme.LaSalleAppTheme
import com.example.lasalleapp.utils.Screens
import com.example.lasalleapp.utils.materias

@Composable
fun GradesScreen(innerPadding: PaddingValues, navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(MaterialTheme.colorScheme.primary)
        ) {
            Image(
                painter = painterResource(id = R.drawable.logo), contentDescription = "logo",
                modifier = Modifier
                    .height(80.dp)
                    .padding(start = 10.dp)
            )
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .offset(y = (-50).dp)
                .padding(start = 15.dp, top = 60.dp, end = 15.dp)
                .clip(RoundedCornerShape(16.dp))
                .background(MaterialTheme.colorScheme.onPrimary)
                .height(200.dp)
                .clickable { navController.navigate(Screens.ThemeChange.route) },
            contentAlignment = Alignment.Center
        ) {
            Column {
                Text(
                    "Leonardo Pozos Reyes",
                    modifier = Modifier.padding(start = 15.dp, end = 15.dp, top = 5.dp),
                    style = MaterialTheme.typography.titleSmall,
                    fontSize = 25.sp
                )
                Text(
                    "Carrera: Ingeniería de Software",
                    modifier = Modifier.padding(start = 15.dp, end = 15.dp, top = 15.dp),
                    fontSize = 20.sp
                )
                Text(
                    "Semestre: 5to Semestre",
                    modifier = Modifier.padding(start = 15.dp, end = 15.dp, top = 15.dp),
                    fontSize = 20.sp
                )
                Text(
                    text = "Promedio: 9.6",
                    modifier = Modifier.padding(start = 15.dp, top = 15.dp),
                    fontSize = 20.sp
                )
            }
        }
        Row(
            modifier = Modifier.padding(start = 20.dp, end = 20.dp)
        ) {
            Text(
                text = "Materias cursadas:",
                modifier = Modifier.weight(1f),
                fontSize = 20.sp,
                style = MaterialTheme.typography.bodyMedium
            )
            Text(
                text = "Promedio:",
                modifier = Modifier.padding(start = 15.dp).weight(.5f),
                fontSize = 20.sp
            )
        }
        LazyColumn(
            modifier = Modifier.padding(start = 35.dp, end = 15.dp)
        ) {
            items(materias) { materia ->
                Row(
                    modifier = Modifier.clickable { navController.navigate(Screens.MateriaDetail.route + "/${materia.id}") }
                ) {
                    Text(
                        text = materia.nombre,
                        modifier = Modifier.padding(top = 8.dp).weight(1f)
                    )
                    Text(
                        text = materia.promedio.toString(),
                        modifier = Modifier.padding(top = 8.dp).weight(.3f)
                    )
                }
            }
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun GradesScreenPreview() {
    LaSalleAppTheme {
        val navController = rememberNavController()
        GradesScreen(innerPadding = PaddingValues(0.dp), navController)
    }
}