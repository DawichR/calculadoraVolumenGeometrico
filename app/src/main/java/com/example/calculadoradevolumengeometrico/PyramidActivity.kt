package com.example.calculadoradevolumengeometrico

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
import kotlin.math.pow

class PyramidActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pyramid_layout)

        // Calculator
        val btnCalculateActBtn = findViewById<Button>(R.id.btnCalculatePyramid)
        btnCalculateActBtn.setOnClickListener {
            val PI = Math.PI
            val textFieldBase = findViewById<EditText>(R.id.txtBase).text.toString()
            val textFieldHeight = findViewById<EditText>(R.id.txtHeight).text.toString()

            if (textFieldBase.isNotEmpty() && textFieldHeight.isNotEmpty()) {
                val base = textFieldBase.toDouble()
                val height = textFieldHeight.toDouble()
                val constant = (1.0/3.0)
                val volume = "%.2f".format(constant * base * height) // 1/3 * b * h
                val result = findViewById<TextView>(R.id.txtResult)

                result.text = "El volumen de la piramide es ${volume.toString()}"
            }
        }
    }
}