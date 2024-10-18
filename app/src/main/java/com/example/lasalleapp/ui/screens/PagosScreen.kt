package com.example.lasalleapp.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
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
import com.example.lasalleapp.utils.pagos

@Composable
fun PagosScreen(paddingValues: PaddingValues){
    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(paddingValues)
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
            text = "COLEGIATURAS",
            style = MaterialTheme.typography.titleMedium,
            fontSize = 30.sp,
            modifier = Modifier
                .padding(top = 10.dp, start = 30.dp, end = 30.dp)
                .align(Alignment.CenterHorizontally),
            textAlign = TextAlign.Center
        )
        LazyColumn (
            modifier = Modifier
                .fillMaxHeight()
                .padding(top = 10.dp)
        ){
            items(pagos.reversed()){ pago ->
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 24.dp, vertical = 8.dp)
                        .clip(RoundedCornerShape(16.dp))
                        .background(MaterialTheme.colorScheme.onPrimary)
                        .height(70.dp),
                    contentAlignment = Alignment.Center
                ){
                    Row {
                        if(pago.pago){
                            Image(
                                imageVector = Check_circle,
                                contentDescription = "lock",
                                modifier = Modifier
                                    .padding(end = 5.dp)
                                    .size(40.dp),
                                colorFilter = ColorFilter.tint(Color.Green)
                            )
                        }else{
                            Image(
                                imageVector = ErrorIcon,
                                contentDescription = "lock",
                                modifier = Modifier
                                    .padding(end = 5.dp)
                                    .size(40.dp),
                                colorFilter = ColorFilter.tint(Color.Red)
                            )
                        }
                        Text(
                            text = pago.mes,
                            fontSize = 20.sp,
                            modifier = Modifier.align(Alignment.CenterVertically)
                        )
                        Text(
                            text = pago.ano.toString(),
                            fontSize = 20.sp,
                            modifier = Modifier.align(Alignment.CenterVertically).padding(start = 6.dp)
                        )
                    }
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
fun PagosScreenPreview(){
    LaSalleAppTheme {
        PagosScreen(paddingValues = PaddingValues(0.dp))
    }
}