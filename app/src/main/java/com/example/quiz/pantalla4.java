package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class pantalla4 extends AppCompatActivity {

    private Button finalizar;
    private CheckBox op1;
    private CheckBox op2;
    private CheckBox op3;
    private CheckBox op4;
    private CheckBox op5;
    private CheckBox op6;
    private CheckBox op7;
    private boolean fin;
    private int sintomas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla4);

        finalizar = findViewById(R.id.finalizar);
        op1 = findViewById(R.id.op1);
        op2 = findViewById(R.id.op2);
        op3 = findViewById(R.id.op3);
        op4 = findViewById(R.id.op4);
        op5 = findViewById(R.id.op5);
        op6 = findViewById(R.id.op6);
        op7 = findViewById(R.id.op7);
        fin = false;
        sintomas = 0;


        op1.setOnClickListener(
                (view) ->{
                    finalizar.setBackgroundColor(Color.rgb(240,24,86));
                    fin = true;
                    sintomas += 4;
                }
        );

        op2.setOnClickListener(
                (view) ->{
                    finalizar.setBackgroundResource(R.drawable.boton);
                    fin = true;
                    sintomas += 4;
                }
        );

        op3.setOnClickListener(
                (view) ->{
                    finalizar.setBackgroundResource(R.drawable.boton);
                    fin = true;
                    sintomas += 4;
                }
        );

        op4.setOnClickListener(
                (view) ->{
                    finalizar.setBackgroundResource(R.drawable.boton);
                    fin = true;
                    sintomas += 4;
                }
        );

        op5.setOnClickListener(
                (view) ->{
                    finalizar.setBackgroundResource(R.drawable.boton);
                    fin = true;
                    sintomas += 4;
                }
        );

        op6.setOnClickListener(
                (view) ->{
                    finalizar.setBackgroundResource(R.drawable.boton);
                    fin = true;
                    sintomas += 4;
                }
        );

        op7.setOnClickListener(
                (view) ->{
                    finalizar.setBackgroundResource(R.drawable.boton);
                    fin = true;
                    sintomas += 0;
                }
        );

        finalizar.setOnClickListener(
                (view) -> {
                    if(fin == true){
                        Intent d = new Intent(this, MainActivity.class);
                        //traje las variables de las demas pantallas

                        String nombre = getSharedPreferences("pantalla2", MODE_PRIVATE).getString("nombre", "");
                        String id = getSharedPreferences("pantalla2", MODE_PRIVATE).getString("id", "epa");
                        int nexo = getIntent().getExtras().getInt("nexo");
                        //estoy definiendo los string
                        String historial = getSharedPreferences("pantalla4", MODE_PRIVATE).getString("registro","");
                        String points = Integer.toString(sintomas+nexo);
                        //enviar a la pantalla 1
                        SharedPreferences preferences = getSharedPreferences("pantalla4", MODE_PRIVATE);
                        startActivity(d);
                        if (historial.contains(id)){
                            Toast.makeText(this, "id no disponible", Toast.LENGTH_SHORT).show();
                        }else{
                            String registro = historial+"/"+nombre+" "+id+" :"+points;
                            preferences.edit().putString("registro", registro).apply();
                            finish();
                        }

                    }
                }
        );
    }


}