package com.example.lasalleapp.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lasalleapp.utils.pagos

@Composable
fun PagoDetailScreen(paddingValues: PaddingValues, pagoId: Int) {
    val pago = pagos.first { it.id == pagoId }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(paddingValues)
            .padding(24.dp)
            .background(MaterialTheme.colorScheme.background)
    ) {
        // Header de la Colegiatura
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(150.dp)
                .background(MaterialTheme.colorScheme.primary, shape = RoundedCornerShape(8.dp))
                .padding(16.dp)
        ) {
            Column {
                Text(
                    text = pago.mes.uppercase(),
                    color = Color.White,
                    fontSize = 35.sp
                )
                Text(
                    text = "${pago.ano}",
                    color = Color.White,
                    fontSize = 30.sp
                )
            }
        }

        Spacer(modifier = Modifier.height(24.dp))

        // Detalles
        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(8.dp)
        ) {
            Column(modifier = Modifier.padding(16.dp)) {
                DetailItem(label = "Monto", value = "$${pago.monto}")
                Divider(modifier = Modifier.padding(vertical = 8.dp))

                DetailItem(
                    label = "Estado del Pago",
                    value = if (pago.pago) "Pagado" else "Pendiente",
                    color = if (pago.pago) Color(0xFF4CAF50) else Color(0xFFF44336)
                )
                Divider(modifier = Modifier.padding(vertical = 8.dp))

                DetailItem(label = "Último Día para Pagar", value = pago.ultimoDiaParaPagar)
            }
        }
    }
}

@Composable
fun DetailItem(label: String, value: String, color: Color = Color.Black) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(text = label, color = Color.Gray)
        Text(text = value, color = color)
    }
}
