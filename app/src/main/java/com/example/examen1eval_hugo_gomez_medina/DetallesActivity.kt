package com.example.examen1eval_hugo_gomez_medina

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetallesActivity : AppCompatActivity() {

    val tituloGenerico = "Ejemplo de titulo"
    val contenidoGenerico = "Aquí se mostrará el contenido de la noticia"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalles)

        val titulo = findViewById<TextView>(R.id.titulo_noticia)
        val contenido = findViewById<TextView>(R.id.contenido_noticia)

        titulo.text = tituloGenerico
        contenido.text = contenidoGenerico
    }




}