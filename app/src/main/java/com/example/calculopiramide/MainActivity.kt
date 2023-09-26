package com.example.calculopiramide

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.calculopiramide.ui.theme.CalculoPiramideTheme
import androidx.compose.ui.Alignment


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalculoPiramideTheme {
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    PiramideVolumeCalculator()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PiramideVolumeCalculator() {
    var base by remember { mutableStateOf("") }
    var height by remember { mutableStateOf("") }
    var result by remember { mutableStateOf<String?>(null) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {


        OutlinedTextField(
            value = base,
            onValueChange = { base = it },
            label = { Text("Base (m^2)") }
        )

        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(
            value = height,
            onValueChange = { height = it },
            label = { Text("Height (m)") }
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {
            val volume = (1.0 / 3.0) * (base.toDoubleOrNull() ?: 0.0) * (height.toDoubleOrNull() ?: 0.0)
            result = "Volume: $volume m^3"
        }) {
            Text("Calculate Volume")
        }

        Spacer(modifier = Modifier.height(16.dp))

        result?.let {
            Text(it)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PiramideVolumeCalculatorPreview() {
    CalculoPiramideTheme {
        PiramideVolumeCalculator()
    }
}
