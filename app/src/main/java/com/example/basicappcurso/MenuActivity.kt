package com.example.basicappcurso

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val btnSaludo = findViewById<Button>(R.id.btnSaludo)

        btnSaludo.setOnClickListener{
            navigateToSaludApp(0)
        }
    }

    private fun navigateToSaludApp(idc:Int=0){
        when(idc){
            0 -> {
                val intent = Intent(this,BasicAppActivity::class.java)
                startActivity(intent)
            }
           else -> println("No se ha encontrado la actividad")
        }

    }
}