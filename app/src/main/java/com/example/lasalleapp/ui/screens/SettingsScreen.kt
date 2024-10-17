package com.example.lasalleapp.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.tooling.preview.Preview
import com.example.lasalleapp.R
import com.example.lasalleapp.ui.theme.LaSalleAppTheme
import androidx.compose.ui.unit.dp

@Composable
fun SettingsScreen(innerPadding : PaddingValues){
    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Box(
            modifier = Modifier.fillMaxWidth().background(MaterialTheme.colorScheme.primary)
        ){
            Image(
                painter = painterResource(id = R.drawable.logo), contentDescription = "logo",
                modifier = Modifier.height(80.dp).padding(start = 10.dp)
            )
        }
        Image(
            painter = painterResource(id = R.drawable.elbichofoto),
            contentDescription = "foto_alumno",
            modifier = Modifier
                .padding(top = 100.dp, bottom = 20.dp)
                .height(100.dp)
                .clip(CircleShape)
            )
        Text(text = "Cristiano Ronaldo dos Santos Aveiro")
        Text(text = "05/02/1985")
        Text(text = "lpr@lasallebajio.edu.mx")
        Box(
            modifier = Modifier
                .width(350.dp)
                .background(Color.Red)
        ){
            Row {
                Image(imageVector = Icons.Default.Lock, contentDescription = "lock")
                Text(text = "Cambiar contraseña")
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
        SettingsScreen(innerPadding = PaddingValues(0.dp))
    }
}