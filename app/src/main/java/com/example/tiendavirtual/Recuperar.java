package com.example.tiendavirtual;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Recuperar extends AppCompatActivity {

    Button recuperar, volver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recuperar);

        recuperar = findViewById(R.id.btn10);
        volver = findViewById(R.id.btn11);
        recuperar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Recuperar.this, "Mensaje Enviado", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(Recuperar.this, Ingresar.class);
                startActivity(i);
            }
        });
        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Recuperar.this, Ingresar.class);
                startActivity(i);
            }
        });

    }
}