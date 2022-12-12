package com.example.tiendavirtual;

import static android.content.ContentValues.TAG;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Ingresar extends AppCompatActivity {

    private EditText Id, contras;
    private TextView registro, olvidar;
    private FirebaseAuth mAuth;
    Button salir,ingresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingresar);
        Id = findViewById(R.id.id);
        contras = findViewById(R.id.contras);
        registro = findViewById(R.id.tv3);
        // Initialize Firebase Auth
        mAuth = FirebaseAuth.getInstance();

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



        ingresar = findViewById(R.id.btn6);
        ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String usuario = Id.getText().toString();
                String clave = contras.getText().toString();

                if (usuario.equals("") || clave.equals("")){
                    Toast mensaje = Toast.makeText(Ingresar.this,"ingrese correo y contraseña", Toast.LENGTH_LONG);
                    mensaje.show();

                }else{


                   signIn(usuario,clave);



                    //Toast mensaje = Toast.makeText(Ingresar.this,"Datos Incorrectos", Toast.LENGTH_LONG);
                    //mensaje.show();
                }

            }
        });



    }

    public void signIn(String usuario, String clave){
        //String usuario = Id.getText().toString();
        //String clave = contras.getText().toString();
        mAuth = FirebaseAuth.getInstance();

        mAuth.signInWithEmailAndPassword(usuario,clave).addOnCompleteListener(Ingresar.this, new OnCompleteListener<AuthResult>() {

                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {


                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            Log.d(TAG, "signInWithEmail:success");
                            FirebaseUser user = mAuth.getCurrentUser();
                            updateUI(user);
                            Intent i = new Intent(Ingresar.this, Articulo.class );
                            startActivity(i);

                        } else {
                            // If sign in fails, display a message to the user.
                            Log.w(TAG, "signInWithEmail:failure", task.getException());
                            Toast.makeText(Ingresar.this, "Authentication failed.", Toast.LENGTH_SHORT).show();
                            updateUI(null);
                        }

                    }
                });
    }

    private void updateUI(FirebaseUser user) {

    }


    }
