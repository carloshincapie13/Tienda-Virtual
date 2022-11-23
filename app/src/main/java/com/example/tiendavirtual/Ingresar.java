package com.example.tiendavirtual;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Ingresar extends AppCompatActivity {

    private EditText Id, contras;
    private TextView registro, olvidar;
    Button salir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingresar);
        Id = findViewById(R.id.et);
        contras = findViewById(R.id.etp);
        registro = findViewById(R.id.tv3);
        registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ingresar.this, Registro.class);
                startActivity(i);
            }
        });
        olvidar = findViewById(R.id.tvo);
        olvidar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ingresar.this, Recuperar.class);
                startActivity(i);
            }
        });
        salir = findViewById(R.id.btn7);
        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);

                /*finish();*/
            }
        });
    }

    public void validar (View view){
        String usuario = Id.getText().toString();
        String clave = contras.getText().toString();

        if (usuario.equals("admin")&& clave.equals("123456")){
            Intent i = new Intent(this, Articulo.class );
            startActivity(i);
        }else{
            Toast mensaje = Toast.makeText(this,"Datos Incorrectos", Toast.LENGTH_LONG);
            mensaje.show();
        }
    }

    /*public void Salir(View view){


        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }*/
}