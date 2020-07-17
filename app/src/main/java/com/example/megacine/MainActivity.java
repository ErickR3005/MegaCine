package com.example.megacine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button empezarJuego=findViewById(R.id.btn_empezar);
    Button instruccion=findViewById(R.id.btn_info);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void empezarJuego(View v){
        startActivity(new Intent(this,Juego.class));
    }
    public void comoJugar(View v){
        startActivity(new Intent(this,Instrucciones.class));
    }
}