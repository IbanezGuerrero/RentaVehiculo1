package com.example.RentadeCarros;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Main extends AppCompatActivity {
    Button siguiente1;
    EditText usuario, password;
    String elusario1, elpass1;
    private FirebaseAuth mAuth;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        usuario = findViewById(R.id.edtUsuario1);
        password = findViewById(R.id.edtPassword1);
        siguiente1 = findViewById(R.id.btnBuscarO);

        siguiente1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                elusario1 = usuario.getText().toString().trim();
                elpass1 = password.getText().toString().trim();
                if (!elusario1.isEmpty()){
                    if (!elpass1.isEmpty()){
                        if (elusario1.equalsIgnoreCase("admin")&& elpass1.equals("1234")){
                            Intent irMenu = new Intent(getApplicationContext(),MainActivity.class);
                            //irAdmin.putExtra("usuario1",elusario1);
                            // startActivityForResult(irAdmin,1);
                            Intent irMainMenu;
                            startActivity(irMenu);

                        }else {
                            usuario.setText("");
                            password.setText("");
                            usuario.requestFocus();
                            Toast.makeText(getApplicationContext(),"Usuario O Contra;a Incorrecta",Toast.LENGTH_LONG).show();
                        }
                    }else {
                        password.setError("Campo Requerido");
                        password.requestFocus();
                    }
                }else {
                    usuario.setError("Campo Requerido");
                    usuario.requestFocus();
                    password.setText("");
                }
            }
        });

    }



}