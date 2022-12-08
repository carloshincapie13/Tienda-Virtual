package com.example.tiendavirtual;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ActivityTienda extends AppCompatActivity {


    private ImageView imagenArticulosInfo;
    private TextView txtNombreArticuloInfo, txtGeneroArticuloInfo, txtEstadoArticuloInfo, txtNumeroArticuloInfo;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_tienda);

        imagenArticulosInfo = findViewById(R.id.imagenArticuloInfo);
        txtNombreArticuloInfo = findViewById(R.id.txtNombreArticulo);
        txtGeneroArticuloInfo = findViewById(R.id.txtGeneroArticuloInfo);
        txtEstadoArticuloInfo = findViewById(R.id.txtEstadoArticuloInfo);
        //txtNumeroArticuloInfo = findViewById(R.id.txtNumeroArticuloInfo);



        imagenArticulosInfo.setImageResource(getIntent().getIntExtra("idImagen", 0));
        txtNombreArticuloInfo.setText(getIntent().getStringExtra("nombre"));
        txtGeneroArticuloInfo.setText(getIntent().getStringExtra("genero"));
        txtEstadoArticuloInfo.setText(getIntent().getStringExtra("estado"));
        //txtNumeroArticuloInfo.setText(getIntent().getStringExtra("nombre")+ " esta " +getIntent().getStringExtra("estado"));
    }
}