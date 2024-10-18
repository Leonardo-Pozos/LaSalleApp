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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.example.lasalleapp.R
import com.example.lasalleapp.ui.theme.LaSalleAppTheme
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.lasalleapp.utils.Format_paint
import com.example.lasalleapp.utils.Screens

@Composable
fun SettingsScreen(innerPadding : PaddingValues, navController: NavController){
    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding),
        horizontalAlignment = Alignment.CenterHorizontally
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
        Box(modifier = Modifier
            .size(200.dp)
            .clip(CircleShape) // Aplica el CircleShape al Box para redondear completamente
        ) {
            Image(
                painter = painterResource(id = R.drawable.elbichofoto),
                contentDescription = "foto_alumno",
                modifier = Modifier
                    .padding(top = 20.dp, bottom = 20.dp)
                    .size(200.dp)
                    .clip(CircleShape) // También se asegura que la imagen sea circular
            )
        }

        Text(
            text = "Leonardo Pozos Reyes",
            style = MaterialTheme.typography.titleMedium,
            fontSize = 30.sp,
            modifier = Modifier
                .padding(top = 10.dp, start = 30.dp, end = 30.dp)
                .align(Alignment.CenterHorizontally),
            textAlign = TextAlign.Center
        )
        Text(
            text = "09/12/2003",
            modifier = Modifier.padding(top = 10.dp),
            style = MaterialTheme.typography.titleMedium,
            fontSize = 25.sp
        )
        Text(
            text = "lpr@lasallebajio.edu.mx",
            style = MaterialTheme.typography.titleMedium,
            fontSize = 25.sp,
            modifier = Modifier.padding(top = 10.dp)
        )
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .offset(y = (-50).dp)
                .padding(start = 24.dp, end = 24.dp, top = 100.dp, bottom = 20.dp)
                .clip(RoundedCornerShape(16.dp))
                .background(MaterialTheme.colorScheme.onPrimary)
                .height(80.dp)
                .clickable { navController.navigate(Screens.PasswordChange.route) },
            contentAlignment = Alignment.Center
        ){
            Row {
                Image(
                    imageVector = Icons.Default.Lock,
                    contentDescription = "lock",
                    modifier = Modifier.padding(end = 5.dp)
                )
                Text(text = "Cambiar contraseña", fontSize = 20.sp)
            }
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .offset(y = (-50).dp)
                .padding(horizontal = 24.dp)
                .clip(RoundedCornerShape(16.dp))
                .background(MaterialTheme.colorScheme.onPrimary)
                .height(80.dp)
                .clickable { navController.navigate(Screens.ThemeChange.route) },
            contentAlignment = Alignment.Center
        ){
            Row {
                Image(
                    imageVector = Format_paint,
                    contentDescription = "lock",
                    modifier = Modifier.padding(end = 5.dp)
                )
                Text(text = "Cambiar tema de la app", fontSize = 20.sp)
            }
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun SettingsScreenPreview(){
    LaSalleAppTheme {
        val navController = rememberNavController()
        SettingsScreen(innerPadding = PaddingValues(0.dp), navController)
    }
}