package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RecibirInformacion extends AppCompatActivity {
    Button btnRegresar2, btnSalir2;
    TextView nombre2, fecha2;
    String nombreSend=null, fechaSend=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recibir_informacion);

        btnRegresar2 = findViewById(R.id.btnRegresar2);
        btnSalir2 = findViewById(R.id.btnSalir2);
        nombre2 = findViewById(R.id.txtNombre);
        fecha2 = findViewById(R.id.txtFecha);

        Bundle bundle = getIntent().getExtras();

        nombreSend = bundle.getString("nombre");
        fechaSend = bundle.getString("fecha");

        nombre2.setText(nombreSend);
        fecha2.setText(fechaSend);

        btnRegresar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent act2 = new Intent(RecibirInformacion.this, EnviarInformacion.class);
                startActivity(act2);
            }
        });

        btnSalir2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}