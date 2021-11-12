package com.example.parcial2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var tv_Mostrar : TextView
    private lateinit var lv_Lista : ListView

    private val mascota = arrayOf("Pastor Alemán","Gato Angora","Pez Ángel")
    private val especie = arrayOf("Canino","Felino","Pterophyllu´m")
    private val color = arrayOf("cafe y negro","blanco","anaranjado")
    private val sexo = arrayOf("hembra","macho","hembra")
    private val peso = arrayOf("50kg","20kg","5g")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv_Mostrar = findViewById(R.id.tv_Mostrar)
        lv_Lista = findViewById(R.id.lv_Lista)

        val adaptador = ArrayAdapter(this, android.R.layout.simple_list_item_1, mascota)
        lv_Lista.adapter = adaptador

        lv_Lista.setOnItemClickListener { adapterView, view, i, l ->
            tv_Mostrar.setText("Mascota: " +lv_Lista.getItemAtPosition(i)+" es un "+especie[i]+" de color "+color[i]+
                    ", sexo: "+sexo[i]+", con un peso promedio de: "+peso[i])
        }
    }
}