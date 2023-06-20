package com.example.ejercicio6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText textName;
        EditText textLastName;
        EditText textMail;
        EditText textPass;

       textName = findViewById(R.id.editTexPersonName);
       textLastName = findViewById(R.id.editTextPersonLastName);
       textMail = findViewById(R.id.editTextEmailAddress);
       textPass = findViewById(R.id.editTextPassword);


        Button button = findViewById(R.id.button);

        button.setOnClickListener(new  View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String name = textName.getText().toString();
                String lastname = textLastName.getText().toString();
                String email = textMail.getText().toString();
                String pass = textPass.getText().toString();
                if(name.isEmpty() || lastname.isEmpty() || email.isEmpty()|| pass.isEmpty()|| !email.contains("@")) {
                    Toast.makeText(getBaseContext(), "faltan campos por completar ", Toast.LENGTH_SHORT).show();
                    return;
                }

                String texto = "Usuario" + name + " " + lastname + " " + " Email" + email + "Contraseña" + pass;
                Toast.makeText(getBaseContext(),texto, Toast.LENGTH_LONG).show();
            }
        });
    }
}