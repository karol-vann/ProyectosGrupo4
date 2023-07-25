package com.example.proyectosgrupo4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class secion34 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secion34);

        int edad=20;
        double altura =2.70;
        boolean esEstudiante= true;
        String nombre="Oscar Daniel Briceño Escobar";

        TextView tvEdad=findViewById(R.id.tvedad);
        TextView tvatura=findViewById(R.id.tvaltura);
        TextView tvEstudiante=findViewById(R.id.tvestudiante);
        TextView tvNombre=findViewById(R.id.tvNombre);

        tvEdad.setText(edad);
        tvatura.setText(altura);
        tvEstudiante.setText(esEstudiante);
        tvNombre.setText(nombre);


    }
}