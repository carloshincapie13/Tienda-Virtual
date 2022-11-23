package com.example.tiendavirtual;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Carrito extends AppCompatActivity {

    Button  cancelar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carrito);

       // realizar = findViewById(R.id.btn16);
        cancelar = findViewById(R.id.btn17);

        /*realizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Carrito.this, Pagos.class);
                startActivity(i);
            }
        });*/

        cancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Carrito.this, Articulo.class);
                startActivity(i);
            }
        });
    }

    public void Realizar(View view){

        Intent btrealizar = new Intent(this, Pagos.class);
        startActivity(btrealizar);
    }
}