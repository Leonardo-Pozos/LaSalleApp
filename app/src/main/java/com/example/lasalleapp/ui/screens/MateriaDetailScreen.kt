package com.example.lasalleapp.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lasalleapp.R
import com.example.lasalleapp.ui.theme.LaSalleAppTheme
import com.example.lasalleapp.utils.Check_circle
import com.example.lasalleapp.utils.ErrorIcon
import com.example.lasalleapp.utils.Format_paint
import com.example.lasalleapp.utils.Screens
import com.example.lasalleapp.utils.materias

@Composable
fun MateriaDetailScreen(paddingValues: PaddingValues, materiaId: Int){
    val materia = materias.first{ it.id == materiaId}
    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(paddingValues),
    ){
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
        Text(
            text = materia.nombre,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(20.dp),
            style = MaterialTheme.typography.titleMedium,
            fontSize = 30.sp
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp)
        ){
            Text(
                text = "1er Parcial",
                modifier = Modifier.weight(0.2f),
                textAlign = TextAlign.Center,
                fontSize = 18.sp
            )
            Text(
                text = "2do Parcial",
                modifier = Modifier.weight(0.2f),
                textAlign = TextAlign.Center,
                fontSize = 18.sp
            )
            Text(
                text = "3er Parcial",
                modifier = Modifier.weight(0.2f),
                textAlign = TextAlign.Center,
                fontSize = 18.sp
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp)
        ){
            Text(
                text = materia.cal1P.toString(),
                modifier = Modifier.weight(0.2f),
                textAlign = TextAlign.Center,
                fontSize = 18.sp
            )
            Text(
                text = materia.cal2P.toString(),
                modifier = Modifier.weight(0.2f),
                textAlign = TextAlign.Center,
                fontSize = 18.sp
            )
            Text(
                text = materia.cal3P.toString(),
                modifier = Modifier.weight(0.2f),
                textAlign = TextAlign.Center,
                fontSize = 18.sp
            )
        }
        Column (
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp, top = 50.dp)
        ){
            Text(
                text = "Maestro: ",
                fontSize = 19.sp,
                modifier = Modifier.padding(start = 10.dp)
            )
            Text(
                materia.maestro,
                modifier = Modifier.padding(start = 20.dp, end = 20.dp, top = 5.dp),
                fontSize = 18.sp
            )
        }
        if(materia.promedio >= 6){
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .offset(y = (-50).dp)
                    .padding(horizontal = 24.dp, vertical = 100.dp)
                    .clip(RoundedCornerShape(16.dp))
                    .background(MaterialTheme.colorScheme.onPrimary)
                    .height(80.dp),
                contentAlignment = Alignment.Center
            ){
                Row {
                    Image(
                        imageVector = Check_circle,
                        contentDescription = "lock",
                        modifier = Modifier.padding(end = 5.dp).size(40.dp),
                        colorFilter = ColorFilter.tint(Color.Green)
                    )
                    Text(text = "Aprobada", fontSize = 20.sp, modifier = Modifier.align(Alignment.CenterVertically))
                }
            }
        }else{
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .offset(y = (-50).dp)
                    .padding(horizontal = 24.dp, vertical = 100.dp)
                    .clip(RoundedCornerShape(16.dp))
                    .background(MaterialTheme.colorScheme.onPrimary)
                    .height(80.dp),
                contentAlignment = Alignment.Center
            ){
                Row {
                    Image(
                        imageVector = ErrorIcon,
                        contentDescription = "lock",
                        modifier = Modifier.padding(end = 5.dp).size(40.dp),
                        colorFilter = ColorFilter.tint(Color.Red)
                    )
                    Text(text = "Reprobada", fontSize = 20.sp, modifier = Modifier.align(Alignment.CenterVertically))
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
fun MateriaDetailScreenPreview(){
    LaSalleAppTheme {
        MateriaDetailScreen(paddingValues = PaddingValues(0.dp), materiaId = 2)
    }
}
