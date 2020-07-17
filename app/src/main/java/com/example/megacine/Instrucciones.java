package com.example.megacine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Instrucciones extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instrucciones);
    }
    public void iniciarJuego(View v){
        startActivity(new Intent(this,Juego.class));
    }
    public void menuPrincipal(View v){
        startActivity(new Intent(this,MainActivity.class));
    }
}