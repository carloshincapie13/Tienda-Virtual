package com.example.tiendavirtual;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Registro extends AppCompatActivity {
    private EditText et1Correo, et2ConfirmarCorreo, et3NombreUsuario, et4Password, et5ConfirmarPassword;
    private FirebaseAuth firebaseAuth;

    Button crear,cancelar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        firebaseAuth =FirebaseAuth.getInstance();
        et1Correo = findViewById(R.id.et1);
        et2ConfirmarCorreo = findViewById(R.id.et2);
        et3NombreUsuario = findViewById(R.id.et3);
        et4Password = findViewById(R.id.et4);
        et5ConfirmarPassword = findViewById(R.id.et5);

        /*crear = findViewById(R.id.btn8);
        cancelar = findViewById(R.id.btn9);
        cancelar.setOnClickListener(new View.OnClickListener() */



        crear.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String correo = et1Correo.getText().toString();
                String confirmarCorreo = et2ConfirmarCorreo.getText().toString();
                String NombreUsuario = et3NombreUsuario.getText().toString();
                String Password = et4Password.getText().toString();
                String ConfirmarPasword = et4Password.getText().toString();

                firebaseAuth.signInWithEmailAndPassword(correo, confirmarCorreo).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            Toast.makeText(Registro.this, "Usuario creado", Toast.LENGTH_SHORT).show();

                            Intent i = new Intent(Registro.this, Ingresar.class);
                            startActivity(i);
                        }
                    }

                });

            }
        });
    }
}





