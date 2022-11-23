package com.example.tiendavirtual;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Pagos extends AppCompatActivity {

    Button comprar, cancelar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagos);

     /*   comprar.findViewById(R.id.btn15);
        cancelar.findViewById(R.id.btn14);

        comprar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Pagos.this, "Compra Exitosa", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(Pagos.this, Articulo.class);
                startActivity(i);
            }
        });

        cancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Pagos.this, Carrito.class);
                startActivity(i);
            }
        });*/
    }


   public void Comprar(View view){
       Toast.makeText(this, "Compra Exitosa", Toast.LENGTH_SHORT).show();
        Intent comprar= new Intent(this, Articulo.class);
        startActivity(comprar);
    }

    public void Cancelar(View view){
        Intent cancelar= new Intent(this, Carrito.class);
        startActivity(cancelar);
    }
}