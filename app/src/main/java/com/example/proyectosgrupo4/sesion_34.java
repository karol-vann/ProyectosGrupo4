package com.example.proyectosgrupo4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class sesion_34 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sesion_34);

        int edad=36;
        double altura =1.70;
        boolean esEstudiante= true;
        String nombre="Nicolas Fiquitiva Segura";

        TextView twEdad=findViewById(R.id.twEdad);
        TextView twAltura=findViewById(R.id.twAltura);
        TextView twEsEstudiante=findViewById(R.id.twEsEstudiante);
        TextView twNombre=findViewById(R.id.twNombre);
        TextView twComparacion=findViewById(R.id.twComparacion);

        String comparacion;
        if ((edad-1)==((altura-1)*50)){
            comparacion="Verdadero";
        }
        else {
            comparacion="Falso";
        }

        twEdad.setText("Edad:"+edad);
        twAltura.setText("Altura:"+altura);
        twEsEstudiante.setText("Es Estudiante:"+esEstudiante);
        twNombre.setText("Nombre:"+nombre);
        twComparacion.setText("Edad vs Altura:"+comparacion);
    }
}