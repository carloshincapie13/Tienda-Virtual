package com.example.tiendavirtual;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Articulo extends AppCompatActivity {
    List<ListaElementos> elementos;
    Button inicio, carrito, buscar, configuracion;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_articulo);

        inicio = findViewById(R.id.btn2);
        carrito = findViewById(R.id.btn3);
        buscar = findViewById(R.id.btn4);
        configuracion = findViewById(R.id.btn5);

        init();


        inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Articulo.this, Articulo.class);
                startActivity(i);
            }
        });

        carrito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Articulo.this, Carrito.class);
                startActivity(i);
            }
        });


        buscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Articulo.this, "Ingrese Nombre de Artículo a Buscar", Toast.LENGTH_SHORT).show();
                /*Intent i = new Intent(Articulo.this, Carrito.class);
                startActivity(i);
            }
        });*/


            }
        });
        configuracion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Articulo.this, "Configurar Método de Pago", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(Articulo.this, Pagos.class);
                startActivity(i);
            }
        });
    }

    public void init(){
        elementos = new ArrayList<>();
        elementos.add(new ListaElementos("Pantalones", "M/F", "Disponible"));
        elementos.add(new ListaElementos("Zapatos", "M", "Agotado"));
        elementos.add(new ListaElementos("Top", "F", "Agotado"));
        elementos.add(new ListaElementos("Sudadera", "M/F", "Disponible"));

        ListAdapter ListAdapter = new ListAdapter(elementos, this);
        RecyclerView recyclerView =findViewById(R.id.ListRecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(ListAdapter);
    }


   /* public void Inicio(View view){
        Intent inicio= new Intent(this, Articulo.class);
        startActivity(inicio);
    }*/

}
