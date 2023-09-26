package com.example.calculadoradevolumengeometrico

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_layout)

        val prismActionBtn = findViewById<Button>(R.id.btnPrism)
        val sphereActionBtn = findViewById<Button>(R.id.btnSphere)
        val cylinderActionBtn = findViewById<Button>(R.id.btnCylinder)
        val circularActionBtn = findViewById<Button>(R.id.btnCircularCone)
        val pyramidActionBtn= findViewById<Button>(R.id.btnPyramid)

        sphereActionBtn.setOnClickListener{
            val intent = Intent(this, SphereActivity::class.java)
            startActivity(intent)
        }

        cylinderActionBtn.setOnClickListener{
            val intent = Intent(this, CylinderActivity::class.java)
            startActivity(intent)
        }

        circularActionBtn.setOnClickListener{
            val intent = Intent(this, ConeCircularActivity::class.java)
            startActivity(intent)
        }

        pyramidActionBtn.setOnClickListener{
            val intent = Intent(this, PyramidActivity::class.java)
            startActivity(intent)
        }

        prismActionBtn.setOnClickListener {
            val intent = Intent(this, PrismActivity::class.java)
            startActivity(intent)
        }

    }
}