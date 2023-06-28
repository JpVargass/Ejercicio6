package com.example.ejercicio6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.ejercicio6.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding =ActivityMainBinding.inflate(getLayoutInflater());

       setContentView(binding.getRoot());




        binding.button.setOnClickListener(new  View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String name = binding.editTexPersonName.getText().toString();
                String lastname = binding.editTextPersonLastName.getText().toString();
                String email = binding.editTextEmailAddress.getText().toString();
                String pass = binding.editTextPassword.getText().toString();
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