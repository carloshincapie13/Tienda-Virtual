package com.example.tiendavirtual;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Metodo extends AppCompatActivity {

    Button comprar, cancelar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metodo);

        comprar.findViewById(R.id.btn18);
        cancelar.findViewById(R.id.btn19);

        comprar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Metodo.this, "Comprar Exitosa", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(Metodo.this, Articulo.class);
                startActivity(i);
            }
        });

        cancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Metodo.this, Carrito.class);
                startActivity(i);
            }
        });
    }
}