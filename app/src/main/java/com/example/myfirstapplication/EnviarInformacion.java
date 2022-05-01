package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class EnviarInformacion extends AppCompatActivity {

    Button enviar;
    TextView nombre, fecha;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enviar_informacion);

        enviar = findViewById(R.id.btnEnviar);
        nombre = findViewById(R.id.txtName);
        fecha = findViewById(R.id.txtDate);

        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent act2 = new Intent(EnviarInformacion.this, RecibirInformacion.class );
                act2.putExtra("nombre",nombre.getText().toString());
                act2.putExtra("fecha",fecha.getText().toString());

                startActivity(act2);
            }
        });

    }
}