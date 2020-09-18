package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class pantalla2 extends AppCompatActivity {

    private EditText nombre;
    private EditText id;
    private Button continuar1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2);

        nombre = findViewById(R.id.nombre);
        id = findViewById(R.id.id);
        continuar1 = findViewById(R.id.continuar1);

        continuar1.setOnClickListener(
                (view) -> {
                    String name = nombre.getText().toString();
                    String idd = id.getText().toString();
                    SharedPreferences preferences = getSharedPreferences("pantalla2", MODE_PRIVATE);
                    preferences.edit().putString("nombre", name).apply();
                    preferences.edit().putString("id", idd).apply();
                    Intent b = new Intent(this, pantalla3.class);
                    startActivity(b);
                    finish();
                }
        );
    }
}