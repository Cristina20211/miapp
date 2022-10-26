package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class Detalles : AppCompatActivity() {
    lateinit var LvimageFoto:ImageView
    lateinit var tv_Nombre:TextView
    lateinit var tv_Departamento:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalles)
        LvimageFoto=findViewById(R.id.LvImageFoto)
        tv_Nombre=findViewById(R.id.tv_Nombre)
        tv_Departamento=findViewById(R.id.tv_Departamento)



        val bundle:Bundle=getIntent().getExtras()!!
        LvimageFoto.setImageResource(bundle.getInt("imagen"))
        tv_Nombre.setText(bundle.getString("nombre"))
        tv_Departamento.setText(bundle.getString("departamento"))



    }
}