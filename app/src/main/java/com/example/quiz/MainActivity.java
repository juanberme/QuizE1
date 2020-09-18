package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button registrar;
    private TextView resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        registrar = findViewById(R.id.registrar);
        resultado = findViewById(R.id.resultado);
        resultado.setMovementMethod(new ScrollingMovementMethod());



        registrar.setOnClickListener(
                (view) -> {
                    Intent a = new Intent(this, pantalla2.class);
                    startActivity(a);
                }
        );
    }

    protected void onResume() {
        super.onResume();
        String registro = getSharedPreferences("pantalla4", MODE_PRIVATE).getString("registro", " ") ;

        String [] lista = registro.split("/");
        resultado.setText("");
        for (int i = 0; i < lista.length; i++){
            resultado.append(lista[i] + "\n");
        }
    }
}