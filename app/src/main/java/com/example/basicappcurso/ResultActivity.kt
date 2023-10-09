package com.example.basicappcurso

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val tvResult = findViewById<TextView>(R.id.tvResult)
        val name: String = intent.extras?.getString("EXTRA_NAME").orEmpty() // ? para nulo, orEmpty para vacio

        tvResult.text = "Hola $name"
    }
}