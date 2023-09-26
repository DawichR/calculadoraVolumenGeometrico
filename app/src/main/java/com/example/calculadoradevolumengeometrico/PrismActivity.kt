package com.example.calculadoradevolumengeometrico

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
import kotlin.math.pow

class PrismActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.prism_layout)

        // Calculator
        val btnCalculateActBtn = findViewById<Button>(R.id.btnCalculatePrism)
        btnCalculateActBtn.setOnClickListener{
            val PI = Math.PI
            val textFieldBase = findViewById<EditText>(R.id.txtBase).text.toString()
            val textFieldHeight = findViewById<EditText>(R.id.txtHeight).text.toString()
            val textFieldProfundity = findViewById<EditText>(R.id.txtProfundity).text.toString()

            if(textFieldBase.isNotEmpty() && textFieldHeight.isNotEmpty() && textFieldProfundity.isNotEmpty()){
                val base = textFieldBase.toDouble()
                val height = textFieldHeight.toDouble()
                val profundity = textFieldProfundity.toDouble()
                val volume = "%.2f".format(base * height * profundity)
                val result = findViewById<TextView>(R.id.txtResult)

                result.text = "El volumen del Prisma es ${volume.toString()}"
            }
        }
    }
}
