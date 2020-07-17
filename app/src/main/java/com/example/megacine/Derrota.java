package com.example.megacine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Derrota extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_derrota);

    }
    public void Regresar(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);

}
    public void jugarDenuevo(View view){
        Intent intent2 = new Intent(this,Juego.class);
        startActivity(intent2);
    }
}