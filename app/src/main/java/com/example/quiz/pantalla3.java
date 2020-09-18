package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.CheckBox;

public class pantalla3 extends AppCompatActivity {

    private Button continuar2;
    private CheckBox check1;
    private CheckBox check2;
    private CheckBox check3;
    private CheckBox check4;
    private CheckBox check5;
    private boolean seguir;
    private int nexo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla3);

        continuar2 = findViewById(R.id.continuar2);
        check1 = findViewById(R.id.check1);
        check2 = findViewById(R.id.check2);
        check3 = findViewById(R.id.check3);
        check4 = findViewById(R.id.check4);
        check5 = findViewById(R.id.check5);
        seguir = false;
        nexo = 0;

        check1.setOnClickListener(
                (view) -> {
                    continuar2.setBackgroundResource(R.drawable.boton);
                    seguir = true;
                    nexo += 3;
                }
        );

        check2.setOnClickListener(
                (view) ->{
                    continuar2.setBackgroundResource(R.drawable.boton);
                    seguir = true;
                    nexo += 3;
                }
        );

        check3.setOnClickListener(
                (view) ->{
                    continuar2.setBackgroundResource(R.drawable.boton);
                    seguir = true;
                    nexo += 3;
                }
        );

        check4.setOnClickListener(
                (view) ->{
                    continuar2.setBackgroundResource(R.drawable.boton);
                    seguir = true;
                    nexo += 3;
                }
        );

        check5.setOnClickListener(
                (view) -> {
                    continuar2.setBackgroundResource(R.drawable.boton);
                    seguir = true;
                    nexo += 0;
                }
        );


        continuar2.setOnClickListener(
                (view) -> {
                    if(seguir == true){
                        Intent c = new Intent(this, pantalla4.class);
                        c.putExtra("nexo", nexo);
                        startActivity(c);
                        finish();
                        //Log.e("hola", "valor :"+nexo);
                    }

                }
        );
    }
}